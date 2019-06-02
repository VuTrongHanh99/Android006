package com.example.android006;

public class DataNews {
    public String title,urlImg;

    public DataNews( String title, String urlImg ) {
        this.title = title;
        this.urlImg = urlImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle( String title ) {
        this.title = title;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg( String urlImg ) {
        this.urlImg = urlImg;
    }
}
