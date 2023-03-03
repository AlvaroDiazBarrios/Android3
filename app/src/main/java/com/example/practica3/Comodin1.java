package com.example.practica3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class Comodin1 extends AppCompatActivity {

    Switch profesor;
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comodin1);

        profesor = findViewById(R.id.profesor);
        btn1 = findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean respuesta = profesor.isChecked();

                Intent intent = new Intent(Comodin1.this, MainActivity.class);
                intent.putExtra("profesor", respuesta);
                startActivity(intent);
            }
        });
    }
}