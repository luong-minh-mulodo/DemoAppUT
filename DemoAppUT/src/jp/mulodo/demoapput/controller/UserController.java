package jp.mulodo.demoapput.controller;

import jp.mulodo.demoapput.database.DataBase;
import jp.mulodo.demoapput.error.ErrorBase;
import jp.mulodo.demoapput.error.ErrorLogin;
import jp.mulodo.demoapput.object.CustomerInfo;
import jp.mulodo.demoapput.object.User;

public class UserController {
	
	/**
	 * Login in system
	 * @throws ErrorBase 
	 * @throws ErrorLogin if error
	 */
	public static boolean login(String UserName,String Password ) throws ErrorBase,NullPointerException
	{
		for (User user : DataBase.lUsers) {
			boolean checkUserName = user.getUserName().equals(UserName);
			boolean checkPassword = user.getPassword().equals(Password);
			if (checkPassword && checkUserName )
			{
				return true;
			}
		}
		ErrorBase error = new ErrorLogin();
		throw error;
	}
	
	
	
}
