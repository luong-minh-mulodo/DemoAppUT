package jp.mulodo.demoapput.adapter;

import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

public abstract class BaseAdapter<T> extends ArrayAdapter<T>  {

	public BaseAdapter(Context context, int textViewResourceId, List<T> objects) {
		super(context, textViewResourceId, objects);
	}
}
