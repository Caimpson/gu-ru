
//Caine Simpson 2138307

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

//Class to set up the main panel. This features sub panels in order to place components in the desired places.
public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;

	// Sub Panels for different sections
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	private JPanel bottomLeftPanel = new JPanel();
	private JPanel bottomRightPanel = new JPanel();

	// Panel array for cards
	private CardPanel[] cardArray = new CardPanel[3];

	// Labels for balance, message & win status
	private JLabel balance = new JLabel();
	private JLabel message = new JLabel();
	private JLabel winStatus = new JLabel();

	// Spin and new game buttons
	private JButton spin = new JButton();
	private JButton newGame = new JButton();

	// Font
	private Font f = new Font("Times New Roman", Font.PLAIN, 32);
	
	private Gameplay currentGame;

	public MainPanel(int border) {
		this.setLayout(new BorderLayout());
		Border emptyBorder = BorderFactory.createEmptyBorder(border*2,border,border*2,border);
		this.setBorder(emptyBorder);

		this.setTopPanel(border);
		this.setBottomPanel(border);
		this.setBottomLeftPanel(border);
		this.setBottomRightPanel(border);
	}

	public JPanel setTopPanel(int borderUnit) {
		this.add(topPanel, BorderLayout.NORTH);
		GridLayout topLayout = new GridLayout(3, 0, 0, borderUnit*3);
		topPanel.setLayout(topLayout);
		
		//Initialising 'Balance' Label
		topPanel.add(balance);
		balance.setFont(f);
		balance.setText("Balance = 150");
		
		//Initialising 'Message' label
		topPanel.add(message);
		message.setFont(f);
		message.setText("Welcome!");
		
		//Initialising 'win status' label
		topPanel.add(winStatus);
		winStatus.setFont(f);

		return topPanel;
	}
	
	//Bottom panel containing left and right panels
	public JPanel setBottomPanel(int borderUnit) {
		
		this.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout( new GridLayout(0, 2, borderUnit, 0));
		bottomPanel.add(bottomLeftPanel);
		bottomPanel.add(bottomRightPanel);

		return bottomPanel;
	}

	//Bottom left panel with cards
	public JPanel setBottomLeftPanel(int borderUnit) {
		bottomLeftPanel.setLayout(new GridLayout(0, 3, borderUnit, 0));
		
		// Setting up 1st Card
		cardArray[0] = new CardPanel();
		bottomLeftPanel.add(cardArray[0]);

		// Setting up 2nd Card
		cardArray[1] = new CardPanel();
		bottomLeftPanel.add(cardArray[1]);

		// Setting up 3rd Card
		cardArray[2] = new CardPanel();
		bottomLeftPanel.add(cardArray[2]);
		
		return bottomLeftPanel;
	}

	// Bottom right panel with 'spin' and 'new game' buttons
	public JPanel setBottomRightPanel(int borderUnit) {
		bottomRightPanel.setLayout(new GridLayout(2, 0, 0, borderUnit));
		bottomRightPanel.add(spin);
		spin.setFont(f);
		spin.setText("Spin");

		bottomRightPanel.add(newGame);
		newGame.setFont(f);
		newGame.setText("New Game");

		return bottomRightPanel;
	}

}
