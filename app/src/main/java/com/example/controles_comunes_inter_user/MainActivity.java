package com.example.controles_comunes_inter_user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    ////////////LIMPIAR////////////////////////////////////////////////////////////////////////
    public void clean (View view)
    {
        EditText nombre =(EditText)findViewById(R.id.txtnombre);
        EditText cedula =(EditText)findViewById(R.id.txtcedula);
        EditText fechanacimiento =(EditText)findViewById(R.id.txtfechanacimiento);
        EditText ciudad =(EditText)findViewById(R.id.txtciudad);
        EditText email =(EditText)findViewById(R.id.email);
        EditText celular =(EditText)findViewById(R.id.txttelefono);
        RadioButton rbtnmas=(RadioButton)findViewById(R.id.rtdmasculino);
        RadioButton rbtfem=(RadioButton)findViewById(R.id.rdtfemenino);
        rbtnmas.setChecked(false);
        rbtfem.setChecked(false);
        nombre.setText("");
        cedula.setText("");
        ciudad.setText("");
        fechanacimiento.setText("");
        email.setText("");
        celular.setText("");

    }

    ////////////GUARDAR////////////////////////////////////////////////////////////////////////
    public void save (View view)
    {
        String genero;
        EditText txtnombre = (EditText)findViewById(R.id.txtnombre);
        EditText txtcedula =(EditText)findViewById(R.id.txtcedula);
        EditText txtfechanacimiento =(EditText)findViewById(R.id.txtfechanacimiento);
        EditText txtciudad =(EditText)findViewById(R.id.txtciudad);
        EditText txtemail =(EditText)findViewById(R.id.email);
        EditText txtcelular =(EditText)findViewById(R.id.txttelefono);
        RadioButton rbtnmas=(RadioButton)findViewById(R.id.rtdmasculino);
        genero="Estimad"+(rbtnmas.isChecked()?"o":"a");
//Creamos la información a pasar entre actividades - Pares Key-Value
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        Bundle b = new Bundle();
        b.putString("nombre", txtnombre.getText().toString().toUpperCase());
        b.putString("cedula", txtcedula.getText().toString());
        b.putString("fechanacimiento", txtfechanacimiento.getText().toString());
        b.putString("ciudad", txtciudad.getText().toString().toUpperCase());
        b.putString("celular", txtcelular.getText().toString());
        b.putString("email", txtemail.getText().toString());
        b.putString("genero", genero);
//Añadimos la información al intent
        intent.putExtras(b);
// Iniciamos la nueva actividad
        startActivity(intent);


    }
}