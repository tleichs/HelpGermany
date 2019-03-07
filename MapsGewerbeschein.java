package com.tiagoleichs.helpgermany;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsGewerbeschein extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    public static final int MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION = 1;


    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[],int[] grantResults) {

        switch (requestCode) {

            case MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {

                    // permission was granted, yay! Do the
                    // contacts-related task you need to do.

                } else {

                    // permission denied, boo! Disable the
                    // functionality that depends on this permission.
                }
                return;
            }
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_gewerbeschein);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng berlin = new LatLng(52.518356,13.375449);
        mMap.addMarker(new MarkerOptions().position(berlin).title("Berlin"));
        float zoomLevel = 10.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(berlin,zoomLevel));

        if (ContextCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }


        LatLng Hohenzollerndamm  = new LatLng(52.489173, 13.311478);
        mMap.addMarker(new MarkerOptions().position(Hohenzollerndamm).title("Hohenzollerndamm 174-177, 10713 Berlin"));

        LatLng Petersburger = new LatLng(52.518180, 13.452569);
        mMap.addMarker(new MarkerOptions().position(Petersburger).title("Petersburger Straße 86 - 90, 10247 Berlin"));

        LatLng GroßeLeege = new LatLng(52.545295, 13.500140);
        mMap.addMarker(new MarkerOptions().position(GroßeLeege).title("Große-Leege-Str. 103, 13055 Berlin"));

        LatLng Premnitzer = new LatLng(52.557113, 13.551944);
        mMap.addMarker(new MarkerOptions().position(Premnitzer).title("Premnitzer Straße 11, 12681 Berlin"));

        LatLng KarlMarxAllee = new LatLng(52.521093, 13.423381);
        mMap.addMarker(new MarkerOptions().position(KarlMarxAllee).title("Karl-Marx-Allee 31, 10178 Berlin"));

        LatLng Juliusstraße = new LatLng(52.464077, 13.442236);
        mMap.addMarker(new MarkerOptions().position(Juliusstraße).title("Juliusstraße 67, 12051 Berlin"));

        LatLng Fröbelstraße  = new LatLng(52.541783, 13.427700);
        mMap.addMarker(new MarkerOptions().position(Fröbelstraße).title("Fröbelstraße 17, 10405 Berlin"));

        LatLng Lübener  = new LatLng(52.571372, 13.342263);
        mMap.addMarker(new MarkerOptions().position(Lübener).title("Lübener Weg 26 13407 Berlin"));

        LatLng Galenstraße = new LatLng(52.536973, 13.196554);
        mMap.addMarker(new MarkerOptions().position(Galenstraße).title("Galenstraße 14, 13597 Berlin"));

        LatLng UnterdenEichen = new LatLng(52.452776, 13.312278);
        mMap.addMarker(new MarkerOptions().position(UnterdenEichen).title("Unter den Eichen 1, 12203 Berlin"));


        LatLng Tempelhofer = new LatLng(52.462461, 13.385770);
        mMap.addMarker(new MarkerOptions().position(Tempelhofer).title("Tempelhofer Damm 165, 12099 Berlin"));

        LatLng Salvador = new LatLng(52.449056, 13.594254);
        mMap.addMarker(new MarkerOptions().position(Salvador).title("Salvador-Allende-Str. 80 A, 12559 Berlin"));

    }
}
