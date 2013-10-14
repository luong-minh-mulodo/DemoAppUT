package jp.mulodo.demoapput.test;

import java.util.List;

import org.easymock.EasyMock;
import org.mockito.Mockito;

import jp.mulodo.demoapput.object.CustomerInfo;
import jp.mulodo.demoapput.object.User;
import junit.framework.TestCase;

public class TestMock extends TestCase {

	private List customerInfoList;
	private List<User> userList;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
//		customerInfoList = EasyMock.createNiceMock(List.class);
//		EasyMock.expect(customerInfoList .get(0)).andStubReturn("one");                             
//		EasyMock.expect(customerInfoList .get(1)).andStubReturn("two");
//		customerInfoList.clear();
//		  
//		EasyMock.replay(customerInfoList);
//
//		EasyMock.verify(customerInfoList); 


//		userList = EasyMock.createMock(List.class);
		
//		for (int i = 0; i < 20; ++i) {
//			CustomerInfo customer = new CustomerInfo();
//			customer.setName("Nguyen Van " + i);
//			customer.setAddress((i * 2 + 1) + " vo van tan");
//			customer.setEmail("abc"+i+"@a.com");
//			customer.setDetail("friend");
//			customerInfoList.add(customer);
//		}
		
	}
	
	public void testData()
	{
		
	}
}
