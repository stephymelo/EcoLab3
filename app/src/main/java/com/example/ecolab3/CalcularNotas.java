package com.example.ecolab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalcularNotas extends AppCompatActivity implements View.OnClickListener {
    private Button calcularBoton;
    private String nombreIn;
    private EditText parcial1;
    private EditText parcial2;
    private EditText proyecto2;
    private EditText proyecto1;
    private EditText ejercicios;
    private EditText quices;
    private String color="white";
    private ConstraintLayout mConstraintLayout;


    private OperationsNote notas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_notas);
        mConstraintLayout=findViewById(R.id.constraint);
        calcularBoton = findViewById(R.id.calcularBoton);
        ejercicios = findViewById(R.id.ejercicios);
        proyecto1 = findViewById(R.id.proyecto1);
        proyecto2 = findViewById(R.id.proyecto2);
        parcial1 = findViewById(R.id.parcial1);
        parcial2 = findViewById(R.id.parcial2);
        quices = findViewById(R.id.quices);




        calcularBoton.setOnClickListener(this);

        nombreIn = getIntent().getExtras().getString("nombre");


        color=getIntent().getExtras().getString("color");
        changeColor();

    }



    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.calcularBoton:
                Intent i=new Intent(this,TotalNotas.class);
                i.putExtra("nombre",nombreIn);
                i.putExtra("par1",proyecto1.getText().toString());
                i.putExtra("par2",proyecto2.getText().toString());
                i.putExtra("quiz",quices.getText().toString());
                i.putExtra("parcial1",parcial1.getText().toString());
                i.putExtra("parcial2",parcial2.getText().toString());
                i.putExtra("exercise",ejercicios.getText().toString());


                startActivity(i);

                break;
        }
    }

    public void changeColor(){
        if(color.equals("blanco")){
            mConstraintLayout.setBackgroundColor(Color.WHITE);

        }
        if(color.equals("azul")){
            mConstraintLayout.setBackgroundColor(Color.BLUE);

        }
        if(color.equals("negro")){
            mConstraintLayout.setBackgroundColor(Color.BLACK);

        }
    }

}