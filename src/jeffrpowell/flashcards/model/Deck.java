package jeffrpowell.flashcards.model;

import java.util.List;

public class Deck {
    private List<FlashCard> deck;
    private String name;

    public Deck(String name, List<FlashCard> deck) {
        this.deck = deck;
        this.name = name;
    }

    public List<FlashCard> getDeck() {
        return deck;
    }

    public void setDeck(List<FlashCard> deck) {
        this.deck = deck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
