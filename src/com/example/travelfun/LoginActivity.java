package com.example.travelfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	
	private Button confirmbtn,cancelbtn;
	private EditText username,userpwd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		username = (EditText)findViewById(R.id.EditText_username);
		userpwd = (EditText)findViewById(R.id.EditText_password);
		
		confirmbtn = (Button)findViewById(R.id.login_confirmBtn);
		confirmbtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				if((username.getText().toString().length()<=0)||(userpwd.getText().toString().length()<=0)){
					Toast.makeText(LoginActivity.this, "请输入完整信息！", Toast.LENGTH_SHORT).show();
				}
				else{
					Intent intent = new Intent(LoginActivity.this,HomeActivity.class);
					startActivity(intent);
				}				
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
