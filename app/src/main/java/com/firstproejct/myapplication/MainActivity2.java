package com.firstproejct.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    EditText t1, t2;
    Button btn;
    String name, password, address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t1 = findViewById(R.id.txt11);
        t2 = findViewById(R.id.txt22);
        btn = findViewById(R.id.btnlogin);
        getSupportActionBar().hide();
        Intent intent = getIntent();
        name = intent.getStringExtra("key1");
        password = intent.getStringExtra("key2");
        address = intent.getStringExtra("key3");
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String s1 = t1.getText().toString();
        String s2 = t2.getText().toString();
        if (s1.equals(name) && s2.equals(password)) {
            Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(MainActivity2.this, Home.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Login Fail", Toast.LENGTH_SHORT).show();
        }
    }
}