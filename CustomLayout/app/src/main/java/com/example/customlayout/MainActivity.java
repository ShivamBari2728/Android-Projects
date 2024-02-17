package com.example.customlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listview;
   String arr []={"Shivam 1","Item 2","Item 3","Shivam 1","Shivam 1","Shivam 1","Shivam 1","Shivam 1",};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.listView);
        ShivamAdapter s = new ShivamAdapter(this,R.layout.my_layout,arr);
        listview.setAdapter(s);
//        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
//                Toast.makeText(MainActivity.this, "Click recived", Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}