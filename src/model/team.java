package model;

public class team{
	
	private String teamName;
	///////////////////////////////////////
	
	public team() {

	}
	public team(String teamName) {
		super();
		this.teamName = teamName;
	}
	//////////////////////////////////////

	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {

		this.teamName = teamName;
	}
	//////////////////////////////////////
}
