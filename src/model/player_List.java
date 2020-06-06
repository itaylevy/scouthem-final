package model;

import java.util.ArrayList;

public class player_List{
	
	private ArrayList<player> ArraylistPlayer= new ArrayList<player>();
	private ArrayList<player> sotrArraylistPlayer= new ArrayList<player>();
	/////////////////////////////////////////	
			 
	public player_List() {
		super();
			// TODO Auto-generated constructor stub
		}
	/////////////////////////////////////////
	
	public ArrayList<player> getListPlayer() {
		return ArraylistPlayer;
	}
	public void setListPlayer(ArrayList<player> listPlayer) {
		this.ArraylistPlayer = listPlayer;
	}
	/////////////////////////////////////////
	public ArrayList<player> showListPlayer() {
		return ArraylistPlayer;
	}
	public void addplayer(user p)
	{
		ArraylistPlayer.add((player) p);	
	}
	
	//
	//design pattern of sorting
	public <T> void Sort(String x, T y)
	{
		//x = role/player name/age/goal/assists/playing time/team
		//y = Specific name/Specific role/Specific age
		//role(Goal keeper, Centre back, Left defender, Right defender, midfield, Centre forward)
		
		switch(x) {
		 case "role":
			 sortByRole(x, y);
			 break;
		 case "player name":
			 sortByplayerName(x, y);
			 break;
		 case "age":
			 sortByAge(x, y);
			 break;
		 case "team":
			 sortByTeam(x, y);
			 break;
		 case "goal":
			 sortByX(x);
			 break;
		 case "assists":
			 sortByX(x);
			 break;
		 case "playing time":
			 sortByX(x);
			 break;
		  default:
		   break;
		}
	}
	
	private void sortByX(String x) {
		// sort by: total playing time||assists||goal...
		 int n=ArraylistPlayer.size();
		 player[] sortByPlayingTime = new player[n];
		 copylist(ArraylistPlayer, sortByPlayingTime);
		 mergeSort(sortByPlayingTime, sortByPlayingTime.length, x);
		 print(sortByPlayingTime, x);
		}
	private <T>void sortByRole(String x, T y)
	{
		 int n=ArraylistPlayer.size();
		 player[] sortByRole = new player[n];
		 int j=0;
		 for (int i = 0; i < n; i++) 
				if(ArraylistPlayer.get(i).getRole() == y)
					sortByRole[j++] = ArraylistPlayer.get(i);
		 print(sortByRole, x);		
	}
	private <T>void sortByplayerName(String x, T y)
	{
		 int n=ArraylistPlayer.size();
		 player[] sortByplayerName = new player[n];
		 
		 int j=0;
		 for (int i = 0; i < n; i++) 
				if(ArraylistPlayer.get(i).getPlayerName() == y)
					sortByplayerName[j++] = ArraylistPlayer.get(i);
			
		 print(sortByplayerName, x);
		
	}	
	private <T>void sortByAge(String x, T y)
	{
		 int n=ArraylistPlayer.size();
		 player[] sortByAge = new player[n];
		 for (int i = 0; i < n; i++) 
				if(ArraylistPlayer.get(i).getAge() == (int)y)
					sortByAge[i] = ArraylistPlayer.get(i);
		print(sortByAge, x);
		
	}
	private <T>void sortByTeam(String x, T y)
	{
		 int n=ArraylistPlayer.size();
		 player[] sortByTeam = new player[n];
		 for (int i = 0; i < n; i++) 
				if(ArraylistPlayer.get(i).getMyTeam().getTeamName() == y)
					sortByTeam[i] = ArraylistPlayer.get(i);
		print(sortByTeam, x);
		
	}
	
	private void copylist(ArrayList<player> arraylistPlayer, player[] sortByGoal) {
		for(int i=0; i<arraylistPlayer.size();i++)
		{
			sortByGoal[i]=arraylistPlayer.get(i);
		}
	}
	public static void mergeSort(player[] a, int n, String x) {
	    if (n < 2) {
	        return;
	    }
	    int mid = n / 2;
	    player[] l = new player[mid];
	    player[] r = new player[n - mid];
	 
	    for (int i = 0; i < mid; i++) {
	        l[i] = a[i];
	    }
	    for (int i = mid; i < n; i++) {
	        r[i - mid] = a[i];
	    }
	    mergeSort(l, mid, x);
	    mergeSort(r, n - mid, x);
	 
	    
	    merge(a, l, r, mid, n - mid, x);	    
	}
	public static void merge(player[] a, player[] l, player[] r, int left, int right, String x) {
			  
			    int i = 0, j = 0, k = 0;
			    while (i < left && j < right) {
			    	if (x == "goal")
			    	{
					        if (l[i].getGoals() >= r[j].getGoals()) 
					            a[k++] = l[i++];
					        else 
					            a[k++] = r[j++];
			    	}
			    	else if (x == "assists")
			    	{
					        if (l[i].getNumOfAssists() >= r[j].getNumOfAssists()) {
					        	if(l[i].getNumOfAssists() == r[j].getNumOfAssists() && l[i].getGoals() <= r[j].getGoals())
					        	{
					        		a[k++] = r[j++];
					        	}
					        	else
					        	{
					            a[k++] = l[i++];
					        	}
					        
					        }
					        else 
					            a[k++] = r[j++];
			    	}
			    	else if (x == "playing time")
			    	{	        if (l[i].getGoals() <= r[j].getGoals()) 
						            a[k++] = l[i++];
						        else 
						            a[k++] = r[j++];
			    	}
			    } 

			    while (i < left) {
			        a[k++] = l[i++];
			    }
			    while (j < right) {
			        a[k++] = r[j++];
			    }	
	}
	private void print(player[] print, String x) {
		 System.out.println("sort by "+ x + ":");
		for(int i=0; i<print.length;i++)
		{
			if(print[i] != null)
			{
				System.out.println(print[i]);
			}
			
		}		
	}
	
}
