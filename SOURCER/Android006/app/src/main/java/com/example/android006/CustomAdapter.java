package com.example.android006;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        viewHolder.txtName.setText( userAccounts.get( i ).getUserName() );
        viewHolder.txtType.setText( userAccounts.get( i ).getUserType() );
    }

    @Override
    public int getItemCount() {
        return userAccounts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtName,txtType;
        public ViewHolder( @NonNull View itemView ) {
            super( itemView );
            txtName=itemView.findViewById( R.id.txtName );
            txtType=itemView.findViewById( R.id.txtType );
        }
    }

}
