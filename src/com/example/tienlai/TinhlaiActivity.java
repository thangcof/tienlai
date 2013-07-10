package com.example.tienlai;

import java.io.Console;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TinhlaiActivity extends Activity {
	
	private EditText hangthang;
	private EditText laixuat;
	private EditText sothang;
	private TextView ketqua;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tinhlai);
		
		hangthang = (EditText) findViewById(R.id.editHangThang);
		laixuat = (EditText) findViewById(R.id.editLaiXuat);
		sothang = (EditText) findViewById(R.id.editSoThang);
		ketqua = (TextView) findViewById(R.id.textKetQua);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tinhlai, menu);
		return true;
	}
	
	public void calculate(View view) {
		int ht  = Integer.parseInt(hangthang.getText().toString());
		float lx = Float.parseFloat(laixuat.getText().toString());
		int st = Integer.parseInt(sothang.getText().toString());
		
		float laixuatthang = (float)lx/(12*100);

		Long temp  = (long) (ht * ( Math.pow(1 + laixuatthang, st)  -1)/laixuatthang);
		Log.v("abc", String.valueOf(lx));		
		ketqua.setText(String.valueOf(temp));
		
	}

}
