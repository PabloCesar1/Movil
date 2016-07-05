package com.facci.calculadorape;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityPE extends AppCompatActivity implements View.OnClickListener {
    String Numero1="", Numero2="", Contenido="", Operador="";;
    int reultado =0;
    TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_pe);
        Button numero1 = (Button)findViewById(R.id.btn_numero1);
        Button numero2 = (Button)findViewById(R.id.btn_numero2);
        Button numero3 = (Button)findViewById(R.id.btn_numero3);
        Button numero4 = (Button)findViewById(R.id.btn_numero4);
        Button numero5 = (Button)findViewById(R.id.btn_numero5);
        Button numero6 = (Button)findViewById(R.id.btn_numero6);
        Button numero7 = (Button)findViewById(R.id.btn_numero7);
        Button numero8 = (Button)findViewById(R.id.btn_numero8);
        Button numero9 = (Button)findViewById(R.id.btn_numero9);
        Button numero0 = (Button)findViewById(R.id.btn_numero0);
        Button sumar = (Button)findViewById(R.id.btn_operadorsuma);
        Button restar = (Button)findViewById(R.id.btn_operadorresta);
        Button multiplicar = (Button)findViewById(R.id.btn_operadormulti);
        Button resolver = (Button)findViewById(R.id.btn_operadorigual);
        numero1.setOnClickListener(this);
        numero2.setOnClickListener(this);
        numero3.setOnClickListener(this);
        numero4.setOnClickListener(this);
        numero5.setOnClickListener(this);
        numero6.setOnClickListener(this);
        numero7.setOnClickListener(this);
        numero8.setOnClickListener(this);
        numero9.setOnClickListener(this);
        numero0.setOnClickListener(this);
        sumar.setOnClickListener(this);
        resolver.setOnClickListener(this);
        restar.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        pantalla = (TextView)findViewById(R.id.editText);

        Button Acerca = (Button)findViewById(R.id.btn_Acerca);
        Acerca.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivityPE.this, AcercaActivityPE.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void onClick(View view) {
        View contenedor = view.getRootView();
        switch (view.getId()) {
            case R.id.btn_numero0:
                Contenido += "0";Pantalla();
                break;
            case R.id.btn_numero1:
                Contenido += "1";Pantalla();
                break;
            case R.id.btn_numero2:
                Contenido += "2";Pantalla();
                break;
            case R.id.btn_numero3:
                Contenido += "3";Pantalla();
                break;
            case R.id.btn_numero4:
                Contenido += "4";Pantalla();
                break;
            case R.id.btn_numero5:
                Contenido += "5";Pantalla();
                break;
            case R.id.btn_numero6:
                Contenido += "6";Pantalla();
                break;
            case R.id.btn_numero7:
                Contenido += "7";Pantalla();
                break;
            case R.id.btn_numero8:
                Contenido += "8";Pantalla();
                break;
            case R.id.btn_numero9:
                Contenido += "9";Pantalla();
                break;
            case R.id.btn_operadorsuma:
                AsignarValor();
                Operador = "suma";
                break;
            case R.id.btn_operadorresta:
                AsignarValor();
                Operador = "resta";
                break;
            case R.id.btn_operadormulti:
                AsignarValor();
                Operador = "multiplicacion";
                break;
            case R.id.btn_operadorigual:
                Resultado();
                break;
        }
    }

    public void Pantalla(){
        //EditText pantalla = (EditText)findViewById(R.id.textViewResultado);
        pantalla.setText(Contenido);
    }
    public void AsignarValor(){
        if(Numero1 != ""){
            Numero2 = Contenido;
        }
        else {
            Numero1 = Contenido;
            Contenido = "";
        }
    }
    public void Resultado(){
        Numero2 = Contenido;
        if (Operador == "suma"){
            reultado = Integer.parseInt(Numero1) + Integer.parseInt(Numero2);
            pantalla.setText(String.valueOf(reultado));
            Numero1 = String.valueOf(reultado);
            Contenido = ""; Numero2="";
        }
        if (Operador == "resta"){
            reultado = Integer.parseInt(Numero1) - Integer.parseInt(Numero2);
            pantalla.setText(String.valueOf(reultado));
            Numero1 = String.valueOf(reultado);
            Contenido = ""; Numero2="";
        }
        if (Operador == "multiplicacion"){
            reultado = Integer.parseInt(Numero1) * Integer.parseInt(Numero2);
            pantalla.setText(String.valueOf(reultado));
            Numero1 = String.valueOf(reultado);
            Contenido = ""; Numero2="";
        }
    }


}
