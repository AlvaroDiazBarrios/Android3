package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.practica3.entidades.Usuario;

import java.io.Serializable;

public class Ver extends AppCompatActivity {

    EditText txtNombre, txtEmail, txtFecha, txtProfesor, txtAsignaturas, txtGenero;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver);
        txtNombre = findViewById(R.id.txtNombre);
        txtEmail = findViewById(R.id.txtEmail);
        txtFecha = findViewById(R.id.txtFecha);
        txtProfesor = findViewById(R.id.txtProfesor);
        txtAsignaturas = findViewById(R.id.txtAsignaturas);
        txtGenero = findViewById(R.id.txtGenero);
        btn1 = findViewById(R.id.btn1);

        Usuario usu;
        usu = (Usuario) getIntent().getSerializableExtra("objeto");

        if(usu != null){
            txtNombre.setText(usu.getNombre());
            txtEmail.setText(usu.getEmail());
            txtFecha.setText(usu.getFechaNac());
            if(usu.isProfesor()){
                txtProfesor.setText("Si");
            } else {
                txtProfesor.setText("No");
            }
            txtAsignaturas.setText(usu.getAsignaturas());
            txtGenero.setText(usu.getGenero());
        }


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Ver.this, MainActivity.class);
                intent.putExtra("objeto", (Serializable) usu);
                startActivity(intent);
            }
        });
    }
}