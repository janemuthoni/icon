package com.example.exam;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeScreenActivity extends ActionBarActivity implements OnClickListener {
	///declaring of variables.
	Button btnlogin, btnregister;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);
		//initializing of variables.
		
btnlogin =(Button)findViewById(R.id.buttonlogin);
btnlogin.setOnClickListener(this);

btnregister =(Button)findViewById(R.id.buttonregister);
btnregister.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		
		
	}

	
	}

