package com.example.sagar.lab8;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void git(MenuItem item) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://github.com"));
        startActivity(i);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void google(MenuItem item) {
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("http://google.com"));
        startActivity(i);
    }
}
