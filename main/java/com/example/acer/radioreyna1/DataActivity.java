package com.example.acer.radioreyna1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DataActivity extends AppCompatActivity {
    private TextView txtData;
    private Button btnSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_data );
        txtData = (TextView) findViewById(R.id.txtData);
        Bundle bundle = this.getIntent().getExtras();
        txtData.setText("Hello: " + bundle.getString("Name") + ", " +
                bundle.getString("Age") + ", " + bundle.getString("Phone"));
    }
    public void nextActivity(View view) {        //metodo para llamar segunda activity
        startActivity(new Intent(this,
                AgendaActivity.class));


    }
}
