package com.example.fernando.mitercerproyecto;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.et1);
        Toast notif = Toast.makeText(this, "Clave: untref123",Toast.LENGTH_LONG);
        notif.show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
//este método se activa con el botón Enviar, te lleva de una ventana a otra si la contraseña es correcta
    public void confirmar(View view){
        String valor = et1.getText().toString();
        if(valor.equals("untref123")){
            Intent intent = new Intent(this, segundaVentana.class);
            startActivity(intent);
        } else{
            Toast not = Toast.makeText(this,"Contraseña incorrecta", Toast.LENGTH_LONG);
            not.show();
        }

    }
}
