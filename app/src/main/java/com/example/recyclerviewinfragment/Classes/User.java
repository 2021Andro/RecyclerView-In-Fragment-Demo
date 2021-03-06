package com.example.recyclerviewinfragment.Classes;

public class User {

    private String name, image;

    public User() {
    }

    public User(String name, String image) {
        this.name = name;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
