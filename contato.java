package com.tiagoleichs.helpgermany;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.firebase.analytics.FirebaseAnalytics;

public class contato extends AppCompatActivity {

    private FirebaseAnalytics mFirebaseAnalytics;

    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        // Sample AdMob app ID: ca-app-pub-3940256099942544~3347511713
        MobileAds.initialize(this, "ca-app-pub-9189166219398284~5978883942");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }

    public void mSite (View view) {
        Intent browserintent = new Intent (Intent.ACTION_VIEW, Uri.parse("https://tiagoleichs.wordpress.com/"));
        startActivity(browserintent);
    }

}
