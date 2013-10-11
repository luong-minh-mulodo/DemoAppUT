package jp.mulodo.demoapput;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class DeleteActivity extends FragmentActivity implements OnClickListener {
	private Button mBtn_yes, mBtn_no;

	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub;
		super.onCreate(arg0);
		setContentView(R.layout.activity_delete);
		mBtn_yes = (Button) findViewById(R.id.delete_btn_yes);
		mBtn_no = (Button) findViewById(R.id.delete_btn_no);

		mBtn_no.setOnClickListener(this);
		mBtn_yes.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.delete_btn_yes:
			finish();
			break;
		case R.id.delete_btn_no:

			break;

		default:
			break;
		}
	}

}
