package com.example.android006;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {
    public static final String TAG="Android006";
    RecyclerView mRecyclerView;
    ListView listView;
    DataNewsAddapter newsAddapter;
    ArrayList<DataNews> dataNews;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        innitView();

//        listView = (ListView)findViewById(R.id.list_view);
//        UserAccount tom = new UserAccount("Tom","admin");
//        UserAccount jerry = new UserAccount("Jerry","user");
//        UserAccount donald = new UserAccount("Donald","guest", false);
//        UserAccount[] users = new UserAccount[]{tom,jerry, donald};
//        ArrayAdapter<UserAccount> arrayAdapter
//                = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1 , users);
//
//        listView.setAdapter( arrayAdapter);

        String data=loadJSONFromAsset();
        Log.d(TAG,data);
        try {
            JSONObject jsonObject=new JSONObject(data);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public  void innitView(){
        RecyclerView recyclerView=findViewById( R.id.recycler_view );
        recyclerView.setHasFixedSize( true );
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this,
                LinearLayoutManager.HORIZONTAL,false );
        recyclerView.setLayoutManager( linearLayoutManager );
        recyclerView.setItemAnimator( new DefaultItemAnimator() );
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(recyclerView.getContext(),linearLayoutManager.getOrientation() );
        ArrayList<UserAccount> arrayList=new ArrayList<>(  );
        arrayList.add(new UserAccount("Tom","admin"));
        arrayList.add(new UserAccount("Jerry","user"));
        arrayList.add(new UserAccount("Mari","admin"));

        arrayList.add(new UserAccount("Samsung","Babu"));
        arrayList.add(new UserAccount("Iphone","mema"));
        arrayList.add(new UserAccount("Hueawai","LOlk"));
        arrayList.add(new UserAccount("Sony","user"));
        CustomAdapter customAdapter=new CustomAdapter( getApplicationContext(), arrayList );
        recyclerView.setAdapter(customAdapter);

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
