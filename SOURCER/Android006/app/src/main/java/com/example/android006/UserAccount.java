package com.example.android006;

import java.io.Serializable;

public class UserAccount implements Serializable {
    private String imgNews,txtNews;
    private boolean active;
    public UserAccount( String imgNews, String txtNews ) {
        this.imgNews = imgNews;
        this.txtNews = txtNews;
    }
    public UserAccount( String imgNews, String txtNews, boolean active ) {
        this.imgNews = imgNews;
        this.txtNews = txtNews;
        this.active = active;
    }

    public String getImgNews() {
        return imgNews;
    }

    public void setImgNews( String imgNews ) {
        this.imgNews = imgNews;
    }

    public String getTxtNews() {
        return txtNews;
    }

    public void setTxtNews( String txtNews ) {
        this.txtNews = txtNews;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive( boolean active ) {
        this.active = active;
    }

}