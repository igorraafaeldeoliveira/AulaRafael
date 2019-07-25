package com.example.cestadeferramentas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.FloatProperty;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class calculo extends AppCompatActivity {
    EditText editAltura, editPeso;
    TextView txtResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        editAltura = findViewById(R.id.edtAltura);
        editPeso = findViewById(R.id.edtPeso);
        txtResultado = findViewById(R.id.resultado);
     }


    public void calcular(View v){

        Float peso=Float.parseFloat(editPeso.getText().toString());
        Float altura=Float.parseFloat(editAltura.getText().toString());
        Float resultado=peso/(float)Math.pow(altura,2);
        String apresentacao="";

        if(resultado < 18.5) {
            apresentacao = "Abaixo do peso";
        }else if(resultado >18.5 && resultado<=24.9) {
            apresentacao = "Normal";
        }else if(resultado>25 && resultado<30) {
            apresentacao = "Acima do peso";
        }else{
              apresentacao="Obesidade";
        }
        txtResultado.setText(apresentacao);
        }
}