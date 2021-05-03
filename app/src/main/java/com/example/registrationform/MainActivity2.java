package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView name,mode,marks10,marks12,stream,foname,maname,city2,mobnum,gender2,skill2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        name=findViewById(R.id.tvname);
        mode=findViewById(R.id.tvmode);
        marks10=findViewById(R.id.tvmarks10);
        marks12=findViewById(R.id.tvmarks12);
        stream=findViewById(R.id.tvstream);
        foname=findViewById(R.id.tvfoname);
        maname=findViewById(R.id.tvmaname);
        city2=findViewById(R.id.tvcity);
        mobnum=findViewById(R.id.tvmob);
        gender2=findViewById(R.id.tvgender);
        skill2=findViewById(R.id.tvskill);


        name.setText(getIntent().getStringExtra("Name"));
        mode.setText(getIntent().getStringExtra("mode"));
        marks10.setText(getIntent().getStringExtra("10"));
        marks12.setText(getIntent().getStringExtra("12"));
        stream.setText(getIntent().getStringExtra("stream"));
        foname.setText(getIntent().getStringExtra("paname"));
        maname.setText(getIntent().getStringExtra("maname"));
        city2.setText(getIntent().getStringExtra("city"));
        mobnum.setText(getIntent().getStringExtra("monum"));
        gender2.setText(getIntent().getStringExtra("gender"));
        skill2.setText(getIntent().getStringExtra("skill"));



    }
}