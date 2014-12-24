package com.example.giridviewapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {
private Context mContext;
	
	public ImageAdapter(Context context) {
		mContext=context;
	}
	@Override
	public int getCount() {
		return  mThumbIds.length;
		
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		ImageView imageview;
		if(convertView == null){
			imageview=new ImageView(mContext);
			imageview.setLayoutParams(new GridView.LayoutParams(150,150));
			imageview.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageview.setPadding(5, 5, 5, 5);
		}
		else{
			imageview=(ImageView) convertView;
		}
		imageview.setImageResource(mThumbIds[position]);
		
		return imageview;
	}

	public Integer[] mThumbIds = {
			R.drawable.sample_0,R.drawable.sample_1,
			R.drawable.sample_2,R.drawable.sample_3,
			R.drawable.sample_4,R.drawable.sample_5,
			R.drawable.sample_6,R.drawable.sample_7
	}; 
	
}
