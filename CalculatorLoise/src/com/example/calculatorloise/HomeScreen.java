package com.example.calculatorloise;

import android.support.v7.app.ActionBarActivity;
//import android.support.v7.app.ActionBar;
//import android.support.v4.app.Fragment;
import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
//import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
//import android.os.Build;

public class HomeScreen extends ActionBarActivity implements OnClickListener {
      //Declaration of values
	   EditText ethomeno1 , ethomeno2 , ethomeresult;
	   Button btnadd, btnsubtraction, btnmultiplication, btndivision;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);

		//initialization of values
		ethomeno1=(EditText) findViewById(R.id.homeno1);
		ethomeno2=(EditText) findViewById(R.id.homeno2);
		ethomeresult=(EditText) findViewById(R.id.homeresults);
		btnadd=(Button) findViewById(R.id.add);
		btnadd.setOnClickListener(this);
		btnsubtraction=(Button) findViewById(R.id.subtraction);
		btnsubtraction.setOnClickListener(this);
		btnmultiplication=(Button) findViewById(R.id.multiplication);
		btnmultiplication.setOnClickListener(this);
		btndivision=(Button) findViewById(R.id.division);
		btndivision.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		

	}

	
	
}
