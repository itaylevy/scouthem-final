package model;

public class main {

	public static void main(String[] args) {
		//����� �����
		scout s=new scout();
		scout s1=new scout("mor","hapoel tel aviv","mC1527101215",204272231,null);
		scout s2=new scout("oz","hapoel tel aviv","mC1527101215",204272231,null);
		s.addScout(s1);
		s.addScout(s2);
		
		//����� ���� ���
		player p = new player();
		player p1 = new player();
		
	    //����� ������
	    player_List players = new player_List();
	    players.addplayer(p);
	    players.addplayer(p1);

	    //����� ���� �����
	    game g = new game("15.5.20",1,0,94,"Beitar Jerusalem",1,3);
	    game g1 = new game("17.5.20",1,0,60,"maccabi hanazim",0,2);
	    game g2 = new game("21.5.20",1,0,45,"maccabi haifa",1,0);
	    
	    //����� �� ���� ������ ����
	   p.addGame(g);

		//����� ��������
		System.out.println(p.getSetOfGames());
		
		//����� ������
		System.out.println(players.getListPlayer());		

	}

}
