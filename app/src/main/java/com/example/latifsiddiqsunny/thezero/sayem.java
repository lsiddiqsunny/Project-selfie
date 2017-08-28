package com.example.latifsiddiqsunny.thezero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class sayem extends AppCompatActivity {
private static Button rb1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayem);
        onclick();
    }
    public void onclick(){

        rb1=(Button)findViewById(R.id.rb1);
        rb1.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {

                            startActivity(new Intent(sayem.this,Homepage.class));

                    }
                }



        );
    }

}
