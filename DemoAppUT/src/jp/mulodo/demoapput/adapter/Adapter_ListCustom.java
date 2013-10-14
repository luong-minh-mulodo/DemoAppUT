package jp.mulodo.demoapput.adapter;

import java.util.List;

import jp.mulodo.demoapput.R;
import jp.mulodo.demoapput.object.CustomerInfo;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Adapter_ListCustom  extends BaseAdapter<CustomerInfo>{
	
	private List<CustomerInfo> mArr;
	private LayoutInflater inflater;
	private OnClickListListener listener;
	private int position;
	private int layout;
	private Context mContext;
	public Adapter_ListCustom(Context context, int textViewResourceId,
			List<CustomerInfo> objects,OnClickListListener listener) {
		super(context, textViewResourceId, objects);
		// TODO Auto-generated constructor stub
		this.listener = listener;
		this.layout = textViewResourceId;
		this.mArr = objects;
		this.inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.mContext = context;
	}
	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.ArrayAdapter#getCount()
	 */
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return super.getCount();
	}

	/**
	 * add new list for adapter
	 * 
	 * @method public
	 * @return void
	 */
	public void addItems(List<CustomerInfo> list) {
		mArr.addAll(list);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see android.widget.ArrayAdapter#getView(int, android.view.View,
	 * android.view.ViewGroup)
	 */
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub

		return getViewPuzzle(position, convertView);

	}

	class ViewHolder {
		Button btn_delete,btn_edit;
		TextView tv_mName;
	}

	public static interface OnClickListListener {
		public abstract void onClick_delete(CustomerInfo data);
		public abstract void onClick_edit(CustomerInfo data);
	}

	private View getViewPuzzle(final int position, View convertView) {
		View view = convertView;
		ViewHolder mHolder = null;
		
		if (view == null) {
			// ??????????????????????????????????????????????????????????????????r???????????????????????????[??????????????????null????????????????????????V?????????????????????????????????????????????r???????????????????????????[??????????????????????????????
			view = inflater.inflate(layout, null);
			mHolder = new ViewHolder();
			
			mHolder.btn_delete = (Button) view.findViewById(R.id.listitem_btn_delete);
			mHolder.btn_edit = (Button) view.findViewById(R.id.listitem_btn_edit);
			mHolder.tv_mName = (TextView) view
					.findViewById(R.id.listitem_tv_name);
			view.setTag(mHolder);
		} else {
			mHolder = (ViewHolder) view.getTag();
		}

		if (mArr.size() > 0) {
			
			final CustomerInfo top = mArr.get(position);
			mHolder.tv_mName.setText(top.getName());
			if (listener != null) {
				mHolder.btn_delete.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(final View view) {
						setPosition(position);
						listener.onClick_delete(top);
					}
				});
				mHolder.btn_edit.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(final View view) {
						setPosition(position);
						listener.onClick_edit(top);
					}
				});
			}
		}

		return view;
	}
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	
}
