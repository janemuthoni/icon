package com.example.exam;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterscreenActivity extends ActionBarActivity implements OnClickListener {
	////declaring the variables.
	Button btndisplay, btnback;
	TextView tvusername,tvpassword,tvemail;
	String  strusername,stremail,strpassword;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		
///initializing the variables.
		

btndisplay =(Button)findViewById(R.id.buttondisplay);
btndisplay.setOnClickListener(this);

tvusername =(TextView)findViewById(R.id.username);
tvpassword =(TextView)findViewById(R.id.password);

tvemail=(TextView)findViewById(R.id.email);



		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttondisplay:
			
	String username ="Jane gichuhi";
	String password ="Amanda";
	String email="jane.gichuhi@gmail.com";
			
	Toast.makeText(getApplicationContext(), "username" + "password" +"email", Toast.LENGTH_LONG).show();
	
	
			
			
			break;
			
		case R.id.buttonback:
			startActivity(new Intent(getApplicationContext(),WelcomeScreenActivity.class));
		default:
			break;
		}
		
	}


	}

