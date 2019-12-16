package com.example.projectf2.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.projectf2.R;
import com.example.projectf2.model.Kos;

import java.util.ArrayList;

public class CardViewLeitimurAdapter extends RecyclerView.Adapter<CardViewLeitimurAdapter.CardViewViewHolder> {

    private AdapterView.OnItemClickListener DataListener;
    private ArrayList<Kos> listKos;
    public CardViewLeitimurAdapter(ArrayList<Kos> list){
        this.listKos = list;
    }
    private  OnItemClickCallback onItemClickCallback;
    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate( R.layout.cardview, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, final int position) {
        Kos kos = listKos.get( position );
        Glide.with(holder.itemView.getContext())
                .load( kos.getPhotooooo() )
                .apply( new RequestOptions().override( 55,55 ) )
                .into(holder.imgPhoto);
        holder.tvName.setText(kos.getNameeeee());
        holder.tvDetail.setText(kos.getDetailsssss());
        holder.itemView.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listKos.get( holder.getAdapterPosition() ), position );
            }
        } );
    }

    @Override
    public int getItemCount() {
        return listKos.size();
    }

    public  interface OnItemClickCallback{
        void onItemClicked(Kos data, int position);
    }


    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;
        CardViewViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.tv_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}