package jp.mulodo.demoapput.database;

import java.util.ArrayList;

import jp.mulodo.demoapput.object.CustomerInfo;
import jp.mulodo.demoapput.object.User;

public class DataBase {
	public static ArrayList<CustomerInfo> lCutomers;
	public static ArrayList<User> lUsers;

	public DataBase() {
	
	}
	
	public void initData()
	{
		getInstanceCustomer();
		getInstanceUser();
	}
	
	public ArrayList<CustomerInfo> getInstanceCustomer()
	{
		if (lCutomers == null)
		{
			lCutomers = new ArrayList<CustomerInfo>();
			for (int i = 0; i < 20; ++i) {
				CustomerInfo customer = new CustomerInfo();
				customer.setName("Nguyen Van " + i);
				customer.setAddress((i * 2 + 1) + " vo van tan");
				customer.setEmail("abc"+i+"@a.com");
				customer.setDetail("friend");
				lCutomers.add(customer);
			}
		}
		return lCutomers;
	}
	
	public ArrayList<User> getInstanceUser()
	{
		if (lUsers == null)
		{
			lUsers = new ArrayList<User>();
			for (int i = 0; i < 20; ++i) {
				User user = new User();
				user.setLogged(false);
				user.setId(i+"");
				user.setUserName("mr_"+i);
				user.setPassword("123"+i);
				lUsers.add(user);
			}
		}
		return lUsers;
	}
	
	
	
}
