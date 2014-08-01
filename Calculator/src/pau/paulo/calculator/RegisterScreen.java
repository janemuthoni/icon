package pau.paulo.calculator;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterScreen extends Activity implements OnClickListener {
	 //declare variables.
	Button    btnCancel, btnSubmit;
	Spinner   spinner1;
	TextView  tvspinner;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.register);
		//initialize variables.
		
		btnSubmit=(Button)findViewById(R.id.buttonRegisterSubmit);
		btnSubmit.setOnClickListener(this);
         
        btnCancel=(Button)findViewById(R.id.buttonRegisterCancel);
        btnCancel.setOnClickListener(this);
        
       //adding strings to 
        ArrayList<String> list = new ArrayList<String>();
        list.add("nairobi");
        list.add("kisumu");
        list.add("meru");
        list.add("limuru");
        list.add("narok");
        list.add("naivasha");
        
        //defines the design of the spinner.
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(dataAdapter);
	}   
            // getting value of selected drop down list.
            public void addListenerOnSpinnerItemSelection(){
        	
        	//initializing the spinner.
        	spinner1 = (Spinner) findViewById(R.id.spinner1);
        	spinner1.setOnItemClickListener((OnItemClickListener) this);
        			
        }
	

	@Override
	public void onClick(View v){
		switch (v.getId()) {
		case R.id.buttonRegisterSubmit:
			Toast.makeText(getApplicationContext(), "welcome to login screen", Toast.LENGTH_LONG).show();
			startActivity(new Intent(getApplicationContext(),LoginScreen.class));
			
			
			break;
		case R.id.buttonRegisterCancel:
			 Toast.makeText(getApplicationContext(), "welcome", Toast.LENGTH_LONG).show();
			 startActivity(new Intent(getApplicationContext(),RegisterScreen.class));
			

		default:
			break;
		}
		
		
		}
	
	    

	
	
	{
		
		
	}
}
	
	
	


