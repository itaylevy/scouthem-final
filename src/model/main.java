package model;

import model.player_List;

import java.util.Comparator;

public class main {

	public static void main(String[] args) {
		
		//Creating a scout
		scout s=new scout("x","x","mC1527101215",204272231);
		
		//insert to list
		s.addScout(s);
	
		//Create a new player
		player p = new player("mor","hapoel tel aviv", "balam", 15, 1.75, 69.4, "mor@gmail.com", 207275631, "Mc0545526935");
		player p1 = new player("niv","Beitar Jerusalem", "haloz", 16, 1.83, 72.4, "niv@gmail.com", 207775631, "Nk0545526665");
	    player p2 = new player("itay","maccabi tel aviv", "kasar", 17, 1.77, 70.4, "itay@gmail.com", 207365431, "Il0543765935");
	    				
	    //insert to list
	    player_List players = new player_List();
	    players.addplayer(p);
	    players.addplayer(p1);
	    players.addplayer(p2);

	    //Creating a game for a player
	    game g = new game("15.5.20",1,0,94,"Beitar Jerusalem",1,0);
	    game g1 = new game("15.5.20",1,0,90,"Maccabi tel aviv",0,0);
	    game g2 = new game("15.5.20",1,0,65,"Maccabi haifa",1,1);
	    game g3 = new game("15.5.20",1,0,70,"Hapoel tel aviv",1,2);
	    game g4 = new game("15.5.20",1,0,90,"Hapoel Beer Sheva",1,0);
	    game g5 = new game("15.5.20",1,0,81,"Hapoel haifa",0,1);
	    
	    //insert game to list player
	   p.addGame(g);
	   p.addGame(g1);
	   p1.addGame(g2);
	   p1.addGame(g3);
	   p2.addGame(g4);
	   p2.addGame(g5);

	    // print player information
		//System.out.println(p.toString());
	    //System.out.println(p1.toString());
	    //System.out.println(p2.toString());
	   
		
		// print games of player
		//System.out.println(p.getSetOfGames(p));
	   // System.out.println(p1.getSetOfGames(p1));
	    //System.out.println(p2.getSetOfGames(p2));
	   
		
		//list of players
		//System.out.println(players.showListPlayer());
		
		//scout can see the list of players
		//s.listPlayer=players.listPlayer;
	   //System.out.println(s.showListPlayer());
		
		// Add a player to Scout interest list
		//s.addPlayer(p);
		//s.addPlayer(p1);
		//s.addPlayer(p2);
		
		// show the interest list
	    //System.out.println(s.showInterestList());
		
		//remove from interest list
		//s.removePlayer(p);
		//System.out.println(s.showInterestList());
		
		//edit player information
		//p.editInformation("shar cohen", "maccabi tel aviv", "balam", 17, 1.80, 70.5, "shar@gmail.com");
		//System.out.println(p.toString());
		//p.getMyTeam().setTeamName("hapoel tel aviv");
		//System.out.println(p.toString());
	   
	   //System.out.println(players.getListPlayer());
	  // players.sortByNumOfAssists();
	  // System.out.println("sort by gols");
	  // System.out.println(players.getListPlayer());	
	   players.sortByNumOfAssists();
	   System.out.println("sort by assists");
	   System.out.println(players.getListPlayer());
	   players.sortByNumOfGoals();
	   System.out.println("sort by goals");
	   System.out.println(players.getListPlayer());
	   players.sortByTotalPlayingTime();
	   System.out.println("sort by playing time");
	   System.out.println(players.getListPlayer());
	   
	}

}
