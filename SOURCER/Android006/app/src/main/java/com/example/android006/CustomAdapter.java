package com.example.android006;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter  extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    Context context;
    ArrayList<UserAccount> userAccounts;

    public CustomAdapter( Context context, ArrayList<UserAccount> userAccounts ) {
        this.context = context;
        this.userAccounts = userAccounts;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( @NonNull ViewGroup viewGroup, int i ) {
        LayoutInflater layoutInflater=LayoutInflater.from( viewGroup.getContext() );
        View itemView=layoutInflater.inflate( R.layout.item_row,viewGroup,false );
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder( @NonNull ViewHolder viewHolder, int i ) {

        Picasso.get().load( userAccounts.get( i ).getImgNews()).into( viewHolder.imgNews );
        viewHolder.txtNews.setText( userAccounts.get( i ).getTxtNews() );
    }
    @Override
    public int getItemCount() {
        return userAccounts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtNews;
        ImageView imgNews;
        public ViewHolder( @NonNull View itemView ) {
            super( itemView );
            txtNews=itemView.findViewById( R.id.text_news );
            imgNews=itemView.findViewById( R.id.img_news );
        }
    }

}
