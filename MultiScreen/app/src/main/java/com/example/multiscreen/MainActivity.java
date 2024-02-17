package com.example.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText name;
    public static final String Extra_NAME="com.example.multiscreen.uname";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openActivity2(View view)
    {
        Intent intent = new Intent(this,MainActivity2.class);
        name=findViewById(R.id.editTextText);
        String uname=name.getText().toString();
        intent.putExtra(Extra_NAME,uname);
        startActivity(intent);

    }
}