package com.example.travelfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity {
	
	private Button confirmbtn,cancelbtn;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		confirmbtn = (Button)findViewById(R.id.login_confirmBtn);
		confirmbtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
				startActivity(intent);
			}
		});
		
		cancelbtn = (Button)findViewById(R.id.login_cancelBtn);
		cancelbtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				Intent intent = new Intent(LoginActivity.this,MainActivity.class);
				startActivity(intent);
			}
		});
	}

}
