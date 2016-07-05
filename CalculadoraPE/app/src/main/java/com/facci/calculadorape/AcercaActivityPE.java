package com.facci.calculadorape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AcercaActivityPE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_activity_pe);
        Button Regresar = (Button)findViewById(R.id.btn_regresar);
        Regresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcercaActivityPE.this, MainActivityPE.class);
                startActivity(intent);
            }
        });
    }
}
