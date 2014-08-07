package com.example.exam;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
//declaring the variables.
import android.widget.TextView;


public class LoginscreenActivity extends ActionBarActivity implements OnClickListener {
	Button btnback,btnVerify;
	TextView tvusername,tvpassword,tvemail;
	EditText  etusername,etpassword,etemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        
  btnback=(Button)findViewById(R.id.buttonback);
  btnback.setOnClickListener(this);
  
  btnVerify =(Button)findViewById(R.id.buttonVerify);
  btnVerify.setOnClickListener(this);
  
  etusername =(EditText)findViewById(R.id.etusername);
  etpassword =(EditText)findViewById(R.id.etpassword);
  etemail=(EditText)findViewById(R.id.email);
  
    }
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonVerify:
			
			
 String username = "Jane gichuhi";
 String password =  "Amanda";
 
  if (etusername.getText().toString().equals("") && etpassword.getText().toString().equals("")) {
	  Toast.makeText(getApplicationContext(), "please enter username and password", Toast.LENGTH_LONG).show();
	
} else if(etusername.getText().toString().equals("")) {
	Toast.makeText(getApplicationContext(), "please enter username", Toast.LENGTH_LONG).show();
	
} else if (etpassword.getText().toString().equals("")){
	Toast.makeText(getApplicationContext(), "please enter password", Toast.LENGTH_LONG).show();
}
else if (!etusername.getText().toString() .equals(username)) {
	Toast.makeText(getApplicationContext(), "please enter your username", Toast.LENGTH_LONG).show();	
	
}else if (!etpassword.getText().toString().equals(password)) {
	Toast.makeText(getApplicationContext(), "please enter correct password", Toast.LENGTH_LONG).show();	
	
}else if (etusername.getText().toString().equals("") && etpassword.getText().toString().equals("")){
	Toast.makeText(getApplicationContext(), "login succesfully", Toast.LENGTH_LONG).show();	
}
			
			break;
		case R.id.buttonback:
			startActivity(new Intent(getApplicationContext(),WelcomeScreenActivity.class));

		default:
			break;
		}
		
	}
 

}