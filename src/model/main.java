package model;

public class main {

	public static void main(String[] args) {
		userList u=new userList();
		
		u.singUpPlayer("mor" , "Hapoel tel aviv", "center beack", 15, 1.83, 76.5, "mor@gmail.com", 123456789, "mor", "1");
		u.singUpPlayer("niv" , "Hapoel tel aviv", "center beack", 15, 1.83, 76.5, "mor@gmail.com", 123456781, "niv", "2");
		u.singUpPlayer("itay" , "Hapoel tel aviv", "center beack", 15, 1.83, 76.5, "mor@gmail.com", 123456782, "mor", "3");
		
		u.singUpScout("nissim", "Hapoel tel aviv", 987654321, "nissim", "4");
		u.singUpScout("betty", "Hapoel tel aviv", 987654329, "nissim", "5");
		u.singUpScout("afik", "Hapoel tel aviv", 987654328, "nissim", "6");
	}

}
