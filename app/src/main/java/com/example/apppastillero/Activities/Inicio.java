package com.example.apppastillero.Activities;

import static android.widget.Toast.LENGTH_SHORT;
import static com.example.apppastillero.R.string.CSExitoso;
import static com.example.apppastillero.R.string.IngresoExitoso;
import static com.example.apppastillero.R.string.RegistroExitoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.apppastillero.R;

public class Inicio extends AppCompatActivity {


    //----------------------------------------------------------------------------------------------
    //Llamada Layout

    Button Boton_Dosis;
    Button Boton_Perfil;

    //----------------------------------------------------------------------------------------------
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //Cambia el nombre del titulo del Action bar
        getSupportActionBar().setTitle("INICIO");

        Boton_Dosis = findViewById(R.id.Boton_Dosis);
        Boton_Perfil = findViewById(R.id.Boton_Perfil);


        Boton_Dosis.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IrDosis(v);
            }
        });

        Boton_Perfil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IrPerfil(v);
            }
        });
    }

    //----------------------------------------------------------------------------------------------
    //Funciones Botones
    private void IrDosis(View view){

        Intent intent = new Intent(this, Dosis.class);

        startActivity(intent);

    }

    private void IrPerfil(View view){

        Intent intent = new Intent(this, Perfil.class);

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
        Toast.makeText(this, getString(CSExitoso), LENGTH_SHORT).show();
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }

}