package com.firstproejct.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MenuPage1 extends AppCompatActivity {

    ListView lv;
    ArrayList<Categorylist>arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_page1);
        lv=findViewById(R.id.lstview);
        arrayList=new ArrayList<>();
        APIInterface apiInterface=APPClient.getclient().create(APIInterface.class);
        Call<ResultCategory>call=apiInterface.getlist();
        call.enqueue(new Callback<ResultCategory>() {
            @Override
            public void onResponse(Call<ResultCategory> call, Response<ResultCategory> response) {
                arrayList= (ArrayList<Categorylist>) response.body().getCategorylist();
                Log.e("Response", String.valueOf(response.body().getCategorylist()));
                Customadapter customadapter=new Customadapter(MenuPage1.this,arrayList);
                lv.setAdapter(customadapter);
            }

            @Override
            public void onFailure(Call<ResultCategory> call, Throwable t) {
                Log.e("Error", String.valueOf(t));
            }
        });
    }
}