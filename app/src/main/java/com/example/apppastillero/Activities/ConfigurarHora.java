package com.example.apppastillero.Activities;

import static android.widget.Toast.LENGTH_SHORT;
import static com.example.apppastillero.R.string.CSExitoso;
import static com.example.apppastillero.R.string.C_Horario_Exitoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.apppastillero.R;

import java.nio.charset.Charset;

public class ConfigurarHora extends AppCompatActivity {

    Spinner ZonaHoraria;
    Spinner FormatoHorario;
    Button ConfirmarHorario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configurar_hora);

        //Cambia el nombre del titulo del Action bar
        getSupportActionBar().setTitle("Configurar Hora");

        //----------------------------------------------------------------------------------------------
        //Definimos los Spinner
        ZonaHoraria = (Spinner) findViewById(R.id.Zona_Horario);
        FormatoHorario = (Spinner) findViewById(R.id.Formato_Hora);

        //Se llena el adapter de datos
        ArrayAdapter<CharSequence> adapterZ= ArrayAdapter.createFromResource(this,R.array.Zona_Horaria,android.R.layout.simple_spinner_item);
        ZonaHoraria.setAdapter(adapterZ);

        ArrayAdapter<CharSequence> adapterF= ArrayAdapter.createFromResource(this,R.array.Formato_hora,android.R.layout.simple_spinner_item);
        FormatoHorario.setAdapter(adapterF);

        //----------------------------------------------------------------------------------------------
        //Boton Confirmacion

        ConfirmarHorario = findViewById(R.id.Boton_Confirmar_Horario);

        ConfirmarHorario.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                VolverHorario(v);
            }
        });

    }

    //----------------------------------------------------------------------------------------------
    //Funcion Boton
    private void VolverHorario(View view){
        Toast.makeText(this, getString(C_Horario_Exitoso), LENGTH_SHORT).show();
        Intent intent = new Intent(this, ConfigurarHora.class);
        startActivity(intent);

    }


}