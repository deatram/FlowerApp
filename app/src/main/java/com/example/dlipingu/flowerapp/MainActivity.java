package com.example.dlipingu.flowerapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String LOGTAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast msg = Toast.makeText(this, "Welcome to our app", Toast.LENGTH_LONG);
        msg.show();
        Log.d(LOGTAG, "OnCreate");
        /*Button button1 = (Button) findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);

            }

        });

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String webpage = "http://developer.android.com/index.html";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
                startActivity(intent);
            }

        });

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Hello everyone");
                intent.setType("text/plain");
                startActivity(intent);
            }

        });*/
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Toast.makeText(this, "You selected " + item.getTitle(), Toast.LENGTH_LONG).show();
        Intent intent = null;
        switch (item.getItemId())
        {
            case R.id.activity_one:
                intent = new Intent(this, DetailActivity.class);
                startActivity(intent);
                break;
            case R.id.implicit_view_url:
                String webpage = "http://developer.android.com/index.html";
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
                startActivity(intent);
                break;
            case R.id.send_message:
                intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT, "Hello everyone");
                intent.setType("text/plain");
                startActivity(intent);
                break;
            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    /*
    public void openActivityTwo(View v)
    {
        Intent intent = new Intent(this, DetailActivity.class);
        startActivity(intent);
    }
    public void implicitViewURL(View v)
    {
        String webpage = "http://developer.android.com/index.html";
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(webpage));
        startActivity(intent);
    }
    public void implicitSendText(View v)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_TEXT, "Hello everyone");
        intent.setType("text/plain");
        startActivity(intent);
    }*/


    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d(LOGTAG, "onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOGTAG, "onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOGTAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOGTAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOGTAG, "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOGTAG, "onRestart");
    }
}
