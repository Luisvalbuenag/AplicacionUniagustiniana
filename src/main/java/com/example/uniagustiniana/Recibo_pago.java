package com.example.uniagustiniana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Recibo_pago extends AppCompatActivity {

    public TextView nombre;
    public TextView apellido;
    public TextView telefono;
    public TextView cedula;
    public TextView direccion;
    public TextView creditos;
    public TextView totalcreditos;
    public TextView totalcreditosiva;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibo_pago);


        nombre = findViewById(R.id.Nombre);
        apellido = findViewById(R.id.Apellido);
        cedula = findViewById(R.id.Cedula);
        telefono = findViewById(R.id.Creditos);
        direccion = findViewById(R.id.Direccion);
        creditos = findViewById(R.id.Telefono);
        totalcreditos = findViewById(R.id.TotalCreditos);
        totalcreditosiva = findViewById(R.id.TotalCreditosIva);

        Bundle bundle1 = getIntent().getExtras();
        Universidad dato = null;


            dato = (Universidad) bundle1.getSerializable("univer");
            nombre.setText(dato.getNombre());
            apellido.setText(dato.getApellido());
            cedula.setText(String.valueOf(dato.getCedula()));
            telefono.setText(dato.getTelefono());
            direccion.setText(dato.getDireccion());
            creditos.setText(String.valueOf(dato.getCredito()));

           double creditos1 = Double.parseDouble(dato.getCredito());


          totalcreditos.setText(String.valueOf(dato.operacion(345000,Double.parseDouble(dato.getTelefono()))));

          double creditostotal = dato.operacion(345000,Double.parseDouble(dato.getTelefono()));

          double Totalfinal =  (creditostotal * 0.19) + creditostotal;

           totalcreditosiva.setText(String.valueOf(Totalfinal));



    }



   }



