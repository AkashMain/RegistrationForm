package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstname,lastname,marks10,marks12,stream,faname,moname,city,phoneno;
    RadioGroup rggender;
    CheckBox cpp,java,py,cgpa,percent;
    Button btnsbmt;
    String skill="";
    String cbanswer="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname=findViewById(R.id.etfname);
        lastname=findViewById(R.id.etlname);
        marks10=findViewById(R.id.marks10);
        marks12=findViewById(R.id.marks12);
        stream=findViewById(R.id.etstream);
        faname=findViewById(R.id.etfathername);
        moname=findViewById(R.id.etmothername);
        city=findViewById(R.id.etcity);
        phoneno=findViewById(R.id.etphone);
        rggender=findViewById(R.id.rggender);
        cgpa=findViewById(R.id.cgpa);
        percent=findViewById(R.id.percent);
        cpp=findViewById(R.id.cbcpp);
        java=findViewById(R.id.cbjava);
        py=findViewById(R.id.cbpython);
        btnsbmt=findViewById(R.id.btn);

        btnsbmt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (cgpa.isChecked()){
                    cbanswer=cgpa.getText().toString();
                }
                else if (percent.isChecked()){
                    cbanswer=percent.getText().toString();
                }

                if (cpp.isChecked()){
                    skill+="C++";
                }
                if (java.isChecked()){
                    skill+="Java";
                }
                if (py.isChecked()){
                    skill+="Python";
                }

                int selected_rb_gender=rggender.getCheckedRadioButtonId();
                RadioButton radioButtongender=findViewById(selected_rb_gender);

                Toast.makeText(MainActivity.this,"Submitted",Toast.LENGTH_SHORT).show();

                startActivity(new Intent(MainActivity.this,MainActivity2.class)
                        .putExtra("Name",firstname.getText().toString()+" "+lastname.getText().toString())
                        .putExtra("10",marks10.getText().toString())
                        .putExtra("12", marks12.getText().toString())
                        .putExtra("stream", stream.getText().toString())
                        .putExtra("paname", faname.getText().toString())
                        .putExtra("maname", moname.getText().toString())
                        .putExtra("city", city.getText().toString())
                        .putExtra("monum", phoneno.getText().toString())
                        .putExtra("gender",radioButtongender.getText().toString())
                        .putExtra("skill", skill)
                        .putExtra("mode",cbanswer)
                );

            }
        });

    }
}