package com.android.ahoje;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;


public class MainActivity extends Activity {
	EditText edtsen,edxnum,edxnum2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		edtsen = (EditText) findViewById(R.campo.tsen);
		edxnum = (EditText) findViewById(R.campo.xnum);
		edxnum2 = (EditText) findViewById(R.campo.xnum2);
		Button btmostrar = (Button) findViewById(R.id.btmostrar);
		btmostrar.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
	
				double tsen = Double.parseDouble(edtsen.getText().toString());
        	    Toast.makeText(getApplicationContext(), "String edtsen:"+edtsen.getText().toString(), Toast.LENGTH_LONG).show();
				//String par3 = String.format("%011d", tsen/62); 
				String par3 = String.format("%10d", Math.round(tsen/171));
				String par32 = String.format("%10d", Math.round(tsen/62));
				//Toast.makeText(getApplicationContext(), "String par3:"+par3, Toast.LENGTH_LONG).show();
				String par4 =  new StringBuilder().append(par3.charAt(6)).append(par3.charAt(9)).toString() ;
				String par42 =  new StringBuilder().append(par32.charAt(6)).append(par32.charAt(9)).toString() ;
			//	Toast.makeText(getApplicationContext(), "String par4:"+par4, Toast.LENGTH_LONG).show();
				Toast.makeText(getApplicationContext(), "Inteligence Informatica\no Sucesso da Sua Empresa \nesta na nossa programação!!",  Toast.LENGTH_LONG).show();
				edxnum.setText("Star:"+par4);
				edxnum2.setText("Folha:"+par42);
			}
		});
	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
