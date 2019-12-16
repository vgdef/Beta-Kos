package com.example.projectf2.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.projectf2.CardViewBagualaActivity;
import com.example.projectf2.CardViewLeitimurActivity;
import com.example.projectf2.CardViewNusaniweActivity;
import com.example.projectf2.CardViewSirimauActivity;
import com.example.projectf2.CardViewTelukAmbonActivity;
import com.example.projectf2.R;


public class HomeFragment extends Fragment {
    private Button btnNusaniwe;
    private Button btnSirimau;
    private Button btnBaguala;
    private Button btnTelukambon;
    private Button btnLeitimur;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate( R.layout.fragment_home, container, false);
        Button btnNusaniwe =(Button) view.findViewById(R.id.btnNusaniwe);
        btnNusaniwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), CardViewNusaniweActivity.class);
                startActivity( intent );

            }
            });

                Button btnSirimau =(Button) view.findViewById(R.id.btnSirimau);
                btnSirimau.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.setClass(getActivity(), CardViewSirimauActivity.class);
                        startActivity( intent );;

                    }
                });

        Button btnBaguala =(Button) view.findViewById(R.id.btnBaguala);
        btnBaguala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), CardViewBagualaActivity.class);
                startActivity( intent );

            }
        });

        Button btnTelukambon =(Button) view.findViewById(R.id.btnTelukambon);
        btnTelukambon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), CardViewTelukAmbonActivity.class);
                startActivity( intent );

            }
        });

        Button btnLeitimur =(Button) view.findViewById(R.id.btnLeitimur);
        btnLeitimur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(getActivity(), CardViewLeitimurActivity.class);
                startActivity( intent );
            }
        });

        return view;
    }

}
