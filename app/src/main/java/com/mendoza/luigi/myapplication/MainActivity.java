package com.mendoza.luigi.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Debug;
import android.telephony.SmsManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

//    class MyClaseClick implements View.OnClickListener {
//        @Override
//        public void onClick(View v) {
//            Log.i("MAIN_APP", "hice clic en el boton");
//        }
//            public void OtroClick(){
//
//            }
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnClick);

//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Log.i("MAIN_APP", "hice clic en el boton");
//            }
//        };
//        btn.setOnClickListener(new MyClaseClick());
//        btn.setOnClickListener(listener);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("MAIN_APP", "hice clic en el boton");
                EditText edtName = findViewById(R.id.edtName);
                String texto = edtName.getText().toString();
                Log.i("MAIN_APP", "Texto es: " + texto);

                // llamar a otro actividad
//                Context context = getApplicationContext();
//                Context context = MainActivity.this;
//                Context context = this; // esto funciona fuera de la interface

             /*   if(!texto.trim().equals("")) {
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("NAME_EXTRA", texto);
                    startActivity(intent);
                }
                else{
                    Log.i("MAIN_APP", "Inserte un nombre");
                    Toast.makeText(MainActivity.this, "Inserte un nombre", Toast.LENGTH_LONG).show();
                }*/
                Uri  uri = Uri.parse("smsto:+51999234");
                Intent intent=new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra("sms_body","este es un mensajexd");
                startActivity(intent);

            }
        });

//        btn.setOnClickListener(o -> {
//            Log.i("MAIN_APP", "hice clic en el boton");
//            Log.i("MAIN_APP", "hice clic en el boton");
//        });
    }
}