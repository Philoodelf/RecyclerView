package com.example.carrenting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
       TextView textView;
       ImageView imageView;



        Button button;
 button= findViewById(R.id.button);
 textView = findViewById(R.id.textView44);
 imageView = findViewById(R.id.photo);
 button.setOnClickListener((new View.OnClickListener() {
     @Override
     public void onClick(View v) {
         finish();
     }
 }));
    }

}