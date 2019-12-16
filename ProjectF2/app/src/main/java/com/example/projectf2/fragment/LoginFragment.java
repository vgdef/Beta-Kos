package com.example.projectf2.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.projectf2.R;
import com.example.projectf2.RegistrasiActivity;

import static android.widget.Toast.makeText;


public class LoginFragment extends Fragment {
    private Button btnlogin2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_login, container, false);

        Button btnlogin2 =(Button) view.findViewById(R.id.btnlogin2);
            btnlogin2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    HomeFragment homeFragment = new HomeFragment();
                    FragmentManager manager = getFragmentManager();
                    FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fl_container, new HomeFragment());
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                }

            });

            final TextView textregis = view.findViewById(R.id.textregis);
            SpannableString ss = new SpannableString("Belum Punya Akun di Beta Kos? DAFTAR");
            ClickableSpan clickableSpan = new ClickableSpan() {
                @Override
                public void onClick(@NonNull View widget) {
                    makeText(LoginFragment.this, "Clickable textregis", Toast.LENGTH_LONG);
                }

                private void makeText(LoginFragment loginFragment, String clickable_textregis, int lengthLong) {
                    Intent intent = new Intent();
                    intent.setClass(getActivity(), RegistrasiActivity.class);
                    startActivity( intent );
                }

            };

        ss.setSpan(clickableSpan, 30, 36, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textregis.setText(ss);
        textregis.setMovementMethod(LinkMovementMethod.getInstance());

        return view;

    }
}

