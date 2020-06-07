package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import model.player;

import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class PlayerScreen extends JFrame {

	private JPanel contentPane;
	private AbstractButton logoutButton;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					PlayerScreen frame = new PlayerScreen();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public PlayerScreen(player myPlayer) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 537, 383);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Add Game");
		btnNewButton.setBounds(422, 263, 89, 27);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel playerName = new JLabel(myPlayer.getPlayerName());
		playerName.setBounds(10, 24, 94, 14);
		contentPane.add(playerName);
		
		JLabel teamName = new JLabel(myPlayer.getMyTeam().getTeamName());
		teamName.setBounds(10, 46, 55, 14);
		contentPane.add(teamName);
		
		JLabel playerAge = new JLabel(String.valueOf(myPlayer.getAge()));
		playerAge.setBounds(10, 61, 55, 14);
		contentPane.add(playerAge);
		
		JLabel gameStats = new JLabel("Game Statistics");
		gameStats.setFont(new Font("HelvLight", Font.BOLD, 11));
		gameStats.setBounds(10, 110, 94, 27);
		contentPane.add(gameStats);
		
		JButton logoutButton = new JButton("LOGOUT");
		logoutButton.setBounds(422, 310, 89, 23);
		contentPane.add(logoutButton);
		
		JLabel totalPlayingTime = new JLabel("Total playing time");
		totalPlayingTime.setBounds(10, 137, 94, 14);
		contentPane.add(totalPlayingTime);
		
		JLabel goalsNum = new JLabel(String.valueOf(myPlayer.getGoals()));
		goalsNum.setBounds(10, 162, 81, 14);
		contentPane.add(goalsNum);
		
		JLabel yellowCards = new JLabel(String.valueOf(myPlayer.getYellowCard()));
		yellowCards.setBounds(10, 190, 46, 14);
		contentPane.add(yellowCards);
		
		JLabel redCards = new JLabel(String.valueOf(myPlayer.getRedCard()));
		redCards.setBounds(10, 218, 46, 14);
		contentPane.add(redCards);
		
		JLabel assistsCount = new JLabel(String.valueOf(myPlayer.getNumOfAssists()));
		assistsCount.setBounds(96, 162, 46, 14);
		contentPane.add(assistsCount);
		
		JLabel playerHeight = new JLabel(String.valueOf(myPlayer.getHeight()));
		playerHeight.setBounds(10, 86, 46, 14);
		contentPane.add(playerHeight);
		
		JLabel playerWeight = new JLabel(String.valueOf(myPlayer.getWeight()));
		playerWeight.setBounds(74, 86, 46, 14);
		contentPane.add(playerWeight);
		
		JLabel playerPosition = new JLabel(myPlayer.getRole());
		playerPosition.setBounds(96, 46, 46, 14);
		contentPane.add(playerPosition);
		
		JLabel nameTitle = new JLabel("Name:");
		nameTitle.setFont(new Font("Tahoma", Font.BOLD, 14));
		nameTitle.setBounds(10, 11, 46, 14);
		contentPane.add(nameTitle);
	}
}
