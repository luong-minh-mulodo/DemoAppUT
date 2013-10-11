package jp.mulodo.demoapput.database;

import java.util.ArrayList;

import jp.mulodo.demoapput.object.CustomerInfo;
import jp.mulodo.demoapput.object.User;

public class DataBase {
	private ArrayList<CustomerInfo> listCutomers;
	private ArrayList<User> listUsers;

	public DataBase() {
		listCutomers = new ArrayList<CustomerInfo>();
		listUsers = new ArrayList<User>();
		for (int i = 0; i < 20; ++i) {
			CustomerInfo customer = new CustomerInfo();
			customer.setName("Nguyen Van " + i);
			customer.setAddress((i * 2 + 1) + " vo van tan");
			listCutomers.add(customer);
			User user = new User();
			user.setLogged(false);
			user.setId(i+"");
			user.setUserName("mr_"+i);
			user.setPassword("123"+i);
			listUsers.add(user);
		}

	}
}
