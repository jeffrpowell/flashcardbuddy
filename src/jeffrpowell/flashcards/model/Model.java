/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeffrpowell.flashcards.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jeff
 */
public class Model {
    private class ShortTermStore{
        private List<FlashCard> flashcards;
        
        public ShortTermStore(){
            cleanStorage();
        }
        
        private void addNewFlashcard(FlashCard flashcard){
            flashcards.add(flashcard);
        }
        
        private Deck pullOutDeck(String name){
            Deck d = new Deck(name, flashcards);
            flashcards = new ArrayList<>();
            return d;
        }
        
        private void cleanStorage(){
            flashcards = new ArrayList<>();
        }
    }
    
    private List<Deck> decks;
    private final ShortTermStore tempStore;
    
    public Model(){
		//Attempt to load persistent data
		File dataFile = getDataFile(false);
		
		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(dataFile)))
		{
			decks = (List<Deck>) in.readObject();
			in.close();
		}
		catch (ClassNotFoundException | IOException e){
			decks = new ArrayList<>();
		}
        tempStore = new ShortTermStore();
    }
    
    public void addNewFlashcard(FlashCard card){
        tempStore.addNewFlashcard(card);
    }
    
    public void saveNewDeck(String name){
        decks.add(tempStore.pullOutDeck(name));
    }
	
	public List<String> getDeckNames(){
		List<String> deckNames = new ArrayList<>();
		for (Deck deck : decks)
		{
			deckNames.add(deck.getName());
		}
		return deckNames;
	}
	
	public void swapTabs(){
		tempStore.cleanStorage();
	}
	
	public Deck getDeck(String name){
		for (Deck deck : decks)
		{
			if (deck.getName().equals(name)){
				return deck;
			}
		}
		return null;
	}
	
	/**
	 * 
	 * @return null if everything works fine. A string message describing the error otherwise.
	 */
	public String persistData(){
		File dataFile = getDataFile(true);
		
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(dataFile)))
		{
			out.writeObject(decks);
		}
		catch (IOException e){
			return "There was a problem saving your flashcards to a file.";
		}
		return null;
	}
	
	private File getDataFile(boolean saving){
		//http://stackoverflow.com/questions/15808360/serialized-files-dont-work-when-project-is-converted-to-executable-jar
		String home = System.getenv("APPDATA");
		if (home == null || home.equals("")) {
			home = System.getProperty("user.home");
		}
		File CONFIG_HOME = new File(home, ".FlashcardBuddy").getAbsoluteFile();
		if (saving){
			try{
				CONFIG_HOME.mkdirs();
			}
			catch (SecurityException e){
				return null;
			} 
		}
		return new File(CONFIG_HOME, "flashcard.decks");
	}
}
