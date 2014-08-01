package soniyah.example.akirachix;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class WelcomeScreen extends Activity implements OnClickListener  {
	
	//declare variables
	Button btnLogin;
	Button btnRegister;


@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.welcome);
    
    //initialize variables.
    btnLogin = (Button) findViewById(R.id.buttonLogin);
    btnLogin.setOnClickListener(this);
    btnRegister =(Button) findViewById(R.id.buttonRegister);
    btnRegister.setOnClickListener(this);
    
    
}


@Override
public void onClick(View v) {
	
	switch (v.getId()) {
	case R.id.buttonLogin:
		
		break;
	case R.id.buttonRegister:
		
		break;

	default:
		break;
	}
	
}
}