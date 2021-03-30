package com.example.marvelbank;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Usuario extends Activity {  @Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_usuario);
    Button btnmain = (Button)findViewById(R.id.irLogin);
    btnmain.setOnClickListener( this ::voltaMain);

    Button btnSplach = (Button)findViewById(R.id.irSplash);
    btnSplach.setOnClickListener( this ::voltaSplash);

    Intent intentP = getIntent();
    String passagem = intentP.getStringExtra("nomeLogin");
    Toast.makeText(this,"Seja bem vindo "+passagem,Toast.LENGTH_LONG).show();


}
    public void voltaSplash (View view){
    Intent intent = new Intent(this,Splash.class);
    startActivity(intent);
    }
    public void voltaMain (View view){
        Intent intent2 = new Intent(this,MainActivity.class);
        startActivity(intent2);
    }
}
