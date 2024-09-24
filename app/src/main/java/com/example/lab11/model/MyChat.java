package com.example.lab11.model;

public class MyChat {

    private int friend_id;
    private String friend_image;
    private String friend_name;
    private String food_nutrient;
    private int friend_tel;
    private String food_spicy;
    private String food_type;

    public int getFriend_tel() {
        return friend_tel;
    }
    public void setFriend_tel(int friend_tel) {
        this.friend_tel = friend_tel;
    }

    public String getFriend_image() {
        return friend_image;
    }
    public void setFriend_image(String friend_image) {
        this.friend_image = friend_image;
    }

    public String getFriend_name(){
        return friend_name;
    }
    public  void  setFriend_name(String friend_name){
        this.friend_name = friend_name;
    }
}
