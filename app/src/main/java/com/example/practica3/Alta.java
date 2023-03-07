package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.practica3.entidades.Usuario;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;

public class Alta extends AppCompatActivity {

    EditText txtNombre, txtEmail, txtFecha;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alta);

        txtNombre = findViewById(R.id.txtNombre);
        txtEmail = findViewById(R.id.txtEmail);
        txtFecha = findViewById(R.id.txtFecha);
        btn1 = findViewById(R.id.btn1);

        Usuario usu;
        usu = (Usuario) getIntent().getSerializableExtra("objeto");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre, email, fecha;

                nombre = txtNombre.getText().toString();
                email = txtEmail.getText().toString();
                fecha = txtFecha.getText().toString();

                if(!nombre.equals("") && !email.equals("") && !fecha.equals("")){
                    Intent intent = new Intent(Alta.this, MainActivity.class);
                    usu.setNombre(nombre);
                    usu.setEmail(email);
                    usu.setFechaNac(fecha);
                    intent.putExtra("objeto", (Serializable) usu);
                    startActivity(intent);
                } else{
                    Toast.makeText(Alta.this, "No deje ningun campo vacío", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}