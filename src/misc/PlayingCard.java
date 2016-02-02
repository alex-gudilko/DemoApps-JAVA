// A class that allows manual creation of a single playing card of specified rank and suit.
// Class also provides methods to 
// - check a number of manually created cards within this class
// - print card value (rank, suit) 

package misc;

public class PlayingCard {
	
		String rank;
		String suit;
		private static int numberOfCards = 0;
//		public final int START_CARD = 6;
		
		
		// constructor to create a single card
		public PlayingCard(String suit, String rank){
			this.rank = rank;
			this.suit = suit;
			numberOfCards++;
		}
		
		// get a number of cards in deck
		public static int getNumberOfCards(){
			return numberOfCards;
		}
		
		
		public void printCardValue(){
			System.out.println("Card is " + rank + " " + suit);
		}
}




