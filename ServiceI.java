package com.tiagoleichs.helpgermany;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ServiceI extends Fragment {

    TextView btn1;
    TextView btn2;
    TextView btn3;
    TextView btn4;
    TextView btn5;

    public ServiceI() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_service_i,container,false);
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        AdView mAdView = (AdView) getView().findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        btn1 = (TextView) getActivity().findViewById(R.id.textView9);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.messenger.com/t/tleichs"));
                getActivity().startActivity(i);

            }
        });
        btn2 = (TextView) getActivity().findViewById(R.id.textView91);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("https://www.messenger.com/t/1464978181"));
                getActivity().startActivity(i);

            }
        });

        btn3 = (TextView) getActivity().findViewById(R.id.textView11);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","tiagoleichs@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Help!Germany");
                startActivity(Intent.createChooser(emailIntent, "Send email..."));
                getActivity().startActivity(emailIntent);

            }
        });

        btn4 = (TextView) getActivity().findViewById(R.id.textView912);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto","giancarlo.canuti@gmail.com", null));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Help!Germany");
                startActivity(Intent.createChooser(emailIntent, "Inviare l'email..."));
                getActivity().startActivity(emailIntent);

            }
        });
        btn5 = (TextView) getActivity().findViewById(R.id.textView1112);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:+491638848002"));
                getActivity().startActivity(callIntent);



            }
        });
    }
}
