package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.example.practica3.entidades.Usuario;

import java.io.Serializable;

public class Comodin3 extends AppCompatActivity {

    RadioButton rb1, rb2, rb3, rb4;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comodin3);

        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        rb4 = findViewById(R.id.rb4);
        btn1 = findViewById(R.id.btn1);

        Usuario usu;
        usu = (Usuario) getIntent().getSerializableExtra("objeto");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String genero = "";

                if (rb1.isChecked()){
                    genero = "Hombre";
                }

                if (rb2.isChecked()){
                    genero = "Mujer";
                }

                if (rb3.isChecked()){
                    genero = "Otro";
                }

                if (rb4.isChecked()){
                    genero = "N/a";
                }

                Intent intent = new Intent(Comodin3.this, MainActivity.class);
                usu.setGenero(genero);
                intent.putExtra("objeto", (Serializable) usu);
                startActivity(intent);
            }
        });


    }
}