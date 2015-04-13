package com.example.fernando.mitercerproyecto;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;


public class segundaVentana extends ActionBarActivity {

    private EditText et1,et2;
    private TextView tv4;
    private CheckBox cb1,cb2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_ventana);
        et1=(EditText)findViewById(R.id.et1);
        tv4=(TextView)findViewById(R.id.tv4);
        et2=(EditText)findViewById(R.id.et2);
        cb1=(CheckBox)findViewById(R.id.cb1);
        cb2=(CheckBox)findViewById(R.id.cb2);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_segunda_ventana, menu);
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

    public void salir(View view){

        finish();
    }

    public void operar(View view){
        String valor1 = et1.getText().toString();
        Double num1 = Double.parseDouble(valor1);
        String valor2 = et2.getText().toString();
        Double num2 = Double.parseDouble(valor2);
        String resultado="";
        int pantOculta=0;

        if(cb1.isChecked()==true){
            double suma = num1 + num2;
            resultado="La suma es:" + suma;
            if(suma==666){
                pantOculta=1;
            }
        }

        if(cb2.isChecked()==true){
            double resta = num1 - num2;
            resultado= resultado + "La resta es:" + resta;
            if(resta==666){
                pantOculta=1;
            }
        }
        tv4.setText(resultado);
        if(pantOculta==1){
            Intent i = new Intent(this,VentanaOculta.class);
            startActivity(i);
        }

    }
}
