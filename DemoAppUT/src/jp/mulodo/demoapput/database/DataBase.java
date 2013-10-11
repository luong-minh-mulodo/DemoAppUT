package jp.mulodo.demoapput.database;

import java.util.ArrayList;

import jp.mulodo.demoapput.object.CustomerInfo;
import jp.mulodo.demoapput.object.User;

public class DataBase {
	private ArrayList<CustomerInfo> lCutomers;
	private ArrayList<User> lUsers;

	public DataBase() {
		lCutomers = new ArrayList<CustomerInfo>();
		lUsers = new ArrayList<User>();
		for (int i = 0; i < 20; ++i) {
			CustomerInfo customer = new CustomerInfo();
			customer.setName("Nguyen Van " + i);
			customer.setAddress((i * 2 + 1) + " vo van tan");
			lCutomers.add(customer);
			User user = new User();
			user.setLogged(false);
			user.setId(i+"");
			user.setUserName("mr_"+i);
			user.setPassword("123"+i);
			lUsers.add(user);
		}

	}
}
