package com.example.jose.mapasutec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuPrincipal extends AppCompatActivity implements View.OnClickListener {

    private Button btninicio,btnUbicame,btnRutas,btncerrarSesión;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);

        btninicio=(Button)findViewById(R.id.btninicio);
        btnUbicame=(Button)findViewById(R.id.btnUbicame);
        btnRutas=(Button)findViewById(R.id.btnRutas);
        btncerrarSesión=(Button)findViewById(R.id.btncerrarSesión);

        btninicio.setOnClickListener(this);
        btnUbicame.setOnClickListener(this);
        btnRutas.setOnClickListener(this);
        btncerrarSesión.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btninicio:
                break;
            case R.id.btnUbicame:
                Intent mapa = new Intent(MenuPrincipal.this,MapsActivity.class);
                startActivity(mapa);
                break;
            case R.id.btnRutas:
                break;
            case R.id.btncerrarSesión:
                break;
        }
    }
}
