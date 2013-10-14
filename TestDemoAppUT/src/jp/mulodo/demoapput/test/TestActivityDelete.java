package jp.mulodo.demoapput.test;


import com.jayway.android.robotium.solo.Solo;

import jp.mulodo.demoapput.AddActivity;
import jp.mulodo.demoapput.DeleteActivity;
import jp.mulodo.demoapput.ListCustomersActivity;
import jp.mulodo.demoapput.LoginActivity;
import jp.mulodo.demoapput.MainActivity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;

public class TestActivityDelete extends
		ActivityInstrumentationTestCase2<ListCustomersActivity> {
	
	private Solo solo;
	
	public TestActivityDelete() {
		super(ListCustomersActivity.class);
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
	
	public void testDeleteData()
	{
		
			
	}

}
