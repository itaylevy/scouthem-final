package model;

import model.player_List;

public class main {

	public static <T> void main(String[] args) {
		
		//
		//Create a new scout
		//
		user s=new scout("oz","hapoel tel aviv", 233465583, "oz", "654321");
		user s1=new scout("lior","maccabi tel aviv", 295749937, "lior", "654321");
		user s2=new scout("eli","hapoel haifa", 593200345, "eli", "654321");
		user s3=new scout("dor","maccbai haifa", 264738859, "dor", "654321");
		user s4=new scout("shahar","Hapoel Beer Sheva", 193385594, "shahar", "654321");
		user s5=new scout("yoni","Beitar Jerusalem", 974636649, "yoni", "654321");
				
		//
		//Create a new player
		//
		user p = new player("mor","hapoel tel aviv", "Centre-back", 14, 1.75, 69.4, "mor@gmail.com", 207275631,"morcohen", "123456");
		user p1 = new player("niv","Beitar Jerusalem", "midfield", 16, 1.83, 72.4, "niv@gmail.com", 207775631,"niv", "123456");
		user p2 = new player("itay","Hapoel Petah Tikva", "Centre forward", 17, 1.77, 70.4, "itay@gmail.com", 207365431,"itay", "123456");
		user p3 = new player("sagi","Bnei Yehuda", "Centre forward", 17, 1.77, 70.4, "itay@gmail.com", 207365431,"sagi", "123456");
		user p4 = new player("shaked","Beitar Jerusalem", "Centre forward", 17, 1.77, 70.4, "itay@gmail.com", 207365431,"shaked", "123456");
		user p5 = new player("yoav","Hapoel Raanana", "Centre forward", 17, 1.77, 70.4, "itay@gmail.com", 207365431,"yoav", "123456");
	    
		//
	    //insert to list
		//
	    player_List players = new player_List();
	    players.addplayer(p);
	    players.addplayer(p1);
	    players.addplayer(p2);
	    players.addplayer(p3);
	    players.addplayer(p4);
	    players.addplayer(p5);

	    //
	    //Creating a game for a player
	    //
	    game g = new game("15.5.20",1,0,94,"Beitar Jerusalem",1,0);
	    game g1 = new game("15.5.20",1,0,90,"Maccabi tel aviv",0,0);
	    game g2 = new game("15.5.20",1,0,65,"Maccabi haifa",1,1);
	    game g3 = new game("15.5.20",1,0,70,"Hapoel tel aviv",1,2);
	    game g4 = new game("15.5.20",1,0,90,"Hapoel Beer Sheva",1,0);
	    game g5 = new game("15.5.20",1,0,81,"Hapoel haifa",0,1);
	    game g6 = new game("15.5.20",1,0,94,"Beitar Jerusalem",1,0);
	    game g7 = new game("15.5.20",1,0,90,"Maccabi tel aviv",0,0);
	    game g8 = new game("15.5.20",1,0,65,"Maccabi haifa",1,1);
	    game g9 = new game("15.5.20",1,0,70,"Hapoel tel aviv",1,2);
	    game g10 = new game("15.5.20",1,0,90,"Hapoel Beer Sheva",1,0);
	    game g11 = new game("15.5.20",1,0,81,"Hapoel haifa",0,1);
	    game g12 = new game("15.5.20",1,0,81,"Hapoel haifa",0,1);
	    
	   //
	   //insert game to list player
	   //
	   ((player) p).addGame(g1);
	   ((player) p).addGame(g2);
	   ((player) p1).addGame(g3);
	   ((player) p1).addGame(g4);
	   ((player) p2).addGame(g5);
	   ((player) p2).addGame(g5);
	   ((player) p3).addGame(g7);
	   ((player) p3).addGame(g8);
	   ((player) p4).addGame(g9);
	   ((player) p4).addGame(g10);
       ((player) p5).addGame(g11);
	   ((player) p5).addGame(g12);
	   
        //
	    // print player information
	    //
		//System.out.println(p.toString());
	    //System.out.println(p1.toString());
	    //System.out.println(p2.toString());
	     
	   
	    //
		// print games of player
	    //
		//System.out.println(p.getSetOfGames(p));
	    // System.out.println(p1.getSetOfGames(p1));
	    //System.out.println(p2.getSetOfGames(p2));
	   
	   
	    //
		//list of players
	    //
		//System.out.println(players.showListPlayer());
		
	   
	     //
		//scout can see the list of players
	    //
		//s.listPlayer=players.listPlayer;
	   //System.out.println(s.showListPlayer());
		
	   
	    //
		// Add a player to Scout interest list
	    //
		//s.addPlayer(p);
		//s.addPlayer(p1);
		//s.addPlayer(p2);
		
	   
	    //
		// show the interest list
	    //
	    //System.out.println(s.showInterestList());
		
	   
	    //
		//remove from interest list
	    //
		//s.removePlayer(p);
		//System.out.println(s.showInterestList());
		
	   
	    //
		//edit player information
	    //
		//p.editInformation("shar cohen", "maccabi tel aviv", "balam", 17, 1.80, 70.5, "shar@gmail.com");
		//System.out.println(p.toString());
		//p.getMyTeam().setTeamName("hapoel tel aviv");
		//System.out.println(p.toString());
	   	
	   
	   //
	   // design pattern sorting
	   //
	   //players.Sort("role","Centre forward");
	   //players.Sort("player name","niv");
	   //players.Sort("team","hapoel tel aviv");
	   // players.Sort("age",14);
	   //players.Sort("goal",null);
	   // players.Sort("assists",null);
	   //players.Sort("playing time",null);
		
	   
	   // login 
		userList ul = new userList();
	    // add to list
	    ul.addUser(p);
	    ul.addUser(p1);
	    ul.addUser(p2);
	    ul.addUser(p3);
	    ul.addUser(p4);
	    ul.addUser(p5);
		
		ul.addUser(s);
		ul.addUser(s1);
		ul.addUser(s2);
		ul.addUser(s3);
		ul.addUser(s4);
		ul.addUser(s5);
		
		//
		// userName && password 
		//
	
		System.out.print(ul.login("niv", "123456"));
	}
}
