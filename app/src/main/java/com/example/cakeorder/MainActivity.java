package com.example.cakeorder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
     EditText cname,cid,dod,tod;
     RadioGroup rg;

     RadioButton rb1,rb2,rb3;

     Spinner sp;

     String [] flavours={"Vanilla","Red velvet","Black forest","Chocolate","Pineapple","Apple"};







    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cname = findViewById(R.id.cname);
        cid = findViewById(R.id.cid);
        rg = findViewById(R.id.rg);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        sp = findViewById(R.id.sp);
        dod = findViewById(R.id.dod);
        tod = findViewById(R.id.tod);

        ArrayAdapter arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, flavours);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(arrayAdapter);
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                flavours = new String[]{parent.getItemAtPosition(position).toString()};

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

    }


    }
}