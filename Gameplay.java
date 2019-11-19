
//Caine Simpson 2138307
import java.util.Random;

public class Gameplay {
	private int balance;

	public Gameplay() {
		balance = 150;
	}
	
	public int getBalance() {
		return balance;
	}

	public String[] getRandomCardSet() {
		Random r = new Random();
		String[] randomCardSet = new String[3];
		for(int i = 0; i< randomCardSet.length; i++) {
			int randomInt = r.nextInt(5);
			
			if (randomInt == 0)
				randomCardSet[i] = "Ace";
			if (randomInt == 1)
				randomCardSet[i] = "King";
			if (randomInt == 2)
				randomCardSet[i] = "Queen";
			if (randomInt == 3)
				randomCardSet[i] = "Jack";
			if (randomInt == 4)
				randomCardSet[i] = "Joker";
		}
		return randomCardSet;
	}
	
//	public void checkCards() {
//		for (int i = 0; i < 3; i++) {
//			if (getRandomCardSet()[i].equals(getRandomCardSet()[i+1])&&getRandomCardSet()[i].equals("Joker"))
//							
//		}
//	}

	
}
