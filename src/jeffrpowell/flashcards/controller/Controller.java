/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffrpowell.flashcards.controller;

import java.awt.event.ItemEvent;
import java.util.List;
import jeffrpowell.flashcards.model.Deck;
import jeffrpowell.flashcards.model.FlashCard;
import jeffrpowell.flashcards.model.Model;
import jeffrpowell.flashcards.view.Flashcards;

/**
 *
 * @author Jeff
 */
public class Controller {

    private final Flashcards view;
    private final Model model;

    public Controller(Flashcards view) {
        this.view = view;
        this.model = new Model();
    }

    public void addButtonClicked() {
        model.swapTabs();
        view.showNewDeckPanel();
    }

    public void editButtonClicked() {
        model.swapTabs();
        view.showEditDeckPanel();
    }

    public void runButtonClicked() {
        model.swapTabs();
        view.showRunDeckPanel();
    }

    public void addNewFlashcardButtonClicked(FlashCard card) {
        model.addNewFlashcard(card);
    }

    public void saveNewDeck(String name) throws IllegalArgumentException{
        model.saveNewDeck(name);
    }

    public void persistBeforeClosing() {
        model.persistData();
    }

    public List<String> getDeckNames() {
        return model.getDeckNames();
    }

    public Deck deckSelectItemChanged(ItemEvent e) {
        if (!e.getItem().toString().equals("Choose a deck...")) {
            return model.getDeck(e.getItem().toString());
        }
        return null;
    }
	
	public void editPromptFocusLost(Deck loadedDeck, int index, String text){
		if (loadedDeck != null)
			model.alterFlashcardPrompt(loadedDeck, index, text);
	}
	
	public void editAnswerFocusLost(Deck loadedDeck, int index, String text){
		if (loadedDeck != null)
			model.alterFlashcardAnswer(loadedDeck, index, text);
	}
}
