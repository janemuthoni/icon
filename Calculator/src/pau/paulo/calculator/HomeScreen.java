package pau.paulo.calculator;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreen extends Activity implements OnClickListener {
	 String         Strnumberone,Strnumbertwo,StrResult,Strnumber1,Strnumber2;
	 int            numberone,numbertwo, number1, number2 ,ans;
	 
	
	 EditText      etnumberone, etnumbertwo,etnumber1;
	 Button        btnadd, btnmultiply, btndivision, btnsubtraction;
	 TextView      tvresults;
     Calculations  calcs;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.homescreen);
		tvresults=(TextView)findViewById(R.id.tvresults);
		tvresults.setOnClickListener(this);
		
	    etnumberone=(EditText)findViewById(R.id.editnumberone);
	    etnumbertwo=(EditText)findViewById(R.id.editTextnumbertwo);
	    
		btnadd=(Button)findViewById(R.id.buttonAdd);
		btnadd.setOnClickListener(this);
		
		
		btnmultiply=(Button)findViewById(R.id.buttonmultiply);
		btnmultiply.setOnClickListener(this);
		
		btndivision=(Button)findViewById(R.id.buttondivision);
		btndivision.setOnClickListener(this);
		
		btnsubtraction=(Button)findViewById(R.id.buttonsubtraction);
		btnsubtraction.setOnClickListener(this);
		calcs = new Calculations();
		
	    //integer to String.
		Strnumberone= etnumberone.getText().toString();
		//integer to String.
	    Strnumbertwo= etnumbertwo.getText().toString();
	    
	     //integer to String.
	    Strnumber1= etnumberone.getText().toString();
	  	//integer to String.
	  	Strnumber2= etnumbertwo.getText().toString();
	    
	    //convert String to Integer.
        numberone=Integer.parseInt(Strnumberone);
        numbertwo=Integer.parseInt(Strnumbertwo);
        
       //convert String to Integer
  	   number1=Integer.parseInt(Strnumberone);
  	   number2=Integer.parseInt(Strnumbertwo);
  	  
  	  
	}		 
	   
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.buttonAdd:
			Toast.makeText(getApplicationContext(), "welcome to home screen", Toast.LENGTH_LONG).show();
			//startActivity(new Intent(getApplicationContext(),HomeScreen.class));
			
		  int ans = calcs.addition(numberone,numbertwo);
	         //convert integer back to String
	         StrResult=String.valueOf(ans);
	         //Displaying the answer.
	         tvresults.setText("result is " + StrResult);
			
break;
		case   R.id.buttonsubtraction:
		int answer = calcs.subtraction(numberone, numbertwo);
	        //convert to String.
	        StrResult=String.valueOf(answer);
	        //Displaying the answer.
	        tvresults.setText(StrResult);

break;
		case  R.id.buttondivision:
		double answ = calcs.division(number1,number2);
	        //convert to String.
	        StrResult=String.valueOf(answ);
	      //Displaying the answer.
	        tvresults.setText(StrResult);
	break;
	
		case R.id.buttonmultiply:
		double anser = calcs.muliplication(number1, number2);
	        //convert to String.
	        StrResult=String.valueOf(anser);
	        //Displaying the answer.
	        tvresults.setText(StrResult);
			
			
	
			
default:
			break;
		}


	
	}


}
	








