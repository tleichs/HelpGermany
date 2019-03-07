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
public class SitesE extends Fragment {
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;




    public SitesE() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sites_e,container,false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        AdView mAdView = (AdView) getView().findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        btn1 = (Button) getActivity().findViewById(R.id.btnanmeldung);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://service.berlin.de/dienstleistung/120686/"));
                getActivity().startActivity(i);

            }
        });
        btn2 = (Button) getActivity().findViewById(R.id.btnagentur);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.arbeitsagentur.de/"));
                getActivity().startActivity(i);

            }
        });
        btn3 = (Button) getActivity().findViewById(R.id.btnjobcenter);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://service.berlin.de/jobcenter/"));
                getActivity().startActivity(i);

            }
        });
        btn4 = (Button) getActivity().findViewById(R.id.btngewerbe);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://service.berlin.de/dienstleistung/121921/"));
                getActivity().startActivity(i);

            }
        });
        btn5 = (Button) getActivity().findViewById(R.id.btnburger);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://service.berlin.de/standorte/buergeraemter/"));
                getActivity().startActivity(i);

            }
        });
        btn6 = (Button) getActivity().findViewById(R.id.btnfinanz);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.berlin.de/sen/finanzen/steuern/finanzaemter/"));
                getActivity().startActivity(i);

            }
        });



    }
}
