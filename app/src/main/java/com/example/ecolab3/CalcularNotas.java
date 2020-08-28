package com.example.ecolab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalcularNotas extends AppCompatActivity implements View.OnClickListener {
    private Button calcularBoton;
    private String nombreIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_notas);

        calcularBoton = findViewById(R.id.calcularBoton);


        calcularBoton.setOnClickListener(this);
        nombreIn = getIntent().getExtras().getString("nombre");

    }

    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.calcularBoton:
                Intent i=new Intent(this,TotalNotas.class);
                i.putExtra("nombre",nombreIn);
                startActivity(i);

                break;
        }
    }

}