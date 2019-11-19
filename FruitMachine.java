
//Caine Simpson, 2138307

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class FruitMachine extends JFrame {
	private static final long serialVersionUID = 1L;

	// Unit used for layout management
	final int unit = 30;

	// Constructor for FruitMachine window
	public FruitMachine() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Fruit Machine");
		this.setSize(30 * unit, 20 * unit);
		this.setLayout(new BorderLayout());

		MainPanel gameWindow = new MainPanel(unit);
		this.add(gameWindow);
	}

	public static void main(String[] args) {
		//new FruitMachine();
		Gameplay testGame = new Gameplay();
		System.out.println(testGame.getRandomCardSet()[0]);
		System.out.println(testGame.getRandomCardSet()[1]);
		System.out.println(testGame.getRandomCardSet()[2]);
		System.out.println(testGame.checkCards());
	}

}
