package jp.mulodo.demoapput.controller;

import java.util.ArrayList;
import java.util.List;

import android.util.Log;

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
	public static void add (String Name,String Address,String Email,String Detail) throws Exception
	{
		CustomerInfo customer = new CustomerInfo();
		customer.setAddress(Address);
		customer.setDetail(Detail);
		customer.setEmail(Email);
		customer.setName(Name);
		DataBase.lCutomers.add(customer);
	}
	public static void delete (int ID) throws Exception
	{
		DataBase.lCutomers.remove(ID);
	}
	public static void getAllCustomer()
	{
		for(CustomerInfo custom : DataBase.lCutomers)
		{
			Log.e("Name", custom.getName());
		}
	}
	public static void getAllUser()
	{
		for(User usr : DataBase.lUsers)
		{
			Log.e("Name", usr.getUserName());
		}
	}
	
	
	
}
