
//Caine Simpson 2138307

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

//Class for setting up the panels which represent the cards.
public class CardPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	JLabel cardLabel = new JLabel();

	public CardPanel() {
		this.setLayout(new GridBagLayout());	
		Border blackline = BorderFactory.createLineBorder(Color.black);
		this.setBorder(blackline);
		this.setBackground(Color.YELLOW);
		this.add(cardLabel);
		cardLabel.setFont(new Font("Times New Roman", Font.PLAIN, 32));		
	}

	public JLabel getCardLabel() {
		return cardLabel;
	}

}
