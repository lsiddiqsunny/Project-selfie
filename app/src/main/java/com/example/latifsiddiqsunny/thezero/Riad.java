package com.example.latifsiddiqsunny.thezero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Riad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riad);
        onclick();
    }
    private static Button b5;

    public void onclick(){

        b5=(Button)findViewById(R.id.b5);
        b5.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                        startActivity(new Intent(Riad.this,Homepage.class));

                    }
                }



        );
    }
}
