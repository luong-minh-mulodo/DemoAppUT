package jp.mulodo.demoapput.test;


import com.jayway.android.robotium.solo.Solo;

import jp.mulodo.demoapput.AddActivity;
import jp.mulodo.demoapput.LoginActivity;
import jp.mulodo.demoapput.MainActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class TestActivityLogin extends
		ActivityInstrumentationTestCase2<LoginActivity> {
	
	private Solo solo;
	
	public TestActivityLogin() {
		super(LoginActivity.class);
	}
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testLogin()
	{
		Log.e("TAG", "Login S");
		solo.enterText(0, "mr_1");
		solo.enterText(1, "1231");
		solo.clickOnButton("Login");
		assertFalse(solo.searchButton("Login"));
			
	}

}
