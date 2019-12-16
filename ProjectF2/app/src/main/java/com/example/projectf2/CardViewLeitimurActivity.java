package com.example.projectf2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.projectf2.adapter.CardViewBagualaAdapter;
import com.example.projectf2.adapter.CardViewLeitimurAdapter;
import com.example.projectf2.model.Kos;
import com.example.projectf2.model.KosDataBaguala;
import com.example.projectf2.model.KosDataLeitimur;
import com.example.projectf2.model.KosDataNusaniwe;

import java.util.ArrayList;

public class CardViewLeitimurActivity extends AppCompatActivity {
    private RecyclerView rvKos;
    private ArrayList<Kos> list = new ArrayList<>();
    private String showRecyclerList;
    private String title = "LEITIMUR";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cardview_leitimur);

        setActionBarTitle( title );


        rvKos = findViewById( R.id.rv_kos );
        rvKos.setHasFixedSize( true );

        list.addAll( KosDataBaguala.getListData() );
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
        final CardViewBagualaAdapter cardViewBagualaAdapter = new CardViewBagualaAdapter( list );
        rvKos.setAdapter(cardViewBagualaAdapter);

       cardViewBagualaAdapter.setOnItemClickCallback( new CardViewBagualaAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kos data, int position) {
                Intent intent = new Intent(CardViewLeitimurActivity.this, DetailActivityPutri.class );
                startActivity( intent );
                showSelectedKos( data );
            }
        } );
    }

}
