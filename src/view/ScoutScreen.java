package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import model.scout;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.SpinnerListModel;

public class ScoutScreen extends JFrame {

	private JPanel contentPane;
	private JButton signOutButton;
	private JTable findPlayersTable;
	private JTable interestTable;
	private JButton findPlayersButton;
	private JButton showPlayersButton;
	private JButton addPlayerButton;
	private JPanel panel;
	private DefaultTableModel findPlayersModel;
	private DefaultTableModel interestPlayersModel;
	private JButton removePlayerButton;
	private JTextField teamNameField;
	private JSpinner roleSpinner;
	private JButton filterButton;
	private JButton goalsSort;
	private JButton assistsButton;
	private JButton playingTimeButton;
	private JLabel filterTitle;
	private	JLabel sortTitle;

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
		
		panel = new JPanel();
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
		
		filterButton = new JButton("");
		filterButton.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/filterButton.png")));
		filterButton.setOpaque(false);
		filterButton.setContentAreaFilled(false);
		filterButton.setBorderPainted(false);
		filterButton.setBorder(null);
		filterButton.setBounds(626, 95, 107, 43);
		panel.add(filterButton);
		filterButton.setVisible(false);
		
		teamNameField = new JTextField();
		teamNameField.setText("Team");
		teamNameField.setBounds(432, 103, 86, 20);
		panel.add(teamNameField);
		teamNameField.setColumns(10);
		teamNameField.setVisible(false);
		
		roleSpinner = new JSpinner();
		roleSpinner.setModel(new SpinnerListModel(new String[] {"Goalkeeper", "Centre-back", "Sweeper", "Full-back", "Wing-back", "Centre midfield", "Defensive midfield", "Attacking midfield", "Wide midfield", "Centre forward", "Second striker", "Winger"}));
		roleSpinner.setBorder(null);
		roleSpinner.setBounds(522, 103, 91, 20);
		panel.add(roleSpinner);
		roleSpinner.setVisible(false);
		
		playingTimeButton = new JButton("");
		playingTimeButton.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/playingTimeButton.png")));
		playingTimeButton.setOpaque(false);
		playingTimeButton.setContentAreaFilled(false);
		playingTimeButton.setBorderPainted(false);
		playingTimeButton.setBorder(null);
		playingTimeButton.setBounds(626, 62, 107, 43);
		panel.add(playingTimeButton);
		playingTimeButton.setVisible(false);
		
		assistsButton = new JButton("");
		assistsButton.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/assistsButton.png")));
		assistsButton.setOpaque(false);
		assistsButton.setContentAreaFilled(false);
		assistsButton.setBorderPainted(false);
		assistsButton.setBorder(null);
		assistsButton.setBounds(524, 62, 107, 43);
		panel.add(assistsButton);
		assistsButton.setVisible(false);
		
		goalsSort = new JButton("");
		goalsSort.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/goalsButton.png")));
		goalsSort.setOpaque(false);
		goalsSort.setContentAreaFilled(false);
		goalsSort.setBorderPainted(false);
		goalsSort.setBorder(null);
		goalsSort.setBounds(422, 62, 107, 43);
		panel.add(goalsSort);
		goalsSort.setVisible(false);
		
		filterTitle = new JLabel("Filter by:");
		filterTitle.setForeground(Color.WHITE);
		filterTitle.setFont(new Font("Arial", Font.BOLD, 16));
		filterTitle.setBounds(362, 104, 67, 19);
		panel.add(filterTitle);
		filterTitle.setVisible(false);
		
		
		sortTitle = new JLabel("Sort by:");
		sortTitle.setForeground(Color.WHITE);
		sortTitle.setFont(new Font("Arial", Font.BOLD, 16));
		sortTitle.setBounds(361, 74, 61, 19);
		panel.add(sortTitle);
		sortTitle.setVisible(false);
		
		removePlayerButton = new JButton("");
		removePlayerButton.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/removeButton.png")));
		removePlayerButton.setOpaque(false);
		removePlayerButton.setContentAreaFilled(false);
		removePlayerButton.setBorderPainted(false);
		removePlayerButton.setBorder(null);
		removePlayerButton.setBounds(370, 388, 107, 47);
		panel.add(removePlayerButton);
		removePlayerButton.setVisible(false);
		
		addPlayerButton = new JButton("");
		addPlayerButton.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/addButton.png")));
		addPlayerButton.setOpaque(false);
		addPlayerButton.setContentAreaFilled(false);
		addPlayerButton.setBorderPainted(false);
		addPlayerButton.setBorder(null);
		addPlayerButton.setBounds(624, 388, 107, 47);
		panel.add(addPlayerButton);
		addPlayerButton.setVisible(false);
		findPlayersModel = new DefaultTableModel();
		findPlayersTable = new JTable(findPlayersModel);
		findPlayersTable.setSelectionBackground(Color.RED);
		findPlayersTable.setBackground(new Color(51, 204, 204));
		findPlayersTable.setForeground(Color.BLACK);
		findPlayersModel.addColumn("Name");
		findPlayersModel.addColumn("Team");
		findPlayersModel.addColumn("Role");
		findPlayersModel.addColumn("Goals");
		findPlayersModel.addColumn("Assists");
		findPlayersModel.addColumn("Playing time");
		findPlayersModel.addColumn("ID");
		findPlayersTable.setBorder(null);
		panel.add(findPlayersTable);		
		findPlayersTable.setVisible(false);
		
		interestPlayersModel = new DefaultTableModel();
		interestTable = new JTable(interestPlayersModel);
		interestTable.setSelectionBackground(Color.RED);
		interestTable.setBackground(new Color(51, 204, 204));
		interestTable.setForeground(Color.BLACK);
		interestTable.setBorder(null);
		interestPlayersModel.addColumn("Name");
		interestPlayersModel.addColumn("Team");
		interestPlayersModel.addColumn("ID");

		panel.add(interestTable);
		interestTable.setVisible(false);
		
		showPlayersButton = new JButton("");
		showPlayersButton.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/showPlayersButton.png")));
		showPlayersButton.setOpaque(false);
		showPlayersButton.setContentAreaFilled(false);
		showPlayersButton.setBorderPainted(false);
		showPlayersButton.setBorder(null);
		showPlayersButton.setBounds(624, 466, 107, 47);
		panel.add(showPlayersButton);
		
		findPlayersButton = new JButton("");
		findPlayersButton.setIcon(new ImageIcon(ScoutScreen.class.getResource("/view/res/findPlayersButton.png")));
		findPlayersButton.setOpaque(false);
		findPlayersButton.setContentAreaFilled(false);
		findPlayersButton.setBorderPainted(false);
		findPlayersButton.setBorder(null);
		findPlayersButton.setBounds(370, 466, 107, 47);
		panel.add(findPlayersButton);
		findPlayersTable.setBounds(362, 134, 366, 243);
		interestTable.setBounds(389, 134, 303, 243);

		panel.add(signOutButton);
		
		JLabel scoutName = new JLabel(myScouter.getScoutName());
		scoutName.setForeground(Color.WHITE);
		scoutName.setFont(new Font("Arial", Font.BOLD, 37));
		scoutName.setBounds(38, 32, 188, 43);
		panel.add(scoutName);
		
		JLabel teamName = new JLabel(myScouter.getMyTeam().getTeamName());
		teamName.setForeground(Color.WHITE);
		teamName.setFont(new Font("Arial", Font.PLAIN, 20));
		teamName.setBounds(28, 86, 178, 35);
		panel.add(teamName);
		
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
	public void showFindPlayersTable() {
		findPlayersTable.setVisible(true);
		interestTable.setVisible(false);
		teamNameField.setVisible(true);
		roleSpinner.setVisible(true);
		filterButton.setVisible(true);
		goalsSort.setVisible(true);
		assistsButton.setVisible(true);
		playingTimeButton.setVisible(true);
		filterTitle.setVisible(true);
		sortTitle.setVisible(true);
		addPlayerButton.setVisible(true);
		removePlayerButton.setVisible(false);
	}
	public void showInterestTable() {
		interestTable.setVisible(true);
		findPlayersTable.setVisible(false);
		teamNameField.setVisible(false);
		roleSpinner.setVisible(false);
		filterButton.setVisible(false);
		goalsSort.setVisible(false);
		assistsButton.setVisible(false);
		playingTimeButton.setVisible(false);
		filterTitle.setVisible(false);
		sortTitle.setVisible(false);
		addPlayerButton.setVisible(false);
		removePlayerButton.setVisible(true);
	}
	public void addItemToFindPlayersTable(String name, String team, String role, int goals, int assists, int playingTime, int id) {
		findPlayersModel.insertRow(0, new Object[] {name, team, role, goals, assists, playingTime, id});
	}
	public void addItemToInterestTable(String name, String team, int id) {
		interestPlayersModel.insertRow(0, new Object[] {name, team, id});
	}
	public int getSelectedRowInFindPlayersTable() {
		return findPlayersTable.getSelectedRow();
	}
	public int getSelectedColumInFindPlayersTable() {
		return findPlayersTable.getSelectedColumn();
	}
	public Object getValueFromFindPlayersTable(int row, int column) {
		return findPlayersTable.getValueAt(row, column);
	}
	public int getSelectedRowInInterestTable() {
		return interestTable.getSelectedRow();
	}
	public int getSelectedColumInInterestTable() {
		return interestTable.getSelectedColumn();
	}
	public void initFindPlayersTable() {
		findPlayersModel.setRowCount(0);
	}
	public void initInterestTable() {
		interestPlayersModel.setRowCount(0);
	}
	public Object getValueFromInterestTable(int row, int column) {
		return interestTable.getValueAt(row, column);
	}
	public void addSignOutListener(ActionListener signOutButtonListner) {
		signOutButton.addActionListener(signOutButtonListner);
	}
	public void addFindPlayersListener(ActionListener findPlayersListner) {
		findPlayersButton.addActionListener(findPlayersListner);
	}
	public void addShowPlayersListener(ActionListener showPlayersListner) {
		showPlayersButton.addActionListener(showPlayersListner);
	}
	public void addAddPlayerListener(ActionListener addPlayerListner) {
		addPlayerButton.addActionListener(addPlayerListner);
	}
	public void addRemovePlayerListener(ActionListener removePlayerListner) {
		removePlayerButton.addActionListener(removePlayerListner);
	}
	public void addFilterByTeamOrRoleListener(ActionListener filterByTeamOrRoleListner) {
		filterButton.addActionListener(filterByTeamOrRoleListner);
	}
	public void addSortByGoalsListener(ActionListener sortByGoalsListner) {
		goalsSort.addActionListener(sortByGoalsListner);
	}
	public void addSortByAssistsListener(ActionListener sortByAssistsListner) {
		assistsButton.addActionListener(sortByAssistsListner);
	}
	public void addSortByPlayingTimeListener(ActionListener sortByPlayingTimeListner) {
		playingTimeButton.addActionListener(sortByPlayingTimeListner);
	}
	public String getPlayerRole() {
		return (String) roleSpinner.getValue();
	}
	public String getTeamName() {
		return teamNameField.getText();
	}
}
