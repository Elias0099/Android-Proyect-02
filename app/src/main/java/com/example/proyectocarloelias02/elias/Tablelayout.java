package com.example.proyectocarloelias02.elias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.proyectocarloelias02.R;
import com.example.proyectocarloelias02.carlo.CardView;
import com.example.proyectocarloelias02.carlo.NavigationDraw;

public class Tablelayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablayout_main);

        Button backButton = findViewById(R.id.backbutton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cierra la actividad actual y regresa a la actividad anterior
                finish();
            }
        });

        Button goToCarViewButton = findViewById(R.id.menu);
        goToCarViewButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Iniciar una nueva actividad (carview_)
                Intent intent = new Intent(Tablelayout.this, Menu.class);
                startActivity(intent);
            }
        });

    }
}