// Demo program to create a deck of cards using a class DeckOfPlayingCards.java

package misc;

public class PlayingCardsDemo {

	public static void main(String[] args) {

		// create a deck of cards. 
		// Integer argument sets a first card in each suit (2 or 6)
		// and therefore defines deck size 36 or 52 cards.		
		System.out.println("Create a deck of cards: ");
		DeckOfPlayingCards myDeck = new DeckOfPlayingCards(2);
		
		System.out.println("Created deck contains " + myDeck.getDeckSize() + " cards");
	}

}
