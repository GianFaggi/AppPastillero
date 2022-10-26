package com.example.apppastillero.Activities;

import static android.widget.Toast.LENGTH_SHORT;
import static com.example.apppastillero.R.string.CSExitoso;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.apppastillero.Adapters.CardViewAdapter;
import com.example.apppastillero.R;
import com.example.apppastillero.Clases.Dosis;

import java.util.ArrayList;
import java.util.List;

public class AdministrarDosis extends AppCompatActivity {

    //Casteamos y listamos las dosis
    List<Dosis> elements;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrar_dosis);

        //Cambia el nombre del titulo del Action bar
        getSupportActionBar().setTitle("ADMINISTRAR");

        init();
    }

    //----------------------------------------------------------------------------------------------
    //Llenado de cardView
    public void init(){
        elements = new ArrayList<>();
        elements.add(new Dosis("#775447", "Clonazepam", "8 horas", "5 horas"));
        elements.add(new Dosis("#607d8b", "Ibuprofeno", "5 horas", "30 minutos"));
        elements.add(new Dosis("#009688", "Polera cuello alto", "Mica", "Proximo"));

        CardViewAdapter listAdapter = new CardViewAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
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