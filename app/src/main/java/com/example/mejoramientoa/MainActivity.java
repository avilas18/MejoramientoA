package com.example.mejoramientoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText Area;
    private TextView Resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Area=findViewById(R.id.area);
        Resultado=findViewById(R.id.resultado);

        Button CalcularL=findViewById(R.id.buttonCalcular);
        CalcularL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CalcularArea();
            }
        });
    }

    private void CalcularArea(){
        Double area= Double.parseDouble(Area.getText().toString());
        Double res= area*area;

        Resultado.setText(String.valueOf(area)+ "cm^2");
    }
}