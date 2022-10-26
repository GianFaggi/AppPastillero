package com.example.apppastillero.Activities;

import static android.widget.Toast.LENGTH_SHORT;
import static com.example.apppastillero.R.string.IngresoExitoso;
import static com.example.apppastillero.R.string.RegistroExitoso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.apppastillero.R;

public class LoginActivity extends AppCompatActivity {

    Button Boton_Registro;
    Button Boton_Ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cambia el nombre del titulo del Action bar
        getSupportActionBar().setTitle("Bienvenido");

        Boton_Registro = findViewById(R.id.Boton_Registrarse);
        Boton_Ingresar = findViewById(R.id.Boton_Ingresar);

        Boton_Registro.setOnClickListener(new View.OnClickListener(){
            @Override
                    public void onClick(View v){
                IrRegistro(v);
            }
        });

        Boton_Ingresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Iniciar(v);
            }
        });



    }
    private void IrRegistro(View view){
        Intent intent = new Intent(this, Registro.class);
        startActivity(intent);
    }

    private void Iniciar(View view){
        Toast.makeText(this, getString(IngresoExitoso), LENGTH_SHORT).show();
        Intent intent = new Intent(this, Inicio.class);
        startActivity(intent);

    }

}