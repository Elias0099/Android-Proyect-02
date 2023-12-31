package com.example.proyectocarloelias02.carlo;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.proyectocarloelias02.R;

public class NavigationDraw extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigationdraw_main);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cierra la actividad actual y regresa a la actividad anterior
                finish();
            }
        });

        Button goToCarViewButton = findViewById(R.id.cardview);
        goToCarViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar una nueva actividad (carview_)
                Intent intent = new Intent(NavigationDraw.this, CardView.class);
                startActivity(intent);
            }
        });
    }
}