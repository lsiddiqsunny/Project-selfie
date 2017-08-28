package com.example.latifsiddiqsunny.thezero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sadat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sadat);
        onclick();
    }
    private static Button b4;

    public void onclick(){

        b4=(Button)findViewById(R.id.b4);
        b4.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        startActivity(new Intent(Sadat.this,Homepage.class));

                    }
                }



        );
    }
}
