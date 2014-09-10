package com.example.ashohet.compliment;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class Main extends Activity {

    TextView textView;
    Button button;
    String[] compliments = new String[10];
    Random rand = new Random();
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textView);
        button=(Button)findViewById(R.id.button);
        imageView = (ImageView) findViewById(R.id.imageView);

        compliments[0] = getString(R.string.comp0);
        compliments[1] = getString(R.string.comp1);
        compliments[2] = getString(R.string.comp2);
        compliments[3] = getString(R.string.comp3);
        compliments[4] = getString(R.string.comp4);
        compliments[5] = getString(R.string.comp5);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = rand.nextInt(6);
                imageView.setImageResource(R.drawable.myimage);
                textView.setText(compliments[a]);
                button.setVisibility(View.GONE);

            }
        });
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
}
