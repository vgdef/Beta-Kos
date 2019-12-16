package com.example.projectf2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PembayaranActivity extends AppCompatActivity implements View.OnClickListener {
    private String title = "BOOKING";

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_booking );
        setActionBarTitle( title );
        Button btnpesan = findViewById( R.id.btnpesan );
        btnpesan.setOnClickListener( this );
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnpesan:
                Intent moveIntent = new Intent( PembayaranActivity.this, PembayaranActivity.class );
                startActivity( moveIntent );
        }
    }


    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle( title );
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled( true );
        }
    }
}


