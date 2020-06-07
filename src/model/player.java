package model;

import java.util.HashSet;
import java.util.Set;

public class player extends user{
	
	private String playerName;
	private String role;
	private String mail;
	private double height;
	private double weight;
	private int age;
	private int yellowCard;
	private int redCard;
	private int totalPlayingTime;
	private int numOfAssists;
	private int goals;
	private int idPlayer;
	private team MyTeam;
	private Set<game> setOfGames = new HashSet<game>();
	/////////////////////////////////////////
	
	public player(String playerName,String team, String role, int age, double height, double weight, String mail, int idPlayer,String userName, String password) {
		      super(userName,password);
		      this.setPlayerName(playerName);
		      MyTeam= new team(team);
		      this.setRole(role);
		      this.setAge(age);
		      this.setHeight(height);
		      this.setWeight(weight);
		      this.setMail(mail);
		      this.setIdPlayer(idPlayer);		      
	}
	public player(String userName, String password)
	{
		super(userName, password);	
	}
	public player()
	{
		
	}
	/////////////////////////////////////////
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
			this.playerName = playerName;		
	}
	public String getRole() {	
		return role;
	}
	public void setRole(String role) {
			this.role = role;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
			this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
			this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {

			this.weight = weight;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
			this.mail = mail;

	}
	public int getYellowCard() {
		return yellowCard;
	}
	public void setYellowCard(int yellowCard) {
			this.yellowCard += yellowCard;
	}
	public int getRedCard() {
		return redCard;
	}
	public void setRedCard(int redCard) {
		this.redCard = redCard;
	}
	public int getTotalPlayingTime() {
		return totalPlayingTime;
	}
	public void setTotalPlayingTime(int totalPlayingTime) {

			this.totalPlayingTime += totalPlayingTime;
	}
	public int getNumOfAssists() {
		return numOfAssists;
	}
	public void setNumOfAssists(int numOfAssists) {
			this.numOfAssists += numOfAssists;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals += goals;
	}
	public int getIdPlayer() {
		return idPlayer;
	}
	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}
	public Set<game> getSetOfGames(player p) {
		System.out.println(p.playerName+" games: ");
		return setOfGames;
	}
	public void setSetOfGames(Set<game> setOfGames) {
		this.setOfGames = setOfGames;
	}
	public team getMyTeam() {
		return MyTeam;
	}
	public void setMyTeam(team myTeam) {
		MyTeam = myTeam;
	}
	////////////////////////////////////////////////
		
	@Override
	public String toString() {
		return "player -  [playerName = " + playerName + ", team = " + MyTeam.getTeamName() + ", role = " + role + "\n" + ", age = " + age + ", height = " + height
				+ ", weight = " + weight + "\n" + ", mail = " + mail + ", yellowCard = " + yellowCard + ", redCard = " + redCard
				+ "\n" + ", totalPlayingTime = " + totalPlayingTime + ", numOfAssists = " + numOfAssists + ", goals = " + goals + "." + "\n" + "\n";
	}
	public void editInformation(String name,String team,String role,int age,double height,double weight,String mail)
	{
		this.setPlayerName(name);
		this.setRole(role);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setMail(mail);
		this.MyTeam.setTeamName(team);
	}
	public void addGame(game g)
	{
        this.setYellowCard(g.getYellowCard());
        this.setRedCard(g.getRedCard());
        this.setTotalPlayingTime(g.getPlayTimeGame());
        this.setNumOfAssists(g.getNumOfAssists());
        this.setGoals(g.getNumOfGoals());		
	}
	public Set<game> showListOfGames()
	{
		return setOfGames;

	}
	///////////////////////////////////////////
	
//	public static String getType() {
//		return "Player";
//		return this;
//	}
}
