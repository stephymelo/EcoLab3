package com.example.ecolab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TotalNotas extends AppCompatActivity implements View.OnClickListener {

    private TextView nombre;
    private TextView resultadoText;
    private TextView nota;
    private Button calcularAgain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_notas);


        String nombreIn = getIntent().getExtras().getString("nombre");


        nombre = findViewById(R.id.nombre);
        resultadoText = findViewById(R.id.resultadoText);
        nota = findViewById(R.id.nota);
        calcularAgain = findViewById(R.id.calcularAgain);

        nombre.setText("Hola,"+nombreIn+"Tu note final es de");


        calcularAgain.setOnClickListener(this);


    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.calcularAgain:
                Intent i=new Intent(this,MainActivity.class);

                startActivity(i);
                break;
        }


    }


}