package com.example.apppastillero.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.example.apppastillero.R;

public class Dosis extends AppCompatActivity {

    //----------------------------------------------------------------------------------------------
    //Llamada Layout
    Button Boton_Ver_Dosis;
    Button Boton_Administrar_Dosis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dosis);

        //Cambia el nombre del titulo del Action bar
        getSupportActionBar().setTitle("DOSIS");

        Boton_Ver_Dosis = findViewById(R.id.Boton_Ver_Dosis);
        Boton_Administrar_Dosis= findViewById(R.id.Boton_Administrar_Dosis);

        Boton_Administrar_Dosis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IrAdministrarDosis(v);
            }
        });

        Boton_Ver_Dosis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IrVerDosis(v);
            }
        });

    }

    //----------------------------------------------------------------------------------------------
    //Funciones Botones
    private void IrAdministrarDosis(View view){

        Intent intent = new Intent(this, AdministrarDosis.class);

        startActivity(intent);

    }

    private void IrVerDosis(View view){

        Intent intent = new Intent(this, VerDosis.class);

        startActivity(intent);

    }



    //----------------------------------------------------------------------------------------------

    //Instanciar Menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    //Darle funcionalidades al Menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.Configuracion_Horario:
                IrConfiguracion();
                return true;

            case R.id.Cerrar_Sesion:
                IrLogin();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    //Funciones para el menu
    private void IrConfiguracion(){

        Intent intent = new Intent(this, ConfigurarHora.class);
        startActivity(intent);

    }


    private void IrLogin(){

        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }
}