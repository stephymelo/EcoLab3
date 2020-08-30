package com.example.ecolab3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfiguracionColor extends AppCompatActivity implements View.OnClickListener {

    private ConstraintLayout mConstraintLayout;
    private Button AzulBoton;
    private Button BlancoBoton;
    private Button NegroBoton;
    private String color="white";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        mConstraintLayout = (ConstraintLayout)findViewById(R.id.constraintLayout);
        AzulBoton = findViewById(R.id.AzulBoton);
        BlancoBoton = findViewById(R.id.BlancoBoton);
        NegroBoton = findViewById(R.id.NegroBoton);


        AzulBoton.setOnClickListener(this);
        BlancoBoton.setOnClickListener(this);
        NegroBoton.setOnClickListener(this);

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

            case R.id.AzulBoton:
                Intent data = new Intent();
                data.putExtra("color","azul");
                setResult(RESULT_OK,data);
                finish();
                break;
            case R.id.BlancoBoton:
                Intent data2 = new Intent();
                data2.putExtra("color","blanco");
                setResult(RESULT_OK,data2);
                finish();

                break;
            case R.id.NegroBoton:
                Intent data3 = new Intent();
                data3.putExtra("color","negro");
                setResult(RESULT_OK,data3);
                finish();

                break;
        }





    }



}