package com.example.carrenting;


import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import android.content.Context;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private final RecyclerViewInterface recyclerViewInterface;
 Context context ;

 public Adapter(ArrayList<Model> data,Context context, RecyclerViewInterface recyclerViewInterface){
     Contans.contArr=data;
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
      Model model = Contans.contArr.get(position);
      holder.description=model.description;
      holder.position=holder.getAdapterPosition();
      holder.name.setText(model.name);
      int x= Contans.contArr.get(position).image;
      holder.image.setImageResource(x);
      holder.status.setText(Contans.contArr.get(position).status);
    }

    @Override
    public int getItemCount() {
        return Contans.contArr.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  {
        int position;
        public TextView name;
        public ImageView image;
        public TextView status;
        public String description;

        public String getPos(){
            return "Pos: "+position;
        }

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            image = itemView.findViewById(R.id.image);
            status = itemView.findViewById(R.id.status);
            image.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, details.class);
                    intent.putExtra("position", position);
                    intent.putExtra("name", name.getText());
                    intent.putExtra("status", status.getText());
                    intent.putExtra("desc", description);
                    context.startActivity(intent);
                }
            });
        }
    }

}
