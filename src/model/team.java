package model;

public class team{
	
	private String teamName;
	private game MyGame;
	///////////////////////////////////////
	
	public team() {

	}
	public team(String teamName) {
		this.teamName = teamName;
	}
	//////////////////////////////////////

	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {

		this.teamName = teamName;
	}
	public game getMyGame() {
		return MyGame;
	}
	public void setMyGame(game myGame) {
		MyGame = myGame;
	}

}
