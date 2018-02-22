package com.example.acer.events;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Reservacion extends AppCompatActivity {
    private EditText txtnameEvents;
    private EditText txtName;
    private EditText  txtMesaReservada;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_reservacion );


        txtName = (EditText) findViewById(R.id.edt_name);
        txtnameEvents = (EditText) findViewById(R.id.edt_nameEvents);
        txtMesaReservada = (EditText) findViewById(R.id.edt_MesaReservada);
        btnSubmit = (Button) findViewById(R.id.btn_sub);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Reservacion.this, DataActivity.class);
                Bundle b = new Bundle();
                b.putString("Name", txtName.getText().toString());
                b.putString("nameEvents", txtnameEvents.getText().toString());
                b.putString("MesaReservada", txtMesaReservada.getText().toString());
                intent.putExtras(b);
                startActivity(intent);
            }
        });
    }
    public void nextActivityData(View view) {
        startActivity(new Intent(this,
                DataActivity.class));
    }
}
