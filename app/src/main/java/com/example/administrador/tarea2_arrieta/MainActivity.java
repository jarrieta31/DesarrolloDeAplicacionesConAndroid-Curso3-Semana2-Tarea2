package com.example.administrador.tarea2_arrieta;

import android.content.Intent;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    private Button btnSiguiente;
    private DatePicker dpFecha;
    private  EditText editTextNombre;
    private EditText editTextTelefono;
    private EditText editTextEmail;
    private EditText editTextDescripcion;
   /* private String dia;
    private String mes;
    private String anio; */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtendo todos los elementos de la vista
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        dpFecha= (DatePicker) findViewById(R.id.dpFecha);
        editTextNombre = (EditText) findViewById(R.id.editTextNombre);
        editTextTelefono = (EditText) findViewById(R.id.editTextTelefono);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextDescripcion = (EditText) findViewById(R.id.editTextDescripcion);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = editTextNombre.getText().toString();
                String telefono = editTextTelefono.getText().toString();
                String email = editTextEmail.toString();
                String descripcion = editTextDescripcion.getText().toString();
                int[] fecha = {dpFecha.getDayOfMonth(), dpFecha.getMonth(), dpFecha.getYear()};

               // String anio;
              //  String msj = "Nombre: "+nombre+"\nTelefono: "+telefono+"\nFecha: "+dia;
               // Toast.makeText(MainActivity.this, msj, Toast.LENGTH_SHORT).show();

                Intent  intent = new Intent(MainActivity.this, Activity2.class);
                intent.putExtra(getResources().getString(R.string.p_nombre), nombre);
                intent.putExtra(getResources().getString(R.string.p_fecha), fecha);
                intent.putExtra(getResources().getString(R.string.p_telefono), telefono);
                intent.putExtra(getResources().getString(R.string.p_email), email);
                intent.putExtra(getResources().getString(R.string.p_descripcion), descripcion);
                startActivity(intent);





            }
        });


    }
}
