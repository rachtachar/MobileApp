package com.example.lab11.model;

public class MyChat {

    private int friend_id;
    private String friend_image;
    private String friend_name;
    private String friend_dob;
    private String friend_tel;

    public String getFriend_tel() {
        return friend_tel;
    }
    public void setFriend_tel(String friend_tel) {
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
    public String getFriend_dob() {
        return friend_dob;
    }
    public void setFriend_dob(String friend_dob) {
        this.friend_dob = friend_dob;
    }
}
