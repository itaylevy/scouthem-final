package model;

import java.util.HashSet;
import java.util.Set;

public class player{
	
	private String playerName;
	private String password;
	private String role;
	private int age;
	private double height;
	private double weight;
	private String mail;
	private int yellowCard;
	private int redCard;
	private int totalPlayingTime;
	private int numOfAssists;
	private int goals;
	private int idPlayer;
	private team MyTeam;
	private Set<game> setOfGames = new HashSet<game>();
	//////////////////////////////////////////
	
	public player(String playerName, String role, String team, int age, double height, double weight, String mail, int idPlayer, String passWord) {
		      super();
		      this.setPlayerName(playerName);
		      this.setRole(role);
		      this.setAge(age);
		      this.setHeight(height);
		      this.setWeight(weight);
		      this.setMail(mail);
		      this.setIdPlayer(idPlayer);
		      
	}
	public player() {

	}
	/////////////////////////////////////////
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		if(playerName!=null)
		{
			this.playerName = playerName;
		}
		else
		{
			return;
		}
		
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		if(password!=null)
		{
			this.password = password;
		}
		else
		{
			return;
		}
	}
	public String getRole() {
		
		return role;
	}
	public void setRole(String role) {
		if(role!=null)
		{
			this.role = role;
		}
		else
		{
			return;
		}
	
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age<=18)
		{
			this.age = age;
		}
		else
		{
			System.out.println("You cannot sign up for the system!");
			return;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if(height!=0)
		{
			this.height = height;
		}
		else
		{
			return;
		}
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if(weight!=0)
		{
			this.weight = weight;
		}
		else
		{
			return;
		}
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		if(mail!=null)
		{
			this.mail = mail;
		}
		else
		{
			return;
		}
	}
	public int getYellowCard() {
		return yellowCard;
	}
	public void setYellowCard(int yellowCard) {
		if(yellowCard!=0)
		{
			this.yellowCard = yellowCard;
		}
		else
		{
			return;
		}
	}
	public int getRedCard() {
		return redCard;
	}
	public void setRedCard(int redCard) {
		if(redCard!=0)
		{
			this.redCard = redCard;
		}
		else
		{
			return;
		}
	}
	public int getTotalPlayingTime() {
		return totalPlayingTime;
	}
	public void setTotalPlayingTime(int totalPlayingTime) {
		if(totalPlayingTime!=0)
		{
			this.totalPlayingTime = totalPlayingTime;
		}
		else
		{
			return;
		}
	}
	public int getNumOfAssists() {
		return numOfAssists;
	}
	public void setNumOfAssists(int numOfAssists) {
		if(numOfAssists!=0)
		{
			this.numOfAssists = numOfAssists;
		}
		else
		{
			return;
		}
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		if(goals!=0)
		{
			this.goals = goals;
		}
		else
		{
			return;
		}
	}
	public int getIdPlayer() {
		return idPlayer;
	}
	public void setIdPlayer(int idPlayer) {
		this.idPlayer = idPlayer;
	}
	public team getMyTeam() {
		return MyTeam;
	}
	public void setMyTeam(team myTeam) {
		MyTeam = myTeam;
	}
	public Set<game> getSetOfGames() {
		return setOfGames;
	}
	public void setSetOfGames(Set<game> setOfGames) {
		this.setOfGames = setOfGames;
	}
	
	//////////////////////////////
////////////////////////////////////////////////
		
	@Override
	public String toString() {
		return "player -  [playerName=" + playerName + ", idPlayer=" + idPlayer + ", role=" + role + "\n" + ", age=" + age + ", height=" + height
				+ ", weight=" + weight + "\n" + ", mail=" + mail + ", yellowCard=" + yellowCard + ", redCard=" + redCard
				+ "\n" + ", totalPlayingTime=" + totalPlayingTime + ", numOfAssists=" + numOfAssists + ", goals=" + goals + "." + "\n" + "\n";
	}	
	public void editInformation(String name,String team,String role,int age,double height,double weight,String mail)
	{
		this.setPlayerName(name);
		this.setRole(role);
		this.setAge(age);
		this.setHeight(height);
		this.setWeight(weight);
		this.setMail(mail);		
	}
	public boolean addGame(game g)
	{
        this.setYellowCard(g.getYellowCard());
        this.setRedCard(g.getRedCard());
        this.setTotalPlayingTime(g.getPlayTimeGame());
        this.setNumOfAssists(g.getNumOfAssists());
        this.setGoals(g.getNumOfGoals());		
		return setOfGames.add(g);
	}
	public Set<game> showListOfGames()
	{
		return setOfGames;

	}

}
