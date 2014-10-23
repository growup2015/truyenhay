package com.admega.truyenhay.adapter;


import java.util.ArrayList;

import com.admega.datamodel.NewsItem;
import com.admega.truyenhay.NewFragment;
import com.admega.truyenhay.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomListAdapter extends BaseAdapter {

	private ArrayList listData;

	private LayoutInflater layoutInflater;

	public CustomListAdapter(Context newFragment, ArrayList listData) {
		this.listData = listData;
		layoutInflater = LayoutInflater.from(newFragment);
	}

	@Override
	public int getCount() {
		return listData.size();
	}

	@Override
	public Object getItem(int position) {
		return listData.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		ViewHolder holder;
		if (convertView == null) {
			convertView = layoutInflater.inflate(R.layout.list_row_layout, null);
			holder = new ViewHolder();
			holder.headlineView = (TextView) convertView.findViewById(R.id.title);
			holder.reporterNameView = (TextView) convertView.findViewById(R.id.reporter);
			holder.reportedDateView = (TextView) convertView.findViewById(R.id.date);
			//holder.imageView = (ImageView) convertView.findViewById(R.id.thumbImage);
			convertView.setTag(holder);
		} else {
			holder = (ViewHolder) convertView.getTag();
		}

		NewsItem newsItem = (NewsItem) listData.get(position);

		holder.headlineView.setText(newsItem.getHeadline());
		holder.reporterNameView.setText("By, " + newsItem.getReporterName());
		holder.reportedDateView.setText(newsItem.getDate());

//		if (holder.imageView != null) {
//			new ImageDownloaderTask(holder.imageView).execute(newsItem.getUrl());
//		}

		return convertView;
	}

	static class ViewHolder {
		TextView headlineView;
		TextView reporterNameView;
		TextView reportedDateView;
//		ImageView imageView;
	}
}