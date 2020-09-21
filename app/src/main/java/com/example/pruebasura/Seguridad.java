package com.example.pruebasura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seguridad extends AppCompatActivity {

    private Button button1, button2;

    private String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seguridad);

        button1 = (Button) findViewById(R.id.btn1);
        button2 = (Button) findViewById(R.id.btn2);
    }

    public void Web(View v){

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.netflix.com/"));
    }

    /*public void Incidencia(){

        if(password.equals("123")){


        }
    }*/

}
