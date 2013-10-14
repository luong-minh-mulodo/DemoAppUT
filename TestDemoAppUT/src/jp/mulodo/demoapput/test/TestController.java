package jp.mulodo.demoapput.test;

import jp.mulodo.demoapput.controller.UserController;
import jp.mulodo.demoapput.database.DataBase;
import jp.mulodo.demoapput.error.ErrorBase;
import jp.mulodo.demoapput.object.CustomerInfo;
import junit.framework.TestCase;

import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class TestController extends TestCase {
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		DataBase dataBase = new DataBase();
		dataBase.initData();
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
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
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
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
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
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
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
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
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
			fail("Error: " + e.getMessage());
		} catch (ErrorBase e) {
			fail("Error: " + e.getMessage());
		}
				
	}
	
	/**
	 * End case Login
	 ***********************************************************************/
	
	/*******************************************************************************
	 * Begin case Add
	 */
	
	/**
	 * Test Add with Null parameter
	 */
	public void testAddNull()
	{
		try {
			assertTrue(UserController.add(null));
		} catch (ErrorBase e) {
			fail("Error: " + e.getMessage());
		}		
	}
	
	/**
	 * Test Add with Null parameter
	 */
	public void testAddSuccess()
	{
		try {
			CustomerInfo customerInfo = new CustomerInfo();
			customerInfo.setAddress("address");
			customerInfo.setName("name");
			customerInfo.setEmail("email");
			customerInfo.setDetail("detail");
			assertTrue(UserController.add(customerInfo));
		} catch (ErrorBase e) {
			fail("Error: " + e.getMessage());
		}
		
	}
	
	
	/**
	 * End case Add
	 ***********************************************************************/
	
	/*******************************************************************************
	 * Begin case Remove
	 */
	
	public void testDeteleFail()
	{
		try {
			assertTrue(UserController.delete(9999));
		} catch (ErrorBase e) {
			fail("Error: " + e.getMessage());
		}		
	}
	
	public void testDeteleSuccess()
	{
		try {
			assertTrue(UserController.delete(0));
		} catch (ErrorBase e) {
			fail("Error: " + e.getMessage());
		}		
	}
	
	/**
	 * End case Remove
	 ***********************************************************************/
	
	/*******************************************************************************
	 * Begin case Get
	 */
	public void testGetCustomerInfo()
	{
		assertNotNull(DataBase.lCutomers);
	}
	
	public void testGetUserInfo()
	{
		assertNotNull(DataBase.lUsers);
	}
	
	/**
	 * End case get
	 ***********************************************************************/

}
