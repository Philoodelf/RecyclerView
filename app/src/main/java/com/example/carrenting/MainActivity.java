package com.example.carrenting;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface{
        ImageView merc;
    Adapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println(R.drawable.backgound);

        recyclerView = findViewById(R.id.recycler1);
        adapter = new Adapter(getinfo(),this , this);
        recyclerView.setAdapter(adapter);

    }
    private ArrayList<Model> getinfo(){
        ArrayList<Model> content = new ArrayList<>();

        content.add(new Model(getString(R.string.merc), R.drawable.mercedes, getString(R.string.available),"This is Mercedes This is Mercedes This is Mercedes This is Mercedes This is Mercedes"));
        content.add(new Model(getString(R.string.kia), R.drawable.kia,getString(R.string.available),"This is KIA"));
        content.add(new Model(getString(R.string.verna), R.drawable.verna, getString(R.string.out),"This is Verna"));
        content.add(new Model(getString(R.string.logan), R.drawable.logan,getString(R.string.available),"This is Logan"));
        content.add(new Model(getString(R.string.pegu), R.drawable.peugeot,getString(R.string.available),"This is Peugeot"));
        content.add(new Model(getString(R.string.tesla), R.drawable.tesla,getString(R.string.soon),"This is Tesla"));
        return content;
    }


    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, details.class);
        intent.putExtra("merc", getinfo().get(position).image);
        intent.putExtra("name", getinfo().get(position).name);
        startActivity(intent);
    }
}