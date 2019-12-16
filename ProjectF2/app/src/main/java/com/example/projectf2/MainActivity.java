package com.example.projectf2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.projectf2.fragment.HomeFragment;
import com.example.projectf2.fragment.LoginFragment;
import com.example.projectf2.fragment.NotifFragment;


public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        loadFragment( new HomeFragment() );

        BottomNavigationView bottomNavigationView = findViewById( R.id.bn_main );

        bottomNavigationView.setOnNavigationItemSelectedListener( this );

    }

    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace( R.id.fl_container, fragment )
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.home_menu:
                fragment = new HomeFragment();
                break;
            case R.id.login_menu:
                fragment = new LoginFragment();
                break;
            case R.id.notif_menu:
                fragment = new NotifFragment();
                break;
        }
        return loadFragment( fragment );
    }

}