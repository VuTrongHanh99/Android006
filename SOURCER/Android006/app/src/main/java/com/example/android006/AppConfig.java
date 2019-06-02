package com.example.android006;

import android.content.Context;
import android.content.SharedPreferences;

public class AppConfig {
    public  static final String PREF_NAME="Android006";
    public static  void setPhoneNumber(String phoneNumber,Context context){
        //Gọi hàm getSharedPreferences
        SharedPreferences sharedPreferences=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        //Tạo đổi tượng Editor để cho phép chỉnh sửa dữ liệu:
        SharedPreferences.Editor editor=sharedPreferences.edit();
        //Đưa dữ liệu muốn lưu trữ vào edit
        editor.putString("phone_number",phoneNumber);
        //Lưu trạng thái bằng cách gọi dòng lệnh
        editor.apply();
    }
    public static String getPhoneNumber(Context context){
        SharedPreferences sharedPreferences=context.getSharedPreferences(PREF_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getString("phone_number",null);
    }

}

