// Following class allows creation of a deck of playing cards.
// Deck size if configurable.
// DeckOfPlayingCards uses "class PlayingCard.java"

package misc;

public class DeckOfPlayingCards {

	private int deckSize;
	private int actualDeckSize = 0;
	private String[] cardSuit = {"Hearts", "Diamonds", "Clubs", "Spades"};
	private String[] cardRank = {"2", "3", "4", "5", "6", "7", "8", "9",
								"10", "Jack", "Queen", "King", "Ace"};
	
	//constructor for deck instances
	public DeckOfPlayingCards(int startCardNumber){
		
		deckSize = (15-startCardNumber)*4; // calculate deckSize value	
		
		PlayingCard[] myDeck = new PlayingCard[deckSize]; // create array of deckSize value
		System.out.println("Array length is " + myDeck.length);	// check array length	
		
		// create new array and fill it with cards
		for (int i=0, j=0, k=startCardNumber-2; i<deckSize; i++){
			
			actualDeckSize++; // indicates a current number of cards in the deck
					
			// create a new card
			myDeck[i] = new PlayingCard(cardSuit[j], cardRank[k]);
			System.out.println("Created card " + myDeck[i].suit + " " + myDeck[i].rank);
			
			// switch to next suit when all cards all current suit were created
			if (j<cardSuit.length-1) {
				j=actualDeckSize/(deckSize/4);
			}
			
			// create all card ranks from initial card to last card in sequence
			if (k<cardRank.length-1) {
				k++;
			} else {
				k=startCardNumber-2;	// start naming cards with selected number again
			}
		}
		
		System.out.println("Current deck size is " + actualDeckSize
				+ ", Target size is " + deckSize);	
	}
	
	// check a number of cards in deck
	public int getDeckSize(){
		return deckSize;
	}	
	
}
