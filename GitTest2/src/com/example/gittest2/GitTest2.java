package com.example.gittest2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class GitTest2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_git_test2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.git_test2, menu);
		return true;
	}

}
