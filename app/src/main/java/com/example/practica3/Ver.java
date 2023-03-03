package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class Ver extends AppCompatActivity {

    EditText txtNombre, txtEmail, txtFecha, txtProfesor, txtAsignaturas, txtGenero;
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

            txtNombre.setText(savedInstanceState.getString("nombre"));
            txtEmail.setText(savedInstanceState.getString("email"));
            txtFecha.setText(savedInstanceState.getString("fecha"));
            txtAsignaturas.setText(savedInstanceState.getString("asignatura"));
            txtGenero.setText(savedInstanceState.getString("genero"));

            if(savedInstanceState.getBoolean("profesor")){
                txtProfesor.setText("Si");
            } else {
                txtProfesor.setText("No");
            }


    }
}