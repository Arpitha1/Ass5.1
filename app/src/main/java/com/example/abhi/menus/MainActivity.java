package com.example.abhi.menus;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
        tv = (TextView)findViewById(R.id.tv);
    }

    @Override

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.options_menu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override

    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId())

        {

            case R.id.TextRed:

                tv.setTextColor(Color.RED);

                break;

            case R.id.TextGreen:

                tv.setTextColor(Color.GREEN);

                break;

            case R.id.TextBlue:

                tv.setTextColor(Color.BLUE);

                break;


        }


        return super.onOptionsItemSelected(item);

    }




}
