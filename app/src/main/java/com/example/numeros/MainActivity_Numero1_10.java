package com.example.numeros;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity_Numero1_10 extends AppCompatActivity {
    public ImageButton n1,n2,n3,n4,n5,n6,n7,n8,n9,n10;
    MediaPlayer numero;
    public Button volver2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_numero110);

        n1 = (ImageButton) findViewById(R.id.btnnum1);
        n2 = (ImageButton) findViewById(R.id.btnnum2);
        n3 = (ImageButton) findViewById(R.id.btnnum3);
        n4 = (ImageButton) findViewById(R.id.btnnum4);
        n5 = (ImageButton) findViewById(R.id.btnnum5);
        n6 = (ImageButton) findViewById(R.id.btnnum6);
        n7 = (ImageButton) findViewById(R.id.btnnum7);
        n8 = (ImageButton) findViewById(R.id.btnnum8);
        n9 = (ImageButton) findViewById(R.id.btnnum9);
        n10 = (ImageButton) findViewById(R.id.btnnum10);
        volver2 = (Button) findViewById(R.id.btnvolver2);
        numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_1);


        volver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_1);
                numero.start();

            }
        });

        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_2);
                numero.start();
            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_3);
                numero.start();
            }
        });

        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_4);
                numero.start();
            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_5);
                numero.start();
            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_6);
                numero.start();
            }
        });

        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_7);
                numero.start();
            }
        });

        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_8);
                numero.start();
            }
        });

        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_9);
                numero.start();
            }
        });

        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero.pause();
                numero.release();
                numero=null;
                numero = MediaPlayer.create(getApplicationContext(),R.raw.numero_10);
                numero.start();
            }
        });







    }
}