package com.example.patrick.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.Parse;
import com.parse.ParseObject;


public class MyActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        Parse.initialize(this,"FJOxMK1gTS8R3eGuSZ9c4caLMnrdZAsfQgjRYt8A","lXkuXxJZU7GrdAz6fbkqBticz4wvzt1LFQqmJHd7");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ParseObject testObject = new ParseObject("test");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
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

    public void broadcastIntent(View view)
    {
        Intent intent = new Intent();
        intent.setAction("com.example.patrick.CUSTOM_INTENT");
        sendBroadcast(intent);
    }

    public void GoToParse(View view)
    {
        Intent intent = new Intent(this, ParseExample.class);
        startActivity(intent);
    }


}
