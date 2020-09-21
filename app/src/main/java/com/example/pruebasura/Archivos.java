package com.example.pruebasura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Archivos extends AppCompatActivity {

    private TextView text1;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archivos);
        text1 = (TextView) findViewById(R.id.tv1);
        button = (Button) findViewById(R.id.btn1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               new Task().execute(text1.getText().toString());
            }
        });

    }


    class Task extends AsyncTask<String, Void, String>{

        @Override
        protected void onPreExecute(){

            text1.setText("Ha iniciado la descarga");
        }


        @Override
        protected String doInBackground(String... strings) {
            try{
                for(int i = 1; i<=10; i++){

                    Thread.sleep(500);

                }

            }
            catch(InterruptedException e){
                e.printStackTrace();

            }
            return null;
        }
        @Override
        protected void onPostExecute(String s){

            text1.setText("Ha finalizado la descarga");
        }
    }
}
