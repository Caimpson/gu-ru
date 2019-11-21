//Caine Simpson 2138307

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

// Class for setting up a panel which represents a card.
public class CardPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	// These show the name of the card
	JLabel cardLabel = new JLabel();

	
// Constructor. Sets layout, creates border, and adds and sets up JLabels
	public CardPanel() {
		this.setLayout(new GridBagLayout());// This gives centred text	
		Border blackline = BorderFactory.createLineBorder(Color.BLACK,3);// Black outline
		this.setBorder(blackline);//
		this.setBackground(Color.WHITE);//White background colour
		this.add(cardLabel);// Text for the name of the card, possible names are defined in GamePlay
		cardLabel.setFont(new Font("Courier", Font.PLAIN, 32));	
		cardLabel.setForeground(new Color(160,0,15));// Dark red text
	}
	

// A getter so that the label text can be changed when a new hand is generated
	public JLabel getCardLabel() {
		return cardLabel;
	}
}
