package com.example.treasurehunter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ImageView main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.e("zxcv", "vcxz");
        setContentView(R.layout.activity_main);
        main=(ImageView)findViewById(R.id.main);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        super.onTouchEvent(event);
        if (event.getAction() == MotionEvent.ACTION_DOWN)
        {
            Intent intObj = new Intent(getApplicationContext(),MenuActivity.class);
            startActivity(intObj);

            return true;
        }
        return false;
    }

}
