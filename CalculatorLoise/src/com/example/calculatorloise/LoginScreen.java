package com.example.calculatorloise;

import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.ActionBar;
//import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
//import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//import android.os.Build;

public class LoginScreen extends ActionBarActivity implements OnClickListener {
       //Declaration of values
	    EditText etemail, etpassword;    
	    
	    Button btnCancel , btnSubmit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
        //initialization of values
		etemail =(EditText) findViewById(R.id.etloginemail);
		etpassword = (EditText) findViewById(R.id.etloginpassword);
		btnCancel = (Button) findViewById(R.id.loginCancel);
		btnCancel.setOnClickListener(this);
		btnSubmit = (Button) findViewById(R.id.loginsubmit);
		btnSubmit.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId ()) {
		case R.id.etloginemail:
		
			break;
         case R.id.etloginpassword:
			
			break;
        case R.id.loginCancel:
        	
			Toast.makeText(getApplicationContext(), "login here", Toast.LENGTH_SHORT).show();
			
			startActivity(new Intent (getApplicationContext(),WelcomeScreen.class));
	     break;
      case R.id.loginsubmit:
    		
			Toast.makeText(getApplicationContext(), "login here", Toast.LENGTH_SHORT).show();
			
			startActivity(new Intent (getApplicationContext(),HomeScreen.class));
	    break;

		default:
			break;
		}
		
	}

	
}
