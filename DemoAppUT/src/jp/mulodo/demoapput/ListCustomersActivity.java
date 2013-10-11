package jp.mulodo.demoapput;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ListView;

public class ListCustomersActivity extends FragmentActivity{
	private ListView mLv_user;
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_listcustomer);
		mLv_user = (ListView)findViewById(R.id.listcustom_lv_user);
	}
}
