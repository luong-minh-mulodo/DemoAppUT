package jp.mulodo.demoapput;

import jp.mulodo.demoapput.database.DataBase;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements OnClickListener {
	private Button mBt_add, mBt_list;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//
		DataBase dataBase = new DataBase();
		dataBase.initData();
		
		setContentView(R.layout.activity_main);
		mBt_add = (Button) findViewById(R.id.mainactivity_btn_add);
		mBt_list = (Button) findViewById(R.id.mainactivity_btn_list);

		mBt_add.setOnClickListener(this);
		mBt_list.setOnClickListener(this);
		// Test Commit
		
		Intent login = new Intent(this, LoginActivity.class); 
		startActivity(login);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void testApp() {
		// test app
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.mainactivity_btn_add:
			Intent i = new Intent(getApplicationContext(),AddActivity.class);
			startActivity(i);
			break;
		case R.id.mainactivity_btn_list:
			Intent i1 = new Intent(getApplicationContext(),ListCustomersActivity.class);
			startActivity(i1);
			break;

		default:
			break;
		}
	}

}
