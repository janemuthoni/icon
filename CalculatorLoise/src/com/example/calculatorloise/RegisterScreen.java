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

public class RegisterScreen extends ActionBarActivity implements OnClickListener {
     //declaration of values
	EditText etfirstname ,etidno ,etemail ,etpassword; 
	
	Button btnCancel ,btnSubmit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
        //initialization of values
		   etfirstname=(EditText) findViewById(R.id.registerfirstname);
		   etemail=(EditText) findViewById(R.id.registeremail);
		   etidno=(EditText) findViewById(R.id.registeridno);
		   etpassword=(EditText) findViewById(R.id.registerpassword);
		   btnCancel=(Button) findViewById(R.id.registerCancel);
		   btnCancel.setOnClickListener(this);
		   btnSubmit=(Button) findViewById(R.id.registerSubmit);
		   btnSubmit.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
					switch (v.getId ()) {
					case R.id.registerfirstname:
						
						break;
                     case R.id.registeremail:
						
						break;
                     case R.id.registeridno:
 						
 						break;
                     case R.id.registerpassword:
  						
  						break;
                     case R.id.registerCancel:
                    	 
                    	 Toast.makeText(getApplicationContext(), "Welcome", Toast.LENGTH_SHORT).show();
                    	 startActivity(new Intent(getApplication(),WelcomeScreen.class));
  						
  						break;
                     case R.id.registerSubmit:
  						Toast.makeText(getApplicationContext(), "Sign in", Toast.LENGTH_SHORT).show();
  						startActivity(new Intent(getApplicationContext(), HomeScreen.class));
  						break;
				
					default:
						break;
					}
		
	}

	
}
