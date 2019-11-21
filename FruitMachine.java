//Caine Simpson, 2138307

import javax.swing.JFrame;

/*Frame and main method. The frame consists of a main panel (gameWindow) 
 * on which all of the other components are placed. 
 * The main method simply creates a new frame */
public class FruitMachine extends JFrame {
	private static final long serialVersionUID = 1L;
	// Unit used for aiding with the positioning of components
	final int UNIT = 30;

// Constructor for FruitMachine window
	public FruitMachine() {
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Fruit Machine");
		this.setSize(30 * UNIT, 20 * UNIT);// Size of window is 30X20 of the chosen units.

		// Creating the main panel and adding it to the frame
		MainPanel gameWindow = new MainPanel(UNIT);
		this.add(gameWindow);
	}


// Main method
	public static void main(String[] args) {
		// Creating new window
		new FruitMachine();
	}

}
