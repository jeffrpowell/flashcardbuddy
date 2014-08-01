/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeffrpowell.flashcards.controller;

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
    
    public void addButtonClicked(){
        view.showNewDeckPanel();
    }
    
    public void editButtonClicked(){
        view.showEditDeckPanel();
    }
    
    public void runButtonClicked(){
        view.showRunDeckPanel();
    }
    
    public void addNewFlashcardButtonClicked(FlashCard card){
        model.addNewFlashcard(card);
    }
    
    public void saveNewDeck(String name){
        model.saveNewDeck(name);
    }
}
