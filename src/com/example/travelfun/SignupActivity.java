package com.example.travelfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SignupActivity extends Activity {
	
	private Button confirmbtn,cancelbtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
		confirmbtn = (Button)findViewById(R.id.signup_confirmBtn);
		confirmbtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
							
			}
		});
		
		cancelbtn = (Button)findViewById(R.id.signup_cancelBtn);
		cancelbtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(SignupActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});
	}

}