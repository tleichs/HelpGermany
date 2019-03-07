package com.tiagoleichs.helpgermany;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


/**
 * A simple {@link Fragment} subclass.
 */
public class mapas extends Fragment {

    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;



    public mapas() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_mapas,container,false);
    return rootView;


    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);


            AdView mAdView = (AdView) getView().findViewById(R.id.adView);
            AdRequest adRequest = new AdRequest.Builder().build();
            mAdView.loadAd(adRequest);



        btn1 = (Button) getActivity().findViewById(R.id.btnanmeldungmap);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MapsAnmeldung.class);
                startActivity(i);

            }
        });
        btn2 = (Button) getActivity().findViewById(R.id.btnagenturmap);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MapsAgentur.class);
                startActivity(i);

            }
        });

        btn3 = (Button) getActivity().findViewById(R.id.btnjobcentermap);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MapsJobcenter.class);
                startActivity(i);

            }
        });

        btn4 = (Button) getActivity().findViewById(R.id.btngewerbemap);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MapsGewerbeschein.class);
                startActivity(i);

            }
        });

        btn5 = (Button) getActivity().findViewById(R.id.btnhospitalmap);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MapsKrankenhaus.class);
                startActivity(i);

            }
        });

        btn6 = (Button) getActivity().findViewById(R.id.btnarztmap);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MapsSaude.class);
                startActivity(i);

            }
        });

        btn7 = (Button) getActivity().findViewById(R.id.btnfinanzmap);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), MapsFinanzamt.class);
                startActivity(i);

            }
        });


    }
}
