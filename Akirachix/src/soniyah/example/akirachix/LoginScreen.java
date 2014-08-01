package soniyah.example.akirachix;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginScreen extends Activity implements OnClickListener  {
	Button btnLogin;
	Button btnCancel;

	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 //initialize
		setContentView(R.layout.login);
		btnCancel = (Button) findViewById(R.id.btnCancel);
		btnCancel.setOnClickListener(this);
		
		btnLogin =(Button)findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(this);
		
	}



	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnCancel:
			
			break;
			

		default:
			break;
		}
		// TODO Auto-generated method stub
		
		
	}
	

}
