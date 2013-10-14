package jp.mulodo.demoapput.test;

import jp.mulodo.demoapput.controller.UserController;
import jp.mulodo.demoapput.database.DataBase;
import jp.mulodo.demoapput.error.ErrorBase;
import junit.framework.TestCase;

public class TestController extends TestCase {

	private UserController userController;
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		DataBase dataBase = new DataBase();
		dataBase.initData();
		userController = new UserController();
	}
	
	/*******************************************************************************
	 * Begin case Login
	 */
	
	/**
	 * Test Login with parameter Null
	 */
	public void testLoginNull ()
	{
		try {
			assertTrue(UserController.login("",""));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		}	
	}
	
	/**
	 * Test Login with parameter Null UserName
	 */
	public void testLoginNullUserName ()
	{
		try {
			assertTrue(UserController.login("","1231"));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		}	
	}
	
	/**
	 * Test Login with parameter Null Password
	 */
	public void testLoginNullPassword ()
	{
		try {
			assertTrue(UserController.login("mr_1",""));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		}	
	}
	
	/**
	 * Test Login with parameter user or pass not correct
	 */
	public void testLoginFail ()
	{
		try {
			assertTrue(UserController.login("mr_3232","1231"));
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		}
	}
	
	/**
	 * Test Login Success
	 */
	public void testLoginSuccess ()
	{
		try {
			assertTrue(UserController.login("mr_1","1231"));
			
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
			// TODO Auto-generated catch block
			fail("Error: " + e.getMessage());
		}
				
	}
	
	/**
	 * End case Login
	 ***********************************************************************/
	
	/*******************************************************************************
	 * Begin case Add
	 */
	
	public void testAddNull()
	{
		
	}
	
	
	/**
	 * End case Add
	 ***********************************************************************/
	
}
