package com.admega.truyenhay;

import com.admega.datamodel.NewsItem;
import com.admega.truyenhay.R;
import com.admega.truyenhay.adapter.CustomListAdapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;



public class NewFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.fragment_new, container, false);
		ArrayList<NewsItem> image_details = getListData();
		final ListView lv1 = (ListView) rootView.findViewById(R.id.custom_list);
		lv1.setAdapter(new CustomListAdapter(getActivity(), image_details));
		lv1.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> a, View v, int position, long id) {
				Object o = lv1.getItemAtPosition(position);
				NewsItem newsData = (NewsItem) o;
				Intent appInfo = new Intent(getActivity(), DetailsActivity.class);
			       startActivity(appInfo);
			}

		});
		
		return rootView;
	}
	
	
	private ArrayList getListData() {
		ArrayList results = new ArrayList();
		NewsItem newsData = new NewsItem();
		newsData.setHeadline("Dance of Democracy");
		newsData.setReporterName("Pankaj Gupta");
		newsData.setDate("May 26, 2013, 13:35");
//		//newsData.setUrl("http://lh5.ggpht.com/_hepKlJWopDg/TB-_WXikaYI/AAAAAAAAElI/715k4NvBM4w/s144-c/IMG_0075.JPG");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setHeadline("Major Naxal attacks in the past");
		newsData.setReporterName("Pankaj Gupta");
		newsData.setDate("May 26, 2013, 13:35");
		////newsData.setUrl("http://lh4.ggpht.com/_4f1e_yo-zMQ/TCe5h9yN-TI/AAAAAAAAXqs/8X2fIjtKjmw/s144-c/IMG_1786.JPG");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setHeadline("BCCI suspends Gurunath pending inquiry ");
		newsData.setReporterName("Rajiv Chandan");
		newsData.setDate("May 26, 2013, 13:35");
	//	//newsData.setUrl("http://lh3.ggpht.com/_GEnSvSHk4iE/TDSfmyCfn0I/AAAAAAAAF8Y/cqmhEoxbwys/s144-c/_MG_3675.jpg");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setHeadline("Life convict can`t claim freedom after 14 yrs: SC");
		newsData.setReporterName("Pankaj Gupta");
		newsData.setDate("May 26, 2013, 13:35");
		//newsData.setUrl("http://lh6.ggpht.com/_ZN5zQnkI67I/TCFFZaJHDnI/AAAAAAAABVk/YoUbDQHJRdo/s144-c/P9250508.JPG");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setHeadline("Indian Army refuses to share info on soldiers mutilated at LoC");
		newsData.setReporterName("Pankaj Gupta");
		newsData.setDate("May 26, 2013, 13:35");
		//newsData.setUrl("http://lh4.ggpht.com/_XjNwVI0kmW8/TCOwNtzGheI/AAAAAAAAC84/SxFJhG7Scgo/s144-c/0014.jpg");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setHeadline("French soldier stabbed; link to Woolwich attack being probed");
		newsData.setReporterName("Sudeep Nanda");
		newsData.setDate("May 26, 2013, 13:35");
		//newsData.setUrl("http://lh6.ggpht.com/_Nsxc889y6hY/TBp7jfx-cgI/AAAAAAAAHAg/Rr7jX44r2Gc/s144-c/IMGP9775a.jpg");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setHeadline("Life convict can`t claim freedom after 14 yrs: SC");
		newsData.setReporterName("Pankaj Gupta");
		newsData.setDate("May 26, 2013, 13:35");
		//newsData.setUrl("http://lh6.ggpht.com/_ZN5zQnkI67I/TCFFZaJHDnI/AAAAAAAABVk/YoUbDQHJRdo/s144-c/P9250508.JPG");
		results.add(newsData);

		newsData = new NewsItem();
		newsData.setHeadline("Dance of Democracy");
		newsData.setReporterName("Pankaj Gupta");
		newsData.setDate("May 26, 2013, 13:35");
		//newsData.setUrl("http://lh5.ggpht.com/_hepKlJWopDg/TB-_WXikaYI/AAAAAAAAElI/715k4NvBM4w/s144-c/IMG_0075.JPG");
		results.add(newsData);
		
		

		return results;
	}
}
