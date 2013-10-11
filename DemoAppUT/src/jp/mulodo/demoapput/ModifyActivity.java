package jp.mulodo.demoapput;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ModifyActivity extends FragmentActivity implements OnClickListener{
	private Button mBt_save;
	private EditText mEdt_name,mEdt_address,mEdt_email,mEdt_detail;
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub
		super.onCreate(arg0);
		setContentView(R.layout.activity_edit);
		mBt_save = (Button)findViewById(R.id.edit_btn_save);
		mEdt_name = (EditText)findViewById(R.id.edit_edt_name);
		mEdt_address = (EditText)findViewById(R.id.edit_edt_address);
		mEdt_email = (EditText)findViewById(R.id.edit_edt_email);
		mEdt_detail = (EditText)findViewById(R.id.edit_edt_detail);
		
		mBt_save.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.edit_btn_save)
		{
			finish();
		}
	}
}