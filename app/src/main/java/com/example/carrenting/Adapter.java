package com.example.carrenting;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import android.content.Intent;
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private final RecyclerViewInterface recyclerViewInterface;
 private ArrayList<Model> data;
 Context context ;

 public Adapter(ArrayList<Model> data,Context context, RecyclerViewInterface recyclerViewInterface){
     this.data=data;
     this.context=context;
     this.recyclerViewInterface=recyclerViewInterface;
 }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.customs1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      Model model = data.get(position);
      holder.name.setText(model.getName());
      int x= data.get(position).image;
      holder.image.setImageResource(x);
      holder.status.setText(data.get(position).getStatus());
//      holder.itemView.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//
//          }
//      });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView name;
        public ImageView image;
        public TextView status;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.image);
            status = itemView.findViewById(R.id.choose);
            image.setOnClickListener(this);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });


        }

        @Override
        public void onClick(View vi) {
            Intent intent = new Intent(context, details.class);
            intent.putExtra("image", image.getDrawable().toString());
            context.startActivity(intent);

        }



    }

}
