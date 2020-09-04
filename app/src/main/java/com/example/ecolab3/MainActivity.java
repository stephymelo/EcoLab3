package com.example.ecolab3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final int CODE=0;
    private EditText nombreInput;
    private TextView promptText;
    private Button continuarBoton;
    private ConstraintLayout constraint;
    private Button configBoton;
    private String color;
    private SharedPreferences preferences;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        nombreInput = findViewById(R.id.nombreInput);
        promptText = findViewById(R.id.promptText);
        continuarBoton = findViewById(R.id.continuarBoton);
        configBoton = findViewById(R.id.configBoton);

        constraint = findViewById(R.id.constraintS);
       color="white";


        continuarBoton.setOnClickListener(this);
        configBoton.setOnClickListener(this);



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==CODE && resultCode==RESULT_OK){
            color=data.getExtras().getString("color");

            if(color.equals("blanco")){
                constraint.setBackgroundColor(Color.WHITE);
            }
            if(color.equals("azul")){
                constraint.setBackgroundColor(Color.BLUE);
            }
            if(color.equals("negro")){
                constraint.setBackgroundColor(Color.BLACK);
            }
        }
    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.continuarBoton:
                String nombreIn=nombreInput.getText().toString();
                Intent i=new Intent(this,CalcularNotas.class);
                i.putExtra("nombre",nombreIn);
                startActivity(i);

                Intent c=new Intent(this,CalcularNotas.class);
                c.putExtra("color",color);
                startActivityForResult(c,CODE);


                break;
            case R.id.configBoton:
                Intent b=new Intent(this,ConfiguracionColor.class);
                b.putExtra("color",color);
                startActivityForResult(b,CODE);
                preferences=getSharedPreferences("pref",MODE_PRIVATE);
                preferences.edit().putString("colorsito",color).apply();

                break;
        }




    }









}