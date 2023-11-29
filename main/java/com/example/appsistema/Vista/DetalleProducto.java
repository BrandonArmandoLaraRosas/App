package com.example.appsistema.Vista;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.appsistema.R;
import com.squareup.picasso.Picasso;

public class DetalleProducto extends AppCompatActivity {

    ImageView imgProducto;
    TextView txtNombre;
    TextView txtPrecioCompra;
    TextView txtStock;
    TextView txtProveedor;
    TextView txtPrecioVenta;
    EditText txtDetalle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);
        imgProducto = (ImageView) findViewById(R.id.imgproducto);
        txtNombre= (TextView) findViewById(R.id.txtNombre1);
        txtDetalle=(EditText) findViewById(R.id.txtDescripcionProd);

        txtDetalle.setFocusable(false);
        txtDetalle.setClickable(false);
        txtDetalle.setFocusableInTouchMode(false);

        Intent intent = getIntent();
        String imageUrl = intent.getStringExtra("imagenUrl");
        String nombre = intent.getStringExtra("nombre");
        String detalle = intent.getStringExtra("descripcion");


        txtNombre.setText(nombre);
        txtDetalle.setText(detalle);

        Picasso.get().load("http://189.240.192.140/Webservices20221091/srcImagenes/"+imageUrl).resize(350,300).into(imgProducto);
    }
}