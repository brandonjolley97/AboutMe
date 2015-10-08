package com.example.bjol7457.firstandroidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.widget.RelativeLayout;
import android.view.View;
import android.content.Intent;
import android.graphics.Color;


public class StupidMorningActivity extends AppCompatActivity
{

    private Button colorChangeButton;
    private TextView basicText;
    private RelativeLayout background;
    private Button swapScreenButton;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stupid_morning);

        background = (RelativeLayout) findViewById(R.id.backgroundLayout);
        basicText = (TextView) findViewById(R.id.textView);
        colorChangeButton = (Button) findViewById(R.id.changeColorButton);
        swapScreenButton = (Button) findViewById(R.id.swapScreenButton);

        setupListeners();
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
    private void changeBackgroundColor()
    {
        int redColor;
        int greenColor;
        int blueColor;

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        background.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));

        redColor = (int) (Math.random() * 256);
        greenColor = (int) (Math.random() * 256);
        blueColor = (int) (Math.random() * 256);

        colorChangeButton.setBackgroundColor(Color.rgb(redColor, greenColor, blueColor));
    }

    private void changeVisibility()
    {
        if(basicText.getVisibility() == View.VISIBLE)
        {
            basicText.setVisibility(View.GONE);
        }
        else
        {
            basicText.setVisibility(View.VISIBLE);
        }
    }

    private void setupListeners()
    {
        colorChangeButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View buttonView)
            {
                //This is where the action happens!
                changeBackgroundColor();
                changeVisibility();
            }
        });



    }
}
