package com.example.travelfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AddActivity extends Activity {
	
    private LinearLayout bar_home,bar_add,bar_person;
    private Button cancelBtn,sendBtn;
    private ImageView addphotoBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_add);
		
		bar_home = (LinearLayout)findViewById(R.id.bar_home);
		bar_add = (LinearLayout)findViewById(R.id.bar_add);
		bar_person = (LinearLayout)findViewById(R.id.bar_person);
		
		bar_home.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(AddActivity.this,HomeActivity.class);
				startActivity(intent);
			}
			
		});
		bar_add.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(AddActivity.this,AddActivity.class);
				startActivity(intent);
			}
			
		});
		bar_person.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(AddActivity.this,PersonActivity.class);
				startActivity(intent);
			}
			
		});
		
		cancelBtn = (Button)findViewById(R.id.cancelBtn);
		sendBtn = (Button)findViewById(R.id.sendBtn);
		
		cancelBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(AddActivity.this,HomeActivity.class);
				startActivity(intent);
			}
			
		});
		sendBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
			}
			
		});
		
//		addphotoBtn = (ImageView)findViewById(R.id.addphotoBtn);
//		
//		addphotoBtn.setOnClickListener(new OnClickListener(){
//
//			@Override
//			public void onClick(View v) {
//				
//			}
//			
//		});

	}

}