package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import model.scout;

public class ScoutScreen extends JFrame {

	private JPanel contentPane;
	private JButton signOutButton;

	/**
	 * Create the frame.
	 * @param myScouter 
	 */
	public ScoutScreen(scout myScouter) {
		setModalExclusionType(ModalExclusionType.TOOLKIT_EXCLUDE);
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 799, 568);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 840, 840);
		contentPane.add(panel);
		panel.setLayout(null);
		
		signOutButton = new JButton("");
		signOutButton.setContentAreaFilled(false);
		signOutButton.setBorderPainted(false);
		signOutButton.setBorder(null);
		signOutButton.setOpaque(false);
		signOutButton.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/signOutButton.png")));
		signOutButton.setBounds(624, 13, 107, 47);
		signOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setWindowVisible(false);
				new LoginView().setVisible(true);
			}

		});
		panel.add(signOutButton);
		
		JLabel scoutName = new JLabel(myScouter.getScoutName());
		scoutName.setForeground(Color.WHITE);
		scoutName.setFont(new Font("Arial", Font.BOLD, 37));
		scoutName.setBounds(38, 32, 188, 43);
		panel.add(scoutName);
		
//		JLabel teamName = new JLabel(myScouter.getMyTeam().getTeamName());
//		teamName.setForeground(Color.WHITE);
//		teamName.setFont(new Font("Arial", Font.PLAIN, 20));
//		teamName.setBounds(163, 80, 178, 35);
//		panel.add(teamName);
		
		JLabel rightSideBg = new JLabel("");
		rightSideBg.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/basicRightBG.png")));
		rightSideBg.setBounds(340, 0, 420, 532);
		panel.add(rightSideBg);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 412, 534);
		panel.add(lblNewLabel);
		lblNewLabel.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/basicLeftBG.png")));

	}
	public void setWindowVisible(boolean flag) {
		this.setVisible(flag);
	}
}
