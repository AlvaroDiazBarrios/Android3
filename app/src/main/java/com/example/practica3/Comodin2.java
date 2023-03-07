package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.example.practica3.entidades.Usuario;

import java.io.Serializable;

public class Comodin2 extends AppCompatActivity {

    Button btn1;
    CheckBox ch1, ch2, ch3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comodin2);

        btn1 = findViewById(R.id.btn1);
        ch1 = findViewById(R.id.ch1);
        ch2 = findViewById(R.id.ch2);
        ch3 = findViewById(R.id.ch3);
        Usuario usu;
        usu = (Usuario) getIntent().getSerializableExtra("objeto");


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String seleccion = "";

                if(ch1.isChecked()){
                    seleccion += "Matemáticas ";
                }

                if(ch2.isChecked()){
                    seleccion += "Lengua ";
                }

                if(ch3.isChecked()){
                    seleccion += "Fisica ";
                }

                Intent intent = new Intent(Comodin2.this, MainActivity.class);
                usu.setAsignaturas(seleccion);
                intent.putExtra("objeto", (Serializable) usu);
                startActivity(intent);
            }
        });
    }
}