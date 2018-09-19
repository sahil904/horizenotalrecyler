package com.example.sahil.horizontelrecyler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recyler_present);
        LinearLayout linearLayout=new LinearLayout(getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        List<Pogo> list=new ArrayList<>();


        list.add(new Pogo(R.drawable.internshalalogo,"","ONLINE SUMMER TARININGS","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));
        list.add(new Pogo(R.drawable.internshalalogo,"","","","","","fghgf",""));


        ListAdapter myAdapter=new ListAdapter(list,this);
        recyclerView.setAdapter(myAdapter);
    }
}
