package com.example.android006.Model;

import java.io.Serializable;

public class User implements Serializable {
    int id;
    String userName, phoneNumber, profileUrl;

    public User(){

    }
    public User( int id, String userName, String phoneNumber, String profileUrl ) {
        this.id = id;
        this.userName = userName;
        this.phoneNumber = phoneNumber;
        this.profileUrl = profileUrl;
    }

    public int getId() {
        return id;
    }

    public void setId( int id ) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName( String userName ) {
        this.userName = userName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber( String phoneNumber ) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl( String profileUrl ) {
        this.profileUrl = profileUrl;
    }
}
