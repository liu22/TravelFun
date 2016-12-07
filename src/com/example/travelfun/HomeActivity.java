package com.example.travelfun;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class HomeActivity extends Activity {
	
    private LinearLayout bar_home,bar_add,bar_person;
    private ListView listView;   
    private ImageView imgView;   
    private TextView textView;  
    private Integer[] imgID = {R.drawable.item1,    
            R.drawable.item2, R.drawable.item3,   
            R.drawable.item4, R.drawable.item5,   
            R.drawable.item6,R.drawable.item7};   
    private String[] item_title = {"美丽的自然风光1", "美丽的自然风光2",    
            "美丽的自然风光3", "美丽的自然风光4", "美丽的自然风光5", "美丽的自然风光6","美丽的自然风光7"};   

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_home);
        
        listView = (ListView) findViewById(R.id.content);
        HomeAdapter adapter = new HomeAdapter(HomeActivity.this,0,getData());
        listView.setAdapter(adapter);
        
        listView.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				Intent intent = new Intent(HomeActivity.this,HomeDetailActivity.class);
                startActivity(intent);				
			}
        	
        });
		  	
		bar_home = (LinearLayout)findViewById(R.id.bar_home);
		bar_add = (LinearLayout)findViewById(R.id.bar_add);
		bar_person = (LinearLayout)findViewById(R.id.bar_person);
		
		bar_home.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeActivity.this,HomeActivity.class);
				startActivity(intent);
			}
			
		});
		bar_add.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeActivity.this,AddActivity.class);
				startActivity(intent);
			}
			
		});
		bar_person.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(HomeActivity.this,PersonActivity.class);
				startActivity(intent);
			}
			
		});
	}
	
	private List<HomeItem> getData() {
        List<HomeItem> list= new ArrayList<HomeItem>();
        for(int i=0;i<imgID.length;i++)
        {
        	HomeItem p = new HomeItem(imgID[i],item_title[i]);
            list.add(p);
        }
        return list;
    }

}