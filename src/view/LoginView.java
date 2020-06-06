package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LoginView extends JFrame{
	private static JLabel myTitle;
	private static JLabel userTitle;
	private static JLabel passwordTitle;
	private static JTextField userName;
	private static JPasswordField password;
	private static JButton loginButton;
	private static JLabel successMessage;
	
	LoginView(){
//		JFrame myFrame = new JFrame();
		JPanel panel = new JPanel();
		myFrame.setSize(400, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.add(panel);
		panel.setLayout(null);
		myTitle = new JLabel("Scouthem");
		myTitle.setBounds(150, 2, 100, 100);
		panel.add(myTitle);
		userTitle = new JLabel("User:");
		userTitle.setBounds(65, 60, 100, 100);
		panel.add(userTitle);
		passwordTitle = new JLabel("Password:");
		passwordTitle.setBounds(35, 110, 100, 100);
		panel.add(passwordTitle);
		userName= new JTextField();
		password= new JPasswordField();
		userName.setBounds(100, 100, 200, 25);
		password.setBounds(100, 150, 200, 25);
		panel.add(userName);
		panel.add(password);
		loginButton = new JButton("Login");
		loginButton.setBounds(100, 200, 80, 20);
		panel.add(loginButton);
		loginButton.addActionListener(new Login());
		successMessage = new JLabel("");
		successMessage.setBounds(200, 200, 80, 100);
		panel.add(successMessage);

	
	
	myFrame.setVisible(true);
	}
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String user = userName.getText();
		String passWord = password.getText();
		if (user.equals("Itay") && passWord.equals("1234")) {
			successMessage.setText("Welcome " + user);
		}
		else {
			successMessage.setText("User " + user + " doesn't exist!");
		}
	}
}
