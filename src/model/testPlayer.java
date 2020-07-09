package model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.File;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class testPlayer {
	
	private test t;
	private player p;
	private ArrayList<player> playerListplayer;
	
	@Before
	public void setUp() {
		t = new test();	
		p = new player();
		playerListplayer = new ArrayList<player>();
	}
	
	@Test
	public void addGameTest()
	{
		t.testSignUpPlayer("mor", "hapoel tel aviv", "center back", 15, 1.83, 76.5, "mor@gmail.com", 123456789, "mor", "1");
		game g = new game("3.7.20", 1, 0, 90, "Maccabi tel aviv", 1, 2);
		playerListplayer = t.getTestplayersList();
		
		for(int i=0; i<playerListplayer.size(); i++)
		{	
			if((playerListplayer.get(i)).getIdPlayer() == 123456789) {
				
				playerListplayer.get(i).setYellowCard(g.getYellowCard());
				playerListplayer.get(i).setRedCard(g.getRedCard());
				playerListplayer.get(i).setTotalPlayingTime(g.getPlayTimeGame());
				playerListplayer.get(i).setNumOfAssists(g.getNumOfAssists());
				playerListplayer.get(i).setGoals(g.getNumOfGoals());				
				break;
			}
		}
			t.testWriteToPlayersListFile(playerListplayer);	
			System.out.println(playerListplayer);
			
			assertEquals("when adding 1 yellow card , number of yellow card should be 1!",1 ,playerListplayer.get(0).getYellowCard());
			assertEquals("number of red card  should be 0!",0 ,playerListplayer.get(0).getRedCard());
			assertEquals("number of total playing time should be 90!",90 ,playerListplayer.get(0).getTotalPlayingTime());
			assertEquals("when adding 1 assist , number of assist should be 1!",1 ,playerListplayer.get(0).getNumOfAssists());
			assertEquals("when adding 2 goals , number of goals should be 2!",2 ,playerListplayer.get(0).getGoals());
	}
	
//	@Test
//	public void removePlayerFromInterestingListTest()
//	{
//		t.testSignUpPlayer("mor", "hapoel tel aviv", "center back", 15, 1.83, 76.5, "mor@gmail.com", 123456789, "mor", "1");
//		InterestListplayer = (ArrayList<user>) t.getUserList();
//		int n = InterestListplayer.size();
//		assertEquals("when adding new player , number of Interest players should be 1!",1 ,n);
//		assertNotNull("After adding player the Interest List players will return and not NULL",InterestListplayer);
//		t.removeInterestingPlayer(123456789);
//		InterestListplayer = (ArrayList<user>) t.getUserList();
//		n = InterestListplayer.size();
//		assertEquals("when adding new player , number of Interest players should be 1!",0 ,n);
//	}
	
	@After
	public void tearDown() {
		 File myObj = new File("testUers.txt");
		 myObj.delete();
		 File myObj1 = new File("playersUers.txt");
		 myObj1.delete();
	}

}
