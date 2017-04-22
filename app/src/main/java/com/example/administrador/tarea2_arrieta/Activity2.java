package com.example.administrador.tarea2_arrieta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    /*
        Declaro los TextView para trabajar con ellos
     */
    private TextView tvNombre;
    private TextView tvFecha;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;

    private String nombre;
    private String descripcion;
    private String email;
    private String telefono;
    private ArrayList<Integer> fecha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        /*
            Obtengo los TextView para trabajar con ellos
        */
        tvNombre = (TextView)findViewById(R.id.tvNombre);
        tvFecha = (TextView)findViewById(R.id.tvFecha);
        tvTelefono = (TextView)findViewById(R.id.tvTelefono);
        tvEmail = (TextView)findViewById(R.id.tvEmail);
        tvDescripcion = (TextView)findViewById(R.id.tvDescripción);

        /*
            Recibo los datos desde MainActivty
         */
        Bundle parametros = getIntent().getExtras();
        nombre = parametros.getString(getResources().getString(R.string.p_nombre));
        telefono = parametros.getString(getResources().getString(R.string.p_telefono));
        email = parametros.getString(getResources().getString(R.string.p_email));
        descripcion = parametros.getString(getResources().getString(R.string.p_descripcion));
        /*
            Recive el ArrayList fecha
         */
        fecha = (ArrayList<Integer>) getIntent().getSerializableExtra(getResources().getString(R.string.p_fecha));
        /*
            Ingreso los valores recibidos en los TextView correspondientes
         */
        tvNombre.setText(nombre);
        tvTelefono.setText(getResources().getString(R.string.texto_telefono) + " " + telefono);
        tvEmail.setText(getResources().getString(R.string.texto_email)+ " " + email);
        tvDescripcion.setText(getResources().getString(R.string.texto_descripcion)+ " " + descripcion);
        tvFecha.setText(getResources().getString(R.string.texto_fecha)+" "+fecha.get(0)+"/"+(fecha.get(1)+1)+"/"+fecha.get(2));

    }

    public void retornaDatos(){
        Intent intent = new Intent(Activity2.this, MainActivity.class);
            startActivity(intent);
    }
}
