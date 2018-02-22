package com.example.acer.events;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Events1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_events1 );
    }
    public void nextActivity(View view) {
        startActivity(new Intent( this,
                Reservacion.class ));
        finish();
    }

}
