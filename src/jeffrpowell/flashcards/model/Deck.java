package jeffrpowell.flashcards.model;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Deck implements Serializable{
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

	@Override
	public int hashCode()
	{
		int hash = 3;
		hash = 23 * hash + Objects.hashCode(this.name);
		return hash;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null)return false;
		if (getClass() != obj.getClass())return false;
		final Deck other = (Deck) obj;
		return Objects.equals(this.name, other.name);
	}
}
