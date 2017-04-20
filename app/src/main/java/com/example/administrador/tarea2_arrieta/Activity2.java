package com.example.administrador.tarea2_arrieta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    private TextView tvNombre = (TextView)findViewById(R.id.tvNombre);
    private TextView tvFecha = (TextView)findViewById(R.id.tvFecha);
    private TextView tvTelefono = (TextView)findViewById(R.id.tvTelefono);
    private TextView tvEmail = (TextView)findViewById(R.id.tvEmail);
    private TextView tvDescripcion = (TextView)findViewById(R.id.tvDescripción);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle parametros = getIntent().getExtras();

        String nombre = parametros.getString(getResources().getString(R.string.p_nombre));

        //int[] fecha = parametros.getString(getResources().getString(R.string.p_fecha));
        String telefono = parametros.getString(getResources().getString(R.string.p_telefono));
        String email = parametros.getString(getResources().getString(R.string.p_email));
        String descripcion = parametros.getString(getResources().getString(R.string.p_descripcion));


        tvNombre.setText(nombre);

    }
}
