package com.example.projectf2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.projectf2.adapter.CardViewTelukAmbonAdapter;
import com.example.projectf2.model.Kos;
import com.example.projectf2.model.KosDataBaguala;
import com.example.projectf2.model.KosDataNusaniwe;
import com.example.projectf2.model.KosDataTelukAmbon;

import java.util.ArrayList;

public class CardViewBagualaActivity extends AppCompatActivity {
    private RecyclerView rvKos;
    private ArrayList<Kos> list = new ArrayList<>();
    private String showRecyclerList;
    private String title = "BAGUALA";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_cardview_baguala);

        setActionBarTitle( title );


        rvKos = findViewById( R.id.rv_kos );
        rvKos.setHasFixedSize( true );

        list.addAll( KosDataTelukAmbon.getListData() );
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
        final CardViewTelukAmbonAdapter cardViewTelukAmbonAdapter = new CardViewTelukAmbonAdapter( list );
        rvKos.setAdapter( cardViewTelukAmbonAdapter);

        cardViewTelukAmbonAdapter.setOnItemClickCallback( new CardViewTelukAmbonAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Kos data, int position) {
                Intent intent = new Intent(CardViewBagualaActivity.this, DetailActivityPutri.class );
                startActivity( intent );
                showSelectedKos( data );
            }
        } );
    }

}
