package com.example.acer.radioreyna1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LocutorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_locutor );
    }
    public void nextActivity(View view) {
        startActivity(new Intent( this,
                LocutoresActivity.class ));
        finish();
    }
}
