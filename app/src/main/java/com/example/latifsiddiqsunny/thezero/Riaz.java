package com.example.latifsiddiqsunny.thezero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Riaz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riaz);
        onclick();
    }
    private static Button b2;

    public void onclick(){

        b2=(Button)findViewById(R.id.b2);
        b2.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        startActivity(new Intent(Riaz.this,Homepage.class));

                    }
                }



        );
    }

}

