package com.example.android006.Main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.android006.R;
import com.kofigyan.stateprogressbar.StateProgressBar;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    TextView tvPhoneNumber,tvName,tvEdit;
    ImageView imgAvatar;

    String[] descriptionData = {"Thành viên", "Bạc", "Vàng", "Bạch kim"};
    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_main);
        final StateProgressBar stateProgressBar = (StateProgressBar) findViewById(R.id.your_state_progress_bar_id);
        stateProgressBar.setStateDescriptionData(descriptionData);
        init();
        Picasso.get()
                .load("https://i.ytimg.com/vi/TXIVq_SXnUA/maxresdefault.jpg").into(imgAvatar);
    }


    void init(){
        tvPhoneNumber= findViewById(R.id.tv_phone_number);
        tvName=findViewById(R.id.tv_name);
        tvEdit=findViewById(R.id.tv_edit);
        imgAvatar=findViewById(R.id.img_avatar);
    }
}
