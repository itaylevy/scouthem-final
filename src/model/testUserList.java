package model;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class testUserList {
	
	private static userList u;
	
	@BeforeClass
	public static void setUp() {
		u = new userList();
	}

	@Test
	public void loginTest() {
		
		u.singUpPlayer("mor", "hapoel tel aviv", "center back", 15, 1.83, 76.5, "mor@gmail.com", 123456789, "morcohen", "123456");
		u.singUpScout("itay", "hapoel tel aviv", 123456786, "itaylevi", "123456");
		
		int n = u.getUserList().size();
		assertEquals("when adding new two users, number of users should be 2!",2 ,n);
	}

	//@Test
	//public void LoginTest() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//public void SingUpPlayerTest() {
	//	fail("Not yet implemented");
	//}

	//@Test
	//public void SingUpScoutTest() {
	//	fail("Not yet implemented");
	//}

}
