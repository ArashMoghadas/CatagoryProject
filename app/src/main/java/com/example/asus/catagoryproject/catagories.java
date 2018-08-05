package com.example.asus.catagoryproject;

public class catagories {
    private int image ;
    private String name;
    private int image_visible ;

    public catagories(int image, String name, int image_visible) {
        this.image = image;
        this.name = name;
        this.image_visible = image_visible;
    }

    public catagories(String name, int image_visible) {
        this.name = name;
        this.image_visible = image_visible;
    }

    public int getImage_visible() {
        return image_visible;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage_visible(int image_visible) {
        this.image_visible = image_visible;
    }
}
