package com.example.ecolab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nombreInput;
    private TextView promptText;
    private Button continuarBoton;
    private Button configBoton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombreInput = findViewById(R.id.nombreInput);
        promptText = findViewById(R.id.promptText);
        continuarBoton = findViewById(R.id.continuarBoton);
        configBoton = findViewById(R.id.configBoton);

        continuarBoton.setOnClickListener(this);

    }

    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.continuarBoton:
                String nombreIn=nombreInput.getText().toString();

                Intent i=new Intent(this,CalcularNotas.class);
                i.putExtra("nombre",nombreIn);
                startActivity(i);
                break;
        }
    }









}