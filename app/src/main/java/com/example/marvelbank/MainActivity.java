package com.example.marvelbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Button btUsuario = (Button) findViewById(R.id.btnEntrar);
      btUsuario.setOnClickListener(this ::abreUsuario );


    }
    public void abreUsuario (View v){
        Intent intentUs = new Intent(this, Usuario.class);


        EditText edtNome = (EditText)findViewById(R.id.login);
        intentUs.putExtra( "nomeLogin",edtNome.getText().toString());

        Intent intentS = getIntent();
        EditText txtSenha = (EditText)findViewById(R.id.senha);
        intentS.putExtra("erro",txtSenha.getText().toString());



        if(txtSenha.getText().toString().equalsIgnoreCase(edtNome.getText().toString()) ){
        startActivity(intentUs);
        }
        else{ Intent intentSenha = getIntent();
             String erroTela = intentSenha.getStringExtra("erro");
             Toast.makeText(this,"Erro de Login",Toast.LENGTH_LONG).show();}
    }

}
