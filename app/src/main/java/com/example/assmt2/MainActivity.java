package com.example.assmt2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btngo;
    Button btnadd;
    TextView txtdisply;
    String counter;
    public int numCount=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngo=(Button)findViewById(R.id.btnsend);
        txtdisply=(TextView)findViewById(R.id.txtHello);
        btngo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter=txtdisply.getText().toString();
                Intent intent=new Intent(MainActivity.this, SecondAtivity.class);
                intent.putExtra("messeg",counter);
                startActivity(intent);
                finish();
            }
        });
        btnadd=(Button)findViewById(R.id.btncount);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txts=(TextView) findViewById(R.id.txtHello);
                numCount++;
                txts.setText(Integer.toString(numCount));
            }
        });
    }
}
