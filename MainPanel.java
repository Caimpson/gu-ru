//Caine Simpson 2138307

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

/*Class to set up the main panel, which constitutes the majority of the 'view' aspects of this program. 
 *The main panel is set to gridLayout with 2 rows.
 *On each of these rows is a sub panel - topPanel and bottomPanel - each with their own components
 *and layouts. */
public class MainPanel extends JPanel{// implements ActionListener {
	private static final long serialVersionUID = 1L;
	
	// Background colour for panels
	Color tableGreen = new Color(7,99,36);
	
	// The unit passed from FruitMachine
	private int borderUnit;

	// Sub Panels for different sections.
	private JPanel topPanel;// Top panel with messages
	private JPanel bottomPanel;// Bottom panel with 2 columns for sub-panels of its own
	private JPanel cardDisplayPanel;// On the left column of bottomPanel, this is where the 'cards' are displayed
	private CardPanel[] cardPanelArray;// The 'cards' are represented by 3 panels which are held in an array. These are then placed on the cardDisplay panel
	private ButtonPanel buttonPanel;// Custom JPanel object where the buttons for 'new game' & 'spin' go
	
	// Labels for balance, message & win status
	private JLabel balance;// The players' points
	private JLabel message;// Message tells the user what there hand was worth in terms of points
	private JLabel winStatus;// Only displays text when the game is over (won/lost)

	
// Constructor. Sets the layout of the main panel and initialises a new game.
	public MainPanel(int borderUnit) {
		this.borderUnit = borderUnit;
		
		this.setLayout(new GridLayout(2, 0));// The main panel houses 2 separate panels on 2 rows of a gridLayout
		this.setBackground(tableGreen);
		
		/* Creating an empty border so that components are nicely centred and not
		 * squished against the sides of the frame */
		Border emptyBorder = BorderFactory.createEmptyBorder(borderUnit * 2, borderUnit, borderUnit * 2, borderUnit);
		this.setBorder(emptyBorder);
		
		// initialiseGame() resets main panel and all sub-panels as well as creating a new FruitMachineRules object.
		initialiseGame();
	}


//Initialise a new game 
	public void initialiseGame() {
		// Creating the new panels
		topPanel = new JPanel();
		bottomPanel = new JPanel();
		cardDisplayPanel = new JPanel();
		buttonPanel = new ButtonPanel(this, borderUnit, tableGreen);
		cardPanelArray = new CardPanel[3];

		// Filling the card array with new CardPanel objects
		for (int i = 0; i < cardPanelArray.length; i++) {
			cardPanelArray[i] = new CardPanel();
		}

		// Resetting the main panel
		this.removeAll();// Removing any existing components that may still exist from previous games

		// These methods initialise all panels to the game's start point
		this.setTopPanel();
		this.setBottomPanel();
		this.setCardDisplayPanel();

		// Updating the main panel with the new components
		this.revalidate();
		this.repaint();
	}


//Initialise the top panel which contains the JLabels for balance, messages, and win state	
	public JPanel setTopPanel() {
		//Creating the font for messages
		Font messageFont = new Font("Times New Roman", Font.PLAIN, 32);
		
		this.add(topPanel);// Adding the top panel to the 1st row of the main panel
		
		topPanel.setLayout(new GridLayout(3, 0, 0, borderUnit));// 3 rows with a horizontal gap between them
		topPanel.setBackground(tableGreen);

		// Initialising 'Balance' Label
		balance = new JLabel();
		topPanel.add(balance);
		balance.setFont(messageFont);
		balance.setForeground(Color.WHITE);//White font
		balance.setText("Balance is " + buttonPanel.getCurrentGame().getBalance());// Gets initial balance from FruitMachineRules instance

		// Initialising 'Message' label
		message = new JLabel();
		topPanel.add(message);
		message.setFont(messageFont);
		message.setForeground(Color.WHITE);
		message.setText("Welcome!");
		
		// Initialising 'win status' label
		winStatus = new JLabel();
		topPanel.add(winStatus);
		winStatus.setFont(messageFont);
		winStatus.setForeground(Color.WHITE);
		winStatus.setText("");
		
		return topPanel;
	}

	
// Bottom panel containing left and right panels
	public JPanel setBottomPanel() {
		this.add(bottomPanel);// Adding the bottom panel to the 2nd row of the main panel
		bottomPanel.setLayout(new GridLayout(0, 2, borderUnit, 0));// 2 columns with a vertical gap
		bottomPanel.setBackground(tableGreen);
		bottomPanel.add(cardDisplayPanel);// Adding the panel to display cards to the 1st column of bottom panel
		bottomPanel.add(buttonPanel);// Adding the panel to display buttons to the 2nd column of bottom panel
		return bottomPanel;
	}

	
// Bottom left panel on which cardPanels are placed
	public JPanel setCardDisplayPanel() {
		
		// Layout of the background panel, consisting of 3 columns with a vertical gap
		cardDisplayPanel.setLayout(new GridLayout(0, 3, borderUnit / 2, 0));
		
		// Making and applying a compound border to cardDisplayPanel
		Border blackline = BorderFactory.createLineBorder(Color.BLACK, borderUnit/6);
		Border spaceBorder = BorderFactory.createEmptyBorder(borderUnit, borderUnit, borderUnit, borderUnit);
		Border compoundBorder = BorderFactory.createCompoundBorder(blackline, spaceBorder);
		cardDisplayPanel.setBorder(compoundBorder);
		cardDisplayPanel.setBackground(tableGreen);
		
		// Setting up 1st Card. Initially its label reads "King"
		cardDisplayPanel.add(cardPanelArray[0]);
		cardPanelArray[0].getCardLabel().setText("King");

		// Setting up 2nd Card. Initially its label reads "Queen"
		cardDisplayPanel.add(cardPanelArray[1]);
		cardPanelArray[1].getCardLabel().setText("Queen");

		// Setting up 3rd Card. Initially its label reads "Jack"
		cardDisplayPanel.add(cardPanelArray[2]);
		cardPanelArray[2].getCardLabel().setText("Jack");

		return cardDisplayPanel;
	}

	
//Getters for attributes needed by the controller
	public CardPanel[] getcardPanelArray() {
		return cardPanelArray;
	}
	public JLabel getBalance() {
		return balance;
	}

	public JLabel getMessage() {
		return message;
	}

	public JLabel getWinStatus() {
		return winStatus;
	}
}
