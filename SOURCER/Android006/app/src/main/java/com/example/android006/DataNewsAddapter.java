package com.example.android006;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static android.support.v7.widget.RecyclerView.*;

public class DataNewsAddapter extends BaseAdapter{
    Context context;
    ArrayList<DataNews> arrayList;

    public DataNewsAddapter( Context context, ArrayList<DataNews> arrayList ) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem( int position ) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId( int position ) {
        return 0;
    }

    @Override
    public View getView( int position, View convertView, ViewGroup parent ) {
        ViewHolder viewHolder;
        DataNews dataNews=arrayList.get(position);
        if(convertView==null){
            LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=layoutInflater.inflate(R.layout.dong_tin_moi,null);
            viewHolder=new ViewHolder();
            viewHolder.txtTitle=(TextView) convertView.findViewById(R.id.text_title_news);
            viewHolder.imgNews=(ImageView) convertView.findViewById(R.id.img_news);
        }
        else {
            viewHolder= (ViewHolder) convertView.getTag();
        }
        viewHolder.txtTitle.setText(dataNews.getTitle());
        //load anhr ve icon
        Picasso.get().load(dataNews.getUrlImg()).into(viewHolder.imgNews);
        //Picasso.with(context).load("http://openweathermap.org/img/w/"+thoiTietNgay.image+".png").into(viewHolder.imageStatus);
        return convertView;

    }
    //Toi uu +khong can khoi tao lai view;
    public class ViewHolder{
        TextView txtTitle;
        ImageView imgNews;
    }
}
