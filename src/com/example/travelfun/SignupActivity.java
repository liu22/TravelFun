package com.example.travelfun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends Activity {
	
	private Button confirmbtn,cancelbtn;
	private EditText username,userpwd,userpwdRepeat;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		
		username = (EditText)findViewById(R.id.EditText_username);
		userpwd = (EditText)findViewById(R.id.EditText_password);
		userpwdRepeat = (EditText)findViewById(R.id.EditText_password_repeat);
		
		username.setOnFocusChangeListener(new OnFocusChangeListener(){

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(hasFocus) {
					
				} 
				else {				
					if(username.getText().toString().length()<=0){
						Toast.makeText(SignupActivity.this, "用户名不能为空！", Toast.LENGTH_SHORT).show();
					}			    
				}
				
			}
			
		});
		userpwd.setOnFocusChangeListener(new OnFocusChangeListener(){

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(hasFocus) {
					
				} 
				else {
					if(userpwd.getText().toString().length()<=0){
						Toast.makeText(SignupActivity.this, "密码不能为空！", Toast.LENGTH_SHORT).show();
					}
					else if(!(userpwd.getText().toString().equals(userpwdRepeat.getText().toString()))){
						Toast.makeText(SignupActivity.this, "两次密码输入不一致！", Toast.LENGTH_SHORT).show();
					}				    
				}
				
			}
			
		});
		userpwdRepeat.setOnFocusChangeListener(new OnFocusChangeListener(){

			@Override
			public void onFocusChange(View v, boolean hasFocus) {
				if(hasFocus) {
					
				} 
				else {
					if(userpwdRepeat.getText().toString()==""){
						Toast.makeText(SignupActivity.this, "密码不能为空！", Toast.LENGTH_SHORT).show();
					}
					else if(!(userpwd.getText().toString().equals(userpwdRepeat.getText().toString()))){
						Toast.makeText(SignupActivity.this, "两次密码输入不一致！", Toast.LENGTH_SHORT).show();
					}				    
				}
				
			}
			
		});
		
		confirmbtn = (Button)findViewById(R.id.signup_confirmBtn);
		confirmbtn.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				
				if((username.getText().toString().length()<=0)||(userpwd.getText().toString().length()<=0)||(userpwdRepeat.getText().toString().length()<=0)){
					Toast.makeText(SignupActivity.this, "请输入完整信息！", Toast.LENGTH_SHORT).show();
				}
				else if(!(userpwd.getText().toString().equals(userpwdRepeat.getText().toString()))){
					Toast.makeText(SignupActivity.this, "两次密码输入不一致！", Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(SignupActivity.this, "注册成功！", Toast.LENGTH_SHORT).show();
					Intent intent = new Intent(SignupActivity.this,MainActivity.class);
					startActivity(intent);
				}
							
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