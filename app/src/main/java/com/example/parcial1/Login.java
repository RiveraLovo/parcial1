package com.example.parcial1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button enviar=(Button)this.findViewById(R.id.envi);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent env =new Intent(Login.this,controlbasico.class);
                startActivity(env);
            }
        });
        Button enviarda=(Button)this.findViewById(R.id.recibir);
        enviarda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent enviart =new Intent(Login.this,EnviarDatos.class);
                startActivity(enviart);
            }
        });
        Button tabs=(Button)this.findViewById(R.id.tabs);
        tabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tabsmnu =new Intent(Login.this,Tabs1.class);
                startActivity(tabsmnu);
            }
        });

        Button senso14=(Button)this.findViewById(R.id.sensor14);
        senso14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sensms =new Intent(Login.this,SensorDeProximidad.class);
                startActivity(sensms);
            }
        });

        Button acel=(Button)this.findViewById(R.id.acelerometro);
        acel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent acelerm =new Intent(Login.this,Sensor_Acelerometro.class);
                startActivity(acelerm);
            }
        });

        Button reprodi=(Button)this.findViewById(R.id.reproductor);
        reprodi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rpdi =new Intent(Login.this,Reproductor.class);
                startActivity(rpdi);
            }
        });
    }
}