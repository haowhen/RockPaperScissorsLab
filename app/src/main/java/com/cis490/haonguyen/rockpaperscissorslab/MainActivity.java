package com.cis490.haonguyen.rockpaperscissorslab;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class MainActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

		ImageView rockButton =(ImageView)findViewById(R.id.imageRock);
		rockButton.setOnClickListener(this);

		ImageView paperButton =(ImageView)findViewById(R.id.imagePaper);
		paperButton.setOnClickListener(this);

		ImageView scissorsButton =(ImageView)findViewById(R.id.imageScissors);
		scissorsButton.setOnClickListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

	@Override
	public void onClick(View view) {
	/*if(view.getId() == R.id.imageRock)
		{
			showMessage(view, "You clicked rock");
		}
		else if(view.getId() == R.id.imagePaper)
		{
			showMessage(view, "You clicked paper");
		}
		else
		{
			showMessage(view,"You clicked scissors");
		}
*/
		Intent intent = new Intent(this, WinLoseActivity.class);
		intent.putExtra(RockPaperScissorsConstant.PLAYER_CHOICE, view.getId());
		startActivity(intent);
	}

	public static void showMessage(View view, String message){
		Toast toast = Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT);
		toast.show();
	}
}
