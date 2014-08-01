package soniyah.example.akirachix;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class RegisterScreen extends Activity implements OnClickListener{
      EditText etfirstname, etsecondname, etpassword;
      Button   btnCancel, btnLogin;
      String stfirstname,stsecondname, stpassword;
     
     
      
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//initializing of variables
	    setContentView(R.layout.register);
	    etfirstname =(EditText) findViewById(R.id.buttonfirstname);
	    etfirstname.setOnClickListener(this);
	    
	    etsecondname =(EditText) findViewById(R.id.buttonsecondname);
	    etsecondname.setOnClickListener(this);
	    
	    etpassword =(EditText) findViewById(R.id.btnpassword);
	    etpassword.setOnClickListener(this);
	    
	    btnLogin =(Button)findViewById(R.id.buttonLogin);
	    btnLogin.setOnClickListener(this);
	    
	    btnCancel =(Button)findViewById(R.id.btnCancel);
	    btnCancel.setOnClickListener(this); 
	    //get data for edit text
	   
	    
	    	 
	}


	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonfirstname:
			
		break;
		case R.id.buttonsecondname:
		break;
		
		case R.id.btnpassword:
			break;
			
		case R.id.buttonLogin:
			break;
			
		case R.id.btnCancel:
			break;

		default:
			break;
		}
		// TODO Auto-generated method stub
		
	}
	

}
