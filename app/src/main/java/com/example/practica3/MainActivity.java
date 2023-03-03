package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.practica3.entidades.Usuario;

import java.time.LocalDate;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Usuario usuario = new Usuario();

    Button btn1, btn2, btn3, btn4, btn5, btn6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Alta.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Intent intent = new Intent(MainActivity.this, Ver.class);
                intent.putExtra("nombre", usuario.getNombre());
                intent.putExtra("email", usuario.getEmail());
                intent.putExtra("fecha", usuario.getFechaNac());
                intent.putExtra("profesor", usuario.isProfesor());
                intent.putExtra("asignatura", usuario.getAsignaturas());
                intent.putExtra("genero", usuario.getGenero());
                startActivity(intent);*/

                System.out.println(usuario.getNombre());
                System.out.println(usuario.getEmail());
                System.out.println(usuario.getFechaNac());
                System.out.println(usuario.isProfesor());
                System.out.println(usuario.getAsignaturas());
                System.out.println(usuario.getGenero());
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Comodin1.class);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Comodin2.class);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Comodin3.class);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(0);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(getIntent().getExtras() != null){
            String nombre = getIntent().getExtras().getString("nombre");
            String email = getIntent().getExtras().getString("email");
            String fecha = getIntent().getExtras().getString("fecha");
            Boolean profesor = getIntent().getExtras().getBoolean("profesor");
            String asignatura = getIntent().getExtras().getString("asignatura");
            String genero = getIntent().getExtras().getString("genero");

            if(nombre != null && email != null && fecha != null){
                usuario.setNombre(nombre);
                usuario.setEmail(email);
                usuario.setFechaNac(fecha);
            }

            if(profesor != null){
                usuario.setProfesor(profesor);
            }

            if(asignatura != null){
                usuario.setAsignaturas(asignatura);
            }

            if(genero != null){
                usuario.setGenero(genero);
            }
        }

    }
}