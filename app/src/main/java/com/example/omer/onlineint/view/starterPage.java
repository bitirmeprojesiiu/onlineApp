package com.example.omer.onlineint.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.omer.onlineint.R;

public class starterPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starter_page);
        Intent i=new Intent(starterPage.this,authenticationActivity.class);
        startActivity(i);
    }
}
