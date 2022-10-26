package com.example.apppastillero.Activities;

import static android.widget.Toast.LENGTH_SHORT;

import static com.example.apppastillero.R.string.RegistroExitoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.apppastillero.R;

public class Registro extends AppCompatActivity {

    Button Confirmar_Registro;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        getSupportActionBar().setTitle("Registro");

        Confirmar_Registro = findViewById(R.id.Boton_Confirmar_Registro);

        Confirmar_Registro.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                VolverLogin(v);
            }
        });


    }



    //----------------------------------------------------------------------------------------------
    //Funciones

    private void VolverLogin(View view){
        Toast.makeText(this, getString(RegistroExitoso), LENGTH_SHORT).show();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}