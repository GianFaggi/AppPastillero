package com.example.apppastillero.Activities;

import static android.widget.Toast.LENGTH_SHORT;
import static com.example.apppastillero.R.string.CSExitoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.apppastillero.R;

public class Perfil extends AppCompatActivity {

    Button Datos_Clinicos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        //Cambia el nombre del titulo del Action bar
        getSupportActionBar().setTitle("PERFIL");

        Datos_Clinicos = findViewById(R.id.Boton_Ir_Datos_Clinicos);

        Datos_Clinicos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                IrDatosClinicos(v);
            }
        });

    }

    //Funciones Botones
    private void IrDatosClinicos(View view){

        Intent intent = new Intent(this, DatosClinicos.class);

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
