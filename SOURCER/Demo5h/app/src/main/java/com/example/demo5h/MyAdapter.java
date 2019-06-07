package com.example.demo5h;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {
private FragmentTwo fragmentTwo;
private FragmentOne fragmentOne;
private FragmentThree fragmentThree;
    private String list[]={"one","two","three","four"};
    MyAdapter( FragmentManager fragmentManager) {
        super(fragmentManager);
        fragmentTwo=new FragmentTwo();
        fragmentOne=new FragmentOne();
        fragmentThree=new FragmentThree();
    }
    @Override
    public Fragment getItem( int position) {
        /*Fragment frag=null;
        switch (position){
            case 0:
                frag = new FragmentOne();
                break;
            case 1:
                frag = new FragmentTwo();
                break;
            case 2:
                frag = new FragmentThree();
                break;
        }
        return frag;*/
        if(position==0)
            return fragmentOne;
        else if(position==1)
            return fragmentTwo;
            else if(position==2)
                    return fragmentThree;
            else { }
            return null;
    }

    @Override
    public int getCount() {
        //return list.length;
        return 3;
    }
    @Override
    public CharSequence getPageTitle(int position) {
//        String title = "";
//        switch (position){
//            case 0:
//                title = "One";
//                break;
//            case 1:
//                title = "Two";
//                break;
//            case 2:
//                title = "Three";
//                break;
//        }
//        return title;
        return list[position];
    }
}
