package com.example.assmt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondAtivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_ativity);

        Intent intent;
        intent=getIntent();

        String number=intent.getStringExtra("messeg");
        TextView Text0=(TextView)(TextView)findViewById(R.id.txtHello);
        TextView Text1=(TextView)(TextView)findViewById(R.id.txtNumber);
        Text0.setText("Hello World");
        Text1.setText(number);

    }
}
