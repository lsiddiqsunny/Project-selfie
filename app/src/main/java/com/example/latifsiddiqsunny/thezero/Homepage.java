package com.example.latifsiddiqsunny.thezero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Homepage extends AppCompatActivity {
    private static Button b;
    private static RadioGroup rg;
    private static RadioButton r1,r2,r3,r4,r5,rx;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        onclick();
    }
    public void onclick(){
        b=(Button)findViewById(R.id.C);
        rg=(RadioGroup)findViewById(R.id.Radiogroup);
        r1=(RadioButton)findViewById(R.id.radioButton2);
        r2=(RadioButton)findViewById(R.id.radioButton5);
        r3=(RadioButton)findViewById(R.id.radioButton4);
        r4=(RadioButton)findViewById(R.id.radioButton);
        r5=(RadioButton)findViewById(R.id.radioButton3);
        b.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        int select=rg.getCheckedRadioButtonId();
                        rx=(RadioButton)findViewById(select);
                        if(rx==r1){
                            startActivity(new Intent(Homepage.this,sayem.class));
                        }
                        if(rx==r2){
                            startActivity(new Intent(Homepage.this,Riaz.class));
                        }
                        if(rx==r3){
                            startActivity(new Intent(Homepage.this,Aywan.class));
                        }
                        if(rx==r4){
                            startActivity(new Intent(Homepage.this,Sadat.class));
                        }
                        if(rx==r5){
                            startActivity(new Intent(Homepage.this,Riad.class));
                        }
                    }
                }



        );


    }

}
