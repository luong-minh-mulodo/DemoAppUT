package jp.mulodo.demoapput.test;


import org.mockito.Mockito;

import com.jayway.android.robotium.solo.Solo;

import jp.mulodo.demoapput.AddActivity;
import jp.mulodo.demoapput.DeleteActivity;
import jp.mulodo.demoapput.ListCustomersActivity;
import jp.mulodo.demoapput.LoginActivity;
import jp.mulodo.demoapput.MainActivity;
import jp.mulodo.demoapput.database.DataBase;
import junit.framework.Assert;
import android.content.Intent;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class TestActivityDelete extends
		ActivityInstrumentationTestCase2<DeleteActivity> {
	
	private Solo solo;
	private String data;
	public TestActivityDelete() {
		super(DeleteActivity.class);
		Intent i = new Intent();
		i.putExtra("Postion", "1");
		setActivityIntent(i);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		DataBase dataBase = new DataBase();
		dataBase.initData();
		data = DataBase.lCutomers.get(1).getName();
		
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
//	public void testDeleteData()
//	{
//		Log.e("DATA",data);
//		solo.clickOnButton("Yes");
////		Log.e("DATA 1", DataBase.lCutomers.get(1).getName());
//		DataBase mockDB = Mockito.mock(DataBase.class);
//		Assert.assertEquals(data, mockDB.lCutomers.get(1).getName());
//	}
	public void testCancelData()
	{
//		Log.e("DATA",data);
		solo.clickOnButton("No");
//		Log.e("DATA 1", DataBase.lCutomers.get(1).getName());
		DataBase mockDB = Mockito.mock(DataBase.class);
		Assert.assertEquals("No Equal", data, mockDB.lCutomers.get(1).getName() );
	}
	
}
