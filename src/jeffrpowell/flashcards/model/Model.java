/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jeffrpowell.flashcards.model;

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
    private ShortTermStore tempStore;
    
    public Model(){
        decks = new ArrayList<>();
        tempStore = new ShortTermStore();
    }
    
    public void addNewFlashcard(FlashCard card){
        tempStore.addNewFlashcard(card);
    }
    
    public void saveNewDeck(String name){
        decks.add(tempStore.pullOutDeck(name));
    }
}
