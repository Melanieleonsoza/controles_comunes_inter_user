package com.example.controles_comunes_inter_user;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //Localizar los controles
        TextView txtSaludo = (TextView)findViewById(R.id.txtmensaje);
        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();
        //Construimos el mensaje a mostrar
        txtSaludo.setText("Hola!, Bienvenido \n "+
                bundle.getString("genero")+"\n" +
                bundle.getString("nombre")+"\n" +
                bundle.getString("cedula")+"\n" +
                bundle.getString("fechanacimiento")+"\n" +
                bundle.getString("ciudad")+"\n" +
                bundle.getString("celular")+"\n" +
                bundle.getString("email"));

    }
}