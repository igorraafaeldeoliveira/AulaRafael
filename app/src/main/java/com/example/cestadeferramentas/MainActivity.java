package com.example.cestadeferramentas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editSenha, editEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editSenha = findViewById(R.id.edtSenha);
        editEmail = findViewById(R.id.edtEmail);
    }


    public void irParaPrincipal(View v) {


        String email = editEmail.getText().toString();
        String senha = editSenha.getText().toString();
        if (email.equals("igorrafael@gmail.com")) {
            Intent i = new Intent(this, Principal.class);
            startActivity(i);

            Toast.makeText(this, "Logado.", Toast.LENGTH_SHORT).show();

        } else {
            Toast.makeText(this, "Falha ao logar.", Toast.LENGTH_SHORT).show();
        }
    }
}