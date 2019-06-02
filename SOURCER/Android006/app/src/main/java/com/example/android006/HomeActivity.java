package com.example.android006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;

public class HomeActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    ListView listView;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//
//        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
//        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
//        recyclerView.setLayoutManager(layoutManager);
        listView = (ListView)findViewById(R.id.listview);
        UserAccount tom = new UserAccount("Tom","admin");
        UserAccount jerry = new UserAccount("Jerry","user");
        UserAccount donald = new UserAccount("Donald","guest", false);

        UserAccount[] users = new UserAccount[]{tom,jerry, donald};
        ArrayAdapter<UserAccount> arrayAdapter
                = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1 , users);


        listView.setAdapter(arrayAdapter);



        String data=loadJSONFromAsset();
        Log.d("key",data);
        try {
            JSONObject jsonObject=new JSONObject(data);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public String loadJSONFromAsset(){
        String str=null;
        try {
            InputStream is=getAssets().open("home.json");
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
