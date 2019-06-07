package com.example.demo5h;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentThree extends Fragment {


    public FragmentThree() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate( R.layout.fragment_three, container, false);
    }
    /*public class Main2Activity extends AppCompatActivity {

        @Override
        protected void onCreate( Bundle savedInstanceState ) {
            super.onCreate( savedInstanceState );
            setContentView( R.layout.activity_main2 );
            TextView textView = findViewById( R.id.text_city );
            Intent intent = getIntent();
            String city = intent.getStringExtra( "name" );
            Log.d( "keyVN", city );
            textView.setText( city );
        }
    }*/

}
