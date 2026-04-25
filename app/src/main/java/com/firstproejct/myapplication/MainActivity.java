package com.firstproejct.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.mybtn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
        finish();
        /*Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.praxware.com"));
        startActivity(intent);*/

       /* Intent intent=new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:"+"9016395600"));
        startActivity(intent);*/

    }
}