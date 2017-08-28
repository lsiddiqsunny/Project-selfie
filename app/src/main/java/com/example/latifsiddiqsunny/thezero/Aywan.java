package com.example.latifsiddiqsunny.thezero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Aywan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aywan);
        onclick();
    }
    private static Button b3;

    public void onclick(){

        b3=(Button)findViewById(R.id.b3);
        b3.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        startActivity(new Intent(Aywan.this,Homepage.class));

                    }
                }



        );
    }
}
