package model;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testUserList {
	
	private test t;
	private ArrayList<user> userList;
	
	@Before
	public void setUp() {
		t = new test();
		userList = new ArrayList<user>();
	}

	@Test
	public void loginTest() {
		userList u = new userList();
		t.testSignUpPlayer("mor", "hapoel tel aviv", "center back", 15, 1.83, 76.5, "mor@gmail.com", 123456789, "mor", "1");
		assertNotNull("After LOGIN the object will return and not NULL",u.login("mor", "1"));
	}

	@Test
	public void SingUpUserTest() {
		t.testSignUpPlayer("mor", "hapoel tel aviv", "center back", 15, 1.83, 76.5, "mor@gmail.com", 123456789, "mor", "1");
		t.testSignUpScout("itay", "hapoel tel aviv", 123456786, "itay", "1");
		userList = (ArrayList<user>) t.getUserList();
		int n = userList.size();
		assertEquals("when adding new two users, number of users should be 2!",2 ,n);
	}
	
	@After
	public void tearDown() {
		 File myObj = new File("testUers.txt");
		 myObj.delete();
	}

}
