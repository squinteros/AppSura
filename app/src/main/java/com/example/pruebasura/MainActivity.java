package com.example.pruebasura;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText edit1, edit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText) findViewById(R.id.et1);
        edit2 = (EditText) findViewById(R.id.et2);
    }

    public void IniciarSecion(View v)
    {
        if(edit1.getText().toString().equals("Alan") && edit2.getText().toString().equals("123"))
        {

            Intent menu = new Intent(this, Menu.class);
            startActivity(menu);


        }
        else
        {

            edit1.setText("Usuario Invalido");
        }


    }


}
