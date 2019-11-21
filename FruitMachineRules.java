//Caine Simpson 2138307

import java.util.Random;

/*Class constituting the 'model' behind the FruitMachine game. 
 * This is where the cards are generated and compared, the balance is updated, 
 * and the win conditions are defined. */
public class FruitMachineRules {	
	// balance represents the players' points (< 0 = lose; > 150 = win)
	private int balance;
	
	//This array holds the names of the possible cards that could be played
	private String[] cards = {"Ace","King","Queen","Jack","Joker"};
	

//Constructor
	public FruitMachineRules() {
		// Initial balance is 100
		balance = 100;
	}


// Method to generate a random set of 3 cards and return them as an array of Strings
	public String[] getRandomCardSet() {
		Random r = new Random();
		int randomCardIndex;
		String[] randomCardSet = new String[3];// Creating a String array of size 3
		
		// Filling the array with random values copied from the String array class attribute 'cards'
		for(int i = 0; i<randomCardSet.length; i++) {
			randomCardIndex = r.nextInt(cards.length);
			randomCardSet[i] =  cards[randomCardIndex];
		}
		
		return randomCardSet;
		
	}


/* Checks an array of Strings (or cards) for jokers or pairs/3 of a kind.
 * Returns a negative count if a joker(s) was found; positive otherwise */
	public int checkCardSet(String[] cardSet) {
		int jokerCount = 0;
		int snapCount = 0;
		
		//Checking for jokers
		for(int i = 0; i<3; i++) {
			if(cardSet[i].equals("Joker"))
				jokerCount--;		
		}
		
		// Checking for 3 of a kind
		if(cardSet[0].equals(cardSet[1])&&cardSet[1].equals(cardSet[2]))
			snapCount = 2;
		
		// Checking for a pair
		else if(cardSet[0].equals(cardSet[1])||cardSet[0].equals(cardSet[2])||cardSet[1].equals(cardSet[2]))
			snapCount = 1;
	
		// If no jokers were found...
		if(jokerCount == 0)
			return snapCount;// ...the amount of duplicates (snapCount, positive) is returned...
		else
			return jokerCount;// ...Otherwise jokerCount (negative) is returned.
		
	}

	
// Takes in an integer which represents an amount of duplicate cards/ jokers, updates balance accordingly	
	public void updateBalance(int checkDupes) {
		
		if(checkDupes<0)// Jokers
			balance += (checkDupes*25);	
		if(checkDupes == 1)// A pair
			balance+=20;
		if(checkDupes == 2)// 3 of a kind
			balance+=50;		 			
	}
	

// Checks if balance is within the allowed range for gameplay (>0<150)
	public int checkWinState() {
		
		if(balance>=150)
			return 1;// A win returns positive
		
		if(balance<0)
			return -1;// A lose returns negative
		
		return 0;// Anything else returns 0;
	}
	
// Getter for balance to be used by ButtonPanel and MainPanel
	public int getBalance() {
		return balance;
	}
	
}
