package com.example.projectf2;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class BookingActivity extends AppCompatActivity implements View.OnClickListener {
    private String title = "BOOKING";

    private EditText editTextEmail;
    private EditText editTextPassword;
    private Context context;
    private AppCompatButton buttonLogin;
    private ProgressDialog pDialog;

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
                Intent moveIntent = new Intent( BookingActivity.this, PembayaranActivity.class );
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



