package com.example.android006.Ultils;

import android.content.Context;

import java.io.IOException;
import java.io.InputStream;

public class Until {
    public static String loadJSONFromAsset( Context context ){
        String str=null;
        try {
            InputStream is=context.getAssets().open("home.json");
            int size=is.available();
            byte[] buffer=new byte[size];
            is.read(buffer);
            is.close();
            str=new String(buffer,"UTF-8");
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return str;
    }
}
