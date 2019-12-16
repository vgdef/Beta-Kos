package com.example.projectf2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.projectf2.adapter.CardViewNusaniweAdapter;
import com.example.projectf2.model.Kos;
import com.example.projectf2.model.KosDataNusaniwe;

import java.util.ArrayList;

public class CardViewNusaniweActivity extends AppCompatActivity {
    private RecyclerView rvKos;
    private ArrayList<Kos> list = new ArrayList<>();
    private String showRecyclerList;
    private String title = "NUSANIWE";
    private Context context;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cardview_nusaniwe );

        setActionBarTitle( title );


        rvKos = findViewById( R.id.rv_kos );
        rvKos.setHasFixedSize( true );

        list.addAll( KosDataNusaniwe.getListData() );
        showRecyclerList();


    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle( title );
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled( true );

        }
    }

    private void showSelectedKos(Kos kos) {
        Toast.makeText( this, "Kamu memilih " + kos.getName(), Toast.LENGTH_SHORT ).show();
    }


    private void showRecyclerList() {
        rvKos.setLayoutManager( new LinearLayoutManager( this ) );
        final CardViewNusaniweAdapter cardViewKosAdapter = new CardViewNusaniweAdapter( list );
        rvKos.setAdapter( cardViewKosAdapter );

        cardViewKosAdapter.setOnItemClickCallback( new CardViewNusaniweAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kos data, int position) {
                Intent intent = new Intent( CardViewNusaniweActivity.this, DetailActivityPutri.class );
                startActivity( intent );
            }
        });
    }

}