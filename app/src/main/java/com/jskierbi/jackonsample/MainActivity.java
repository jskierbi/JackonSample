package com.jskierbi.jackonsample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jskierbi.jackonsample.model.EntityPojo;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {

	private static final String TAG = MainActivity.class.getSimpleName();

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btn_parse_json).setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View v) {
				parseJson();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();

		//noinspection SimplifiableIfStatement
		if (id == R.id.action_settings) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	void parseJson() {

		ObjectMapper mapper = new ObjectMapper();
		try {
			EntityPojo data = mapper.readValue(getAssets().open("data.json"), EntityPojo.class);
			Log.d(TAG, "" + data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
