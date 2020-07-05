package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class signUp extends JFrame {

	private JPanel contentPane;
	private JTextField userName;
	private JPasswordField password;
	private JButton signUpButtonMenu;
	private JButton signUpButtonAction;

	public signUp() {
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
		
		
		signUpButtonMenu = new JButton("");
		signUpButtonMenu.setIcon(new ImageIcon(signUp.class.getResource("/view/res/signUpSelected.png")));
		signUpButtonMenu.setContentAreaFilled(false);
		signUpButtonMenu.setBorderPainted(false);
		signUpButtonMenu.setBorder(null);
		signUpButtonMenu.setBounds(607, 33, 112, 47);
		panel.add(signUpButtonMenu);
		
		JButton signInButton = new JButton("");
		signInButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setWindowVisible(false);
				new LoginView().setVisible(true);
			}
		});
		signInButton.setOpaque(false);
		signInButton.setContentAreaFilled(false);
		signInButton.setBorderPainted(false);
		signInButton.setBorder(null);
		signInButton.setIcon(new ImageIcon(signUp.class.getResource("/view/res/signInUnselected.png")));
		signInButton.setBounds(542, 33, 112, 47);
		panel.add(signInButton);
		
		userName = new JTextField();
		userName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				userName.setText("");
			}
		});
		
		signUpButtonAction = new JButton("");
		signUpButtonAction.setOpaque(false);
		signUpButtonAction.setContentAreaFilled(false);
		signUpButtonAction.setBorderPainted(false);
		signUpButtonAction.setBorder(null);
		signUpButtonAction.setIcon(new ImageIcon(signUp.class.getResource("/view/res/SIGNUP.png")));
		signUpButtonAction.setBounds(395, 372, 105, 34);
		panel.add(signUpButtonAction);
		userName.setBorder(null);
		userName.setOpaque(false);
		userName.setForeground(Color.LIGHT_GRAY);
		userName.setText("Enter Username");
		userName.setBounds(395, 141, 325, 34);
		panel.add(userName);
		userName.setColumns(10);
		
		password = new JPasswordField();
		password.setText("Enter Password");
		password.setBorder(null);
		password.setOpaque(false);
		password.setForeground(Color.LIGHT_GRAY);
		password.setFont(new Font("Arial", Font.PLAIN, 11));
		password.setBounds(395, 225, 325, 34);
		password.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				password.setText("");
			}
		});
		panel.add(password);
		
		JSpinner userTypeValue = new JSpinner();
		userTypeValue.setModel(new SpinnerListModel(new String[] {"Player", "Scout"}));
		userTypeValue.setBounds(395, 313, 87, 20);
		panel.add(userTypeValue);
		
		JLabel userTypeTitle = new JLabel("User type");
		userTypeTitle.setForeground(Color.WHITE);
		userTypeTitle.setFont(new Font("Arial", Font.PLAIN, 20));
		userTypeTitle.setBounds(395, 270, 105, 24);
		panel.add(userTypeTitle);
		
		JLabel passwordTitle = new JLabel("Password");
		passwordTitle.setFont(new Font("Arial", Font.PLAIN, 20));
		passwordTitle.setForeground(Color.WHITE);
		passwordTitle.setBounds(395, 200, 105, 24);
		panel.add(passwordTitle);
		
		JLabel usernameTitle = new JLabel("Username");
		usernameTitle.setFont(new Font("Arial", Font.PLAIN, 20));
		usernameTitle.setForeground(Color.WHITE);
		usernameTitle.setBounds(395, 118, 105, 24);
		panel.add(usernameTitle);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(UIManager.getColor("window"));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(LoginView.class.getResource("/view/res/loginRightSidee.png")));
		lblNewLabel_1.setBounds(340, 0, 420, 543);
		panel.add(lblNewLabel_1);
		

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setIcon(new ImageIcon(LoginView.class.getResource("/view/res/leftSideLogin.png")));
		lblNewLabel.setBounds(0, 0, 420, 543);
		panel.add(lblNewLabel);
	}
	public void setWindowVisible(boolean flag) {
		this.setVisible(flag);
	}
}
