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
    RecyclerView recyclerView;
    ArrayList<UserAccount> arrayList;

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        init();
        arrayList=new ArrayList<>(  );
        arrayList.add(new UserAccount(
                "https://data2.m4v.me/files/upload/10000790761470235132.jpg"
                ,"admin"));
        arrayList.add(new UserAccount(
                "https://kenh14cdn.com/thumb_w/660/2017/223238498189853349474221480315508o-1507458888625.jpg"
                ,"chocho"));
        arrayList.add(new UserAccount(
                "https://lh3.googleusercontent.com/wG23NCXZM3tujVRUpghwKn1gvXAj6hRQVCcEz-2wGuW3Tys20xpaGV_ME3DkPgurmNQZ5RP-EB2n_nEeeuRyjntaMNNMGKbIBIBHANqXUIlEEApUy_mHaOtuBUy_taVueSGDJTNptZYZfFH5VKnHjKa03mnA8V42p8i2e_tV5U5t3pmfyPMlgTNY4mrYD9naSvBm_qAnSpLk6fy517YPazel4X-SLDYyenan0BzBU2mks7cgjVzRefX5XLPR4CDFHasvfeNIa2ALbHshs2_RRNiAaAUG_KC5WYbfOYp3rCc7qVhZcsCgnl5h0g-oW-deD7IskbEoXJXurJXaBX-F3a0vf_9zJrzpDFS7GTqLP0tRzXs_71vCWreZpilH22l3EBah6e6hQMsJJgEVJjQfvKZydsjE031hJla9FSJxHdqf_sp4tvmkJACMgr1vOIk3xNe0gKDtzNlK5W8EICiCvsRUQ0nZ-XmOayOJW_HmebhwGcYxioL_pyg0g_TngmomByI5zjM1pzkqXqsV7IuJwEHh2xMaYQeRLlSvWidEjQhqLnoZcz5DpxSchLv9bKd1qIFqmjYyHx1Sk9rzhq-jg43jz-m9FW7xWkb8YYpi55yRmcQYwIzBJ7zKN2TGdP2RAsKryUjJPMugUMfjrE70OzRucx6kN60=w509-h903-no"
                ,"zalo"));
        CustomAdapter customAdapter=new CustomAdapter( getApplicationContext(), arrayList );
        recyclerView.setAdapter(customAdapter);

        //innitView();
        /*listView = (ListView)findViewById(R.id.list_view);
        UserAccount tom = new UserAccount("Tom","admin");
        UserAccount jerry = new UserAccount("Jerry","user");
        UserAccount donald = new UserAccount("Donald","guest", false);
        UserAccount[] users = new UserAccount[]{tom,jerry, donald};
        ArrayAdapter<UserAccount> arrayAdapter = new ArrayAdapter<UserAccount>(this, android.R.layout.simple_list_item_1 , users);
        listView.setAdapter( arrayAdapter);*/

        String data=loadJSONFromAsset();
        Log.d(TAG,data);
        try {
            JSONObject jsonObject=new JSONObject(data);
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    public  void init(){
        recyclerView=findViewById( R.id.recycler_view );
        recyclerView.setHasFixedSize( true );
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this,
                LinearLayoutManager.HORIZONTAL,false );
        recyclerView.setLayoutManager( linearLayoutManager );
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
    public  void innitView(){
        recyclerView=findViewById( R.id.recycler_view );
        recyclerView.setHasFixedSize( true );
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager( this,
                LinearLayoutManager.HORIZONTAL,false );
        recyclerView.setLayoutManager( linearLayoutManager );
        //recyclerView.setItemAnimator( new DefaultItemAnimator() );
        //DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(recyclerView.getContext(),linearLayoutManager.getOrientation() );
        arrayList=new ArrayList<>(  );
        arrayList.add(new UserAccount(
                "https://data2.m4v.me/files/upload/10000790761470235132.jpg"
                ,"admin"));
        arrayList.add(new UserAccount(
                "https://kenh14cdn.com/thumb_w/660/2017/223238498189853349474221480315508o-1507458888625.jpg"
                ,"chocho"));
        arrayList.add(new UserAccount(
                "https://lh3.googleusercontent.com/wG23NCXZM3tujVRUpghwKn1gvXAj6hRQVCcEz-2wGuW3Tys20xpaGV_ME3DkPgurmNQZ5RP-EB2n_nEeeuRyjntaMNNMGKbIBIBHANqXUIlEEApUy_mHaOtuBUy_taVueSGDJTNptZYZfFH5VKnHjKa03mnA8V42p8i2e_tV5U5t3pmfyPMlgTNY4mrYD9naSvBm_qAnSpLk6fy517YPazel4X-SLDYyenan0BzBU2mks7cgjVzRefX5XLPR4CDFHasvfeNIa2ALbHshs2_RRNiAaAUG_KC5WYbfOYp3rCc7qVhZcsCgnl5h0g-oW-deD7IskbEoXJXurJXaBX-F3a0vf_9zJrzpDFS7GTqLP0tRzXs_71vCWreZpilH22l3EBah6e6hQMsJJgEVJjQfvKZydsjE031hJla9FSJxHdqf_sp4tvmkJACMgr1vOIk3xNe0gKDtzNlK5W8EICiCvsRUQ0nZ-XmOayOJW_HmebhwGcYxioL_pyg0g_TngmomByI5zjM1pzkqXqsV7IuJwEHh2xMaYQeRLlSvWidEjQhqLnoZcz5DpxSchLv9bKd1qIFqmjYyHx1Sk9rzhq-jg43jz-m9FW7xWkb8YYpi55yRmcQYwIzBJ7zKN2TGdP2RAsKryUjJPMugUMfjrE70OzRucx6kN60=w509-h903-no"
                ,"zalo"));
        CustomAdapter customAdapter=new CustomAdapter( getApplicationContext(), arrayList );
        recyclerView.setAdapter(customAdapter);
    }
}
