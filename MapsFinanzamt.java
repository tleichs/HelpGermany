package com.tiagoleichs.helpgermany;

import android.*;
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

public class MapsFinanzamt extends FragmentActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_maps_finanzamt);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        LatLng berlin = new LatLng(52.518356,13.375449);
        mMap.addMarker(new MarkerOptions().position(berlin).title("Berlin"));
        float zoomLevel = 10.0f;
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(berlin,zoomLevel));

        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            ActivityCompat.requestPermissions(this,new String[]{android.Manifest.permission.ACCESS_FINE_LOCATION},
                    MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }


        LatLng Charlottenburg = new LatLng(52.511730, 13.303686);
        mMap.addMarker(new MarkerOptions().position(Charlottenburg).title("Charlottenburg"));

        LatLng FriedrichshainKreuzberg = new LatLng(52.494691, 13.388381);
        mMap.addMarker(new MarkerOptions().position(FriedrichshainKreuzberg).title("Friedrichshain-Kreuzberg"));

        LatLng Lichtenberg = new LatLng(52.522934, 13.491265);
        mMap.addMarker(new MarkerOptions().position(Lichtenberg).title("Lichtenberg"));

        LatLng MarzahnHellersdorf = new LatLng(52.526525, 13.527340);
        mMap.addMarker(new MarkerOptions().position(MarzahnHellersdorf).title("Marzahn-Hellersdorf"));

        LatLng MitteTiergarten = new LatLng(52.510993, 13.412328);
        mMap.addMarker(new MarkerOptions().position(MitteTiergarten).title("Mitte/Tiergarten"));

        LatLng Neukölln = new LatLng(52.478841, 13.452582);
        mMap.addMarker(new MarkerOptions().position(Neukölln).title("Neukölln"));

        LatLng PankowWeißensee = new LatLng(52.532595, 13.452366);
        mMap.addMarker(new MarkerOptions().position(PankowWeißensee).title("Pankow/Weißensee/Prenzlauer Berg"));

        LatLng Reinickendorf = new LatLng(52.587294, 13.325092);
        mMap.addMarker(new MarkerOptions().position(Reinickendorf).title("Reinickendorf"));

        LatLng Schöneberg = new LatLng(552.498161, 13.361785);
        mMap.addMarker(new MarkerOptions().position(Schöneberg).title("Schöneberg"));

        LatLng Spandau = new LatLng(52.538741, 13.238265);
        mMap.addMarker(new MarkerOptions().position(Spandau).title("Spandau"));

        LatLng Steglitz = new LatLng(52.452990, 13.313187);
        mMap.addMarker(new MarkerOptions().position(Steglitz).title("Steglitz"));

        LatLng Tempelhof = new LatLng(52.454420, 13.383747);
        mMap.addMarker(new MarkerOptions().position(Tempelhof).title("Tempelhof"));

        LatLng TreptowKöpenick = new LatLng(52.455622, 13.587986);
        mMap.addMarker(new MarkerOptions().position(TreptowKöpenick).title("Treptow-Köpenick"));

        LatLng Wedding = new LatLng(52.557081, 13.374314);
        mMap.addMarker(new MarkerOptions().position(Wedding).title("Wedding"));

        LatLng  Wilmersdorf = new LatLng(52.497911, 13.303978);
        mMap.addMarker(new MarkerOptions().position(Wilmersdorf).title("Wilmersdorf"));




    }
}

