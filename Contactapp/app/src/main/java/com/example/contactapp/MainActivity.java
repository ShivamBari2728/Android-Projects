package com.example.contactapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Contact c1=new Contact("84545454554","Shivam",1);
    Contact c2=new Contact("84545454554","Raj",1);
    Contact c3=new Contact("84545454554","kishan",1);
    Contact c4=new Contact("84545454554","Sid",1);
    Contact c5=new Contact("84545454554","Sagar",1);
    Contact c6=new Contact("69696969669","karan",1);
    Contact contacts []={c1,c2,c3,c4,c5,c6,c1,c2,c3,c4,c5,c6};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter ad= new CustomAdapter(contacts);
        recyclerView.setAdapter(ad);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL));
    }
}