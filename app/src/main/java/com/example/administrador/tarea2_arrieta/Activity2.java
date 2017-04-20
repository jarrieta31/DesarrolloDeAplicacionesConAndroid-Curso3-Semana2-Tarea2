package com.example.administrador.tarea2_arrieta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString(getResources().getString(R.string.p_nombre));
        int[] fecha = parametros.getString(getResources().getString(R.string.p_fecha));
        String telefono = parametros.getString(getResources().getString(R.string.p_telefono));
        String email = parametros.getString(getResources().getString(R.string.p_email));
        String descripcion = parametros.getString(getResources().getString(R.string.p_descripcion));
        int dia = dpFecha.getDayOfMonth();
        int mes = dpFecha.getDayOfMonth();
        int anio = dpFecha.getYear();
    }
}
