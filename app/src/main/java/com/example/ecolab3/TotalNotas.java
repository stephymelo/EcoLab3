package com.example.ecolab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
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
    private OperationsNote resultado;
    private String result;
    private ConstraintLayout mConstraintLayout;
    private String color="white";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_notas);

        int par1= Integer.parseInt(getIntent().getExtras().getString("par1"));
        int par2= Integer.parseInt(getIntent().getExtras().getString("par2"));
        int parcial10= Integer.parseInt(getIntent().getExtras().getString("parcial1"));
        int parcial20= Integer.parseInt(getIntent().getExtras().getString("parcial2"));
        int quiz= Integer.parseInt(getIntent().getExtras().getString("quiz"));
        int exercise= Integer.parseInt(getIntent().getExtras().getString("exercise"));


        String nombreIn = getIntent().getExtras().getString("nombre");
        resultado=new OperationsNote(par1,par2,quiz,parcial10,parcial20,exercise);
        resultado.calcularNotaFinal();
        mConstraintLayout=findViewById(R.id.constraint);
        nombre = findViewById(R.id.nombre);
        resultadoText = findViewById(R.id.resultadoText);
        nota = findViewById(R.id.nota);
        calcularAgain = findViewById(R.id.calcularAgain);
        nombre.setText("Hola,"+nombreIn+"Tu note final es de");
        result=String.valueOf(resultado.getResultado());
        nota.setText(result);
        calcularAgain.setOnClickListener(this);
        changeColor();

        color=getIntent().getExtras().getString("color");
    }


    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.calcularAgain:
                Intent i=new Intent(this,MainActivity.class);
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