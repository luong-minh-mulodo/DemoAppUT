package jp.mulodo.demoapput;

import jp.mulodo.demoapput.database.DataBase;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ModifyActivity extends FragmentActivity implements OnClickListener {
	private Button mBt_save;
	private EditText mEdt_name, mEdt_address, mEdt_email, mEdt_detail;
	private int mPosition;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		DataBase dataBase = new DataBase();
		dataBase.initData();
		setContentView(R.layout.activity_edit);
		mBt_save = (Button) findViewById(R.id.edit_btn_save);
		mEdt_name = (EditText) findViewById(R.id.edit_edt_name);
		mEdt_address = (EditText) findViewById(R.id.edit_edt_address);
		mEdt_email = (EditText) findViewById(R.id.edit_edt_email);
		mEdt_detail = (EditText) findViewById(R.id.edit_edt_detail);
		initData();
		mBt_save.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId() == R.id.edit_btn_save) {
			getData();
			finish();
		}
	}

	public void initData() {
		Bundle data = getIntent().getExtras();
		mPosition = data.getInt("position");
		Log.e("Postion", "" + mPosition);

		mEdt_name.setText(DataBase.lCutomers.get(mPosition).getName());
		mEdt_detail.setText(DataBase.lCutomers.get(mPosition).getDetail());
		mEdt_email.setText(DataBase.lCutomers.get(mPosition).getEmail());
		mEdt_address.setText(DataBase.lCutomers.get(mPosition).getAddress());
	}

	public void getData() {
		String name = mEdt_name.getText().toString();
		String address = mEdt_address.getText().toString();
		String email = mEdt_email.getText().toString();
		String detail = mEdt_detail.getText().toString();
		try {
			DataBase.lCutomers.get(mPosition).setName(name);
			DataBase.lCutomers.get(mPosition).setDetail(detail);
			DataBase.lCutomers.get(mPosition).setEmail(email);
			DataBase.lCutomers.get(mPosition).setAddress(address);

		} catch (Exception e) {

		}

	}
}