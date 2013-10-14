package jp.mulodo.demoapput.test;

import jp.mulodo.demoapput.AddActivity;
import jp.mulodo.demoapput.database.DataBase;
import junit.framework.Assert;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.widget.EditText;

import com.jayway.android.robotium.solo.Solo;

public class TestAdd extends ActivityInstrumentationTestCase2<AddActivity> {

	private Solo solo;

	public TestAdd() {
		super(AddActivity.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		solo = new Solo(getInstrumentation(), getActivity());
		DataBase dataBase = new DataBase();
		dataBase.initData();
	}

	@Override
	public void tearDown() throws Exception {
		// tearDown() is run after a test case has finished.
		// finishOpenedActivities() will finish all the activities that have
		// been opened during the test execution.
		solo.finishOpenedActivities();
	}

	public void testLayout() {
		solo.assertCurrentActivity("AddActivity", AddActivity.class);
		EditText edt_name = (EditText) solo
				.getView(jp.mulodo.demoapput.R.id.add_edt_name);
		solo.clearEditText(edt_name);
		solo.enterText(edt_name, "Adison");
		EditText edt_address = (EditText) solo
				.getView(jp.mulodo.demoapput.R.id.add_edt_address);
		solo.clearEditText(edt_address);
		solo.enterText(edt_address, "90hoangdieu");
		EditText edt_email = (EditText) solo
				.getView(jp.mulodo.demoapput.R.id.add_edt_email);
		solo.clearEditText(edt_email);
		solo.enterText(edt_email, "abc@ya.com");
		EditText edt_detail = (EditText) solo
				.getView(jp.mulodo.demoapput.R.id.add_edt_detail);
		solo.clearEditText(edt_detail);
		solo.enterText(edt_detail, "friend");
		solo.clickOnButton("Add");
		Log.e("data", ""+DataBase.lCutomers.get(DataBase.lCutomers.size()-1).getName());
		Assert.assertEquals("Equals", edt_name.getText().toString(),
				DataBase.lCutomers.get(DataBase.lCutomers.size()-1).getName());
	}

}
