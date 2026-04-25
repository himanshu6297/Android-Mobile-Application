package com.firstproejct.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Customadapter extends BaseAdapter {

    ArrayList<Categorylist> arrayList;
    Context context;

    public Customadapter(Context context,ArrayList<Categorylist>arrayList) {
        this.context = context;
        this.arrayList=arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.custom, null);
        ImageView iv = v.findViewById(R.id.imageView3);
        TextView tv1 = v.findViewById(R.id.textView4);
        TextView tv2 = v.findViewById(R.id.textView5);

        Glide.with(context).load(arrayList.get(i).getImage()).into(iv);
        tv1.setText(arrayList.get(i).getId()+"");
        tv2.setText(arrayList.get(i).getCname());

        return v;
    }
}
