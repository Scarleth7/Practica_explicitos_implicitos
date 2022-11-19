package com.example.practica_explicitos_implicitos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
    Button botonExp;
    Button botonImp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonImp = (Button) findViewById(R.id.button5);
        botonImp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                implicito();
                                        }
        });

                botonExp = (Button) findViewById(R.id.button4);
        botonExp.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                explicito();
            }
        });
    }
    public void implicito(){
        Intent i = new Intent (Intent.ACTION_DIAL, Uri.parse("tel:"+"963482757"));
        startActivity(i);
    }

    public void explicito(){
        Intent i = new Intent (this, MainActivity2.class);
        startActivity(i);
    }
}