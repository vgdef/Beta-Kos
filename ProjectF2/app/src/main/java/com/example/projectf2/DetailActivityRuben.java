package com.example.projectf2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class DetailActivityRuben extends AppCompatActivity {
    private String title = "KOS RUBEN WATTIMENA";
    private Button btnSewa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.detail_kos );
        setActionBarTitle( title );


        Button btnpesan = findViewById( R.id.btnSewa );
        btnpesan.setOnClickListener( (View.OnClickListener) this );
}

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnSewa:
                Intent moveIntent = new Intent( DetailActivityRuben.this, BookingActivity.class );
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

