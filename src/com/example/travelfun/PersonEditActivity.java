package com.example.travelfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;

public class PersonEditActivity extends Activity {
	
    private LinearLayout bar_home,bar_add,bar_person;
    private Button cancelBtn,saveBtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_person_edit);
		
		bar_home = (LinearLayout)findViewById(R.id.bar_home);
		bar_add = (LinearLayout)findViewById(R.id.bar_add);
		bar_person = (LinearLayout)findViewById(R.id.bar_person);
		
		bar_home.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonEditActivity.this,HomeActivity.class);
				startActivity(intent);
			}
			
		});
		bar_add.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonEditActivity.this,AddActivity.class);
				startActivity(intent);
			}
			
		});
		bar_person.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonEditActivity.this,PersonActivity.class);
				startActivity(intent);
			}
			
		});
		
		cancelBtn = (Button)findViewById(R.id.cancelBtn);
		saveBtn = (Button)findViewById(R.id.saveBtn);
		
		cancelBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonEditActivity.this,PersonActivity.class);
                startActivity(intent);				
			}
			
		});
		
		saveBtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(PersonEditActivity.this,PersonActivity.class);
                startActivity(intent);				
			}
			
		});
		
	}

}