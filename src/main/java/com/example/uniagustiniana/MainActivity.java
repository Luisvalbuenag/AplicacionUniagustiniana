package com.example.uniagustiniana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public EditText Nombre;
    public EditText Apellido;
    public EditText Cedula;
    public EditText Telefono;
    public EditText Direccion;
    public EditText Credito;
    private Button Inscripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.Editnombre);
        Apellido = findViewById(R.id.editapellido);
        Cedula = findViewById(R.id.editcedula);
        Telefono = findViewById(R.id.edittelefono);
        Direccion = findViewById(R.id.editdireccion);
        Credito = findViewById(R.id.editcreditos);
        Inscripcion = findViewById(R.id.button);
    }
    public void cambiopestana (View view) {

        String nombre = Nombre.getText().toString();
        String apellido = Apellido.getText().toString();
        String direccion = Direccion.getText().toString();
        String cedula = Cedula.getText().toString();
        String credito = Credito.getText().toString();
        String telefono = Telefono.getText().toString();
        Universidad universidad = new Universidad(nombre,apellido,direccion,cedula,credito,telefono);


        Intent Siguiente = new Intent(MainActivity.this,Recibo_pago.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("univer",universidad);
        Siguiente.putExtras(bundle);
        startActivity(Siguiente);



    }
}