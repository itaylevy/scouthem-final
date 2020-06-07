package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ScoutScreen extends JFrame {


	/**
	 * Create the frame.
	 */
	public ScoutScreen() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(65, 58, 46, 14);
		getContentPane().add(lblNewLabel);

	}

}
