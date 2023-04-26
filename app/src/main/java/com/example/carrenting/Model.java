package com.example.carrenting;

import android.graphics.drawable.Drawable;

public class Model {
    public String getName() {
        return name;
    }

    public Model(String name, int image,String status) {
        this.name = name;
        this.image = image;
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private String name;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    private String status;
    int image;


}
