package jp.mulodo.demoapput;

import jp.mulodo.demoapput.controller.UserController;
import jp.mulodo.demoapput.database.DataBase;
import jp.mulodo.demoapput.error.ErrorBase;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * 
 * @author nguyenvantu
 *
 */
public class DeleteActivity extends FragmentActivity implements OnClickListener {
	private Button mBtn_yes, mBtn_no;
	private int mPosition;
	@Override
	protected void onCreate(Bundle arg0) {
		// TODO Auto-generated method stub;
		super.onCreate(arg0);
		DataBase dataBase = new DataBase();
		dataBase.initData();
		setContentView(R.layout.activity_delete);
		mBtn_yes = (Button) findViewById(R.id.delete_btn_yes);
		mBtn_no = (Button) findViewById(R.id.delete_btn_no);

		mBtn_no.setOnClickListener(this);
		mBtn_yes.setOnClickListener(this);
		
		Bundle data = getIntent().getExtras();
		mPosition = data.getInt("position");
		Log.e("Postion", ""+mPosition);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.delete_btn_yes:
			try {
				UserController.delete(mPosition);
				finish();

			}  catch (ErrorBase e) {

			}
			
			break;
		case R.id.delete_btn_no:
			finish();
			break;

		default:
			break;
		}
	}

}
