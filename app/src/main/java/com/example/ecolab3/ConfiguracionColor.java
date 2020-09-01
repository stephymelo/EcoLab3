package com.example.ecolab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracionColor extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout mConstraintLayout;
    private Button azulBoton;
    private Button blancoBoton;
    private Button negroBoton;
    private String color="white";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mConstraintLayout = (ConstraintLayout)findViewById(R.id.constraintLayout);
        azulBoton = findViewById(R.id.azulBoton);
        blancoBoton = findViewById(R.id.blancoBoton);
        negroBoton = findViewById(R.id.negroBoton);


        azulBoton.setOnClickListener(this);
        blancoBoton.setOnClickListener(this);
        negroBoton.setOnClickListener(this);

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



    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.azulBoton:
                Intent data = new Intent();
                data.putExtra("color","azul");
                setResult(RESULT_OK,data);
                finish();
                break;
            case R.id.blancoBoton:
                Intent data2 = new Intent();
                data2.putExtra("color","blanco");
                setResult(RESULT_OK,data2);
                finish();

                break;
            case R.id.negroBoton:
                Intent data3 = new Intent();
                data3.putExtra("color","negro");
                setResult(RESULT_OK,data3);
                finish();

                break;
        }





    }



}