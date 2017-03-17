package com.example.jose.mapasutec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button btnAceptar;
    EditText etEmail, etPass;
    TextView tvResul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail=(EditText)findViewById(R.id.etCorreo);
        etPass=(EditText)findViewById(R.id.etContra);

        btnAceptar=(Button)findViewById(R.id.btnIngresar);
        tvResul=(TextView)findViewById(R.id.tvResultado);
        btnAceptar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                String user, password, msj="Correcto";
                user=etEmail.getText().toString();
                password=etPass.getText().toString();
                Intent pantalla = new Intent(getApplicationContext(),MenuPrincipal.class);
                if(user.equals("jose")){
                    if(password.equals("123")) {
                        //msj = "Correcto";
                        //tvResul.setText(msj);
                        startActivity(pantalla);
                    }
                    else{
                        msj="Usuario o Password Incorrecto";
                        tvResul.setText(msj);
                    }
                }
                else{
                    msj="Usuario o Password Incorrecto";
                    tvResul.setText(msj);
                }
            }
        });
    }
}
