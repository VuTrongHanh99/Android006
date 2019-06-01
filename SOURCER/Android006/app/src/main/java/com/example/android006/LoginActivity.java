package com.example.android006;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText edtPhoneNumber;
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();


    }
    public void init(){
        edtPhoneNumber= findViewById( R.id.edt_number_phone );
        RelativeLayout rlLogin=findViewById( R.id.rl_login_button );
        ImageView imgFB=findViewById( R.id.img_fb_login );
        ImageView imgGG=findViewById( R.id.img_gg_login );

        rlLogin.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkValid()){
                    // chuyen man hinh
                    // tạo đối tượng intent
                    Intent intent=new Intent( LoginActivity.this,MainActivity.class );
                    User user=new User();
                    user.setId(1);
                    user.setPhoneNumber("+84123456789");
                    user.setUserName("Vu Trong Hanh01");
                    user.setProfileUrl("https://photos.google.com/photo/AF1QipOuiDm30QTjDXk98Q7DtrnHCNbedRm5z62Nv2HY");
                    startActivity(intent);
                    finish();
                }else {
                    // Thoong bao loi
                    Toast.makeText( LoginActivity.this,"Vui long kiem tra lai so dien thoai! Va thu lai", Toast.LENGTH_LONG ).show();
                }
            }
        } );
    }

    boolean checkValid(){
        int phoneLeng=edtPhoneNumber.getText().toString().length();
        return (phoneLeng>5);
    }
}
