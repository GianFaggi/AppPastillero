package com.example.apppastillero.Activities;

import static android.widget.Toast.LENGTH_SHORT;
import static com.example.apppastillero.R.string.CSExitoso;
import static com.example.apppastillero.R.string.PDFExitoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.apppastillero.R;

public class DatosClinicos extends AppCompatActivity {

    Button boton_PDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_clinicos);

        //Cambia el nombre del titulo del Action bar
        getSupportActionBar().setTitle("DATOS CLINICOS");

        boton_PDF = findViewById(R.id.Boton_PDF);

        boton_PDF.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                descargarPdf(v);
            }
        });

    }

    private void descargarPdf(View view){

        Toast.makeText(this, getString(PDFExitoso), LENGTH_SHORT).show();
        Intent intent = new Intent(this, DatosClinicos.class);
        startActivity(intent);

    }
}