package com.example.carrenting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    Button button;
    TextView status;
    TextView description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle extra =getIntent().getExtras();

        button= findViewById(R.id.backButton);
        textView = findViewById(R.id.carName);
        imageView = findViewById(R.id.carImage);
        status=findViewById(R.id.carStatus);
        description=findViewById(R.id.description);

        int x= Contans.contArr.get(Integer.parseInt(extra.get("position").toString())).image;
        imageView.setImageResource(x);

        textView.setText(extra.get("name").toString());
        status.setText(extra.get("status").toString());
        description.setText(extra.get("desc").toString());

        button.setOnClickListener((v -> finish()
        ));
    }

}