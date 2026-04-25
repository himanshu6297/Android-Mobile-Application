package com.firstproejct.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener {

    EditText t1, t2, t3;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        t1 = findViewById(R.id.txt1);
        t2 = findViewById(R.id.txt2);
        t3 = findViewById(R.id.txt3);
        btn = findViewById(R.id.button7);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String uname = t1.getText().toString();
        String password = t2.getText().toString();
        String address = t3.getText().toString();
        Intent intent=new Intent(MainActivity3.this,MainActivity2.class);
        intent.putExtra("key1",uname);
        intent.putExtra("key2",password);
        intent.putExtra("key3",address);
        startActivity(intent);
    }
}