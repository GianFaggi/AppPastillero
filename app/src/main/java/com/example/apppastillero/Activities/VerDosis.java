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
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.apppastillero.Adapters.ListViewAdapter;
import com.example.apppastillero.R;
import com.example.apppastillero.Clases.Dosis;

import java.util.ArrayList;
import java.util.List;

public class VerDosis extends AppCompatActivity {

    List<Dosis> elements;
    private ListView listaDosis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_dosis);
        getSupportActionBar().setTitle("VER DOSIS");

        listaDosis = findViewById(R.id.listViewDosis);

        List<Dosis> elements = new ArrayList<>();
        elements.add(new Dosis("#775447", "Clonazepam", "8 horas", "5 horas"));
        elements.add(new Dosis("#607d8b", "Ibuprofeno", "5 horas", "30 minutos"));
        elements.add(new Dosis("#009688", "Seroplex", "4 horas", "12 horas"));
        elements.add(new Dosis("#607d8b", "Omeprazol", "8 horas", "8 horas"));
        elements.add(new Dosis("#775447", "Truvada", "50 minutos", "12 minutos"));
        elements.add(new Dosis("#009688", "Luvox", "24 horas", "1 minuto"));
        elements.add(new Dosis("#607d8b", "Memantine", "48 horas", "12 horas"));


        listaDosis.setAdapter(new ListViewAdapter(elements));

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