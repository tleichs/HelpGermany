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

public class MapsJobcenter extends FragmentActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_maps_jobcenter);
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


        LatLng JobcenterBerlinCharlottenburgWilmersdorf = new LatLng(52.526110, 13.314306);
        mMap.addMarker(new MarkerOptions().position(JobcenterBerlinCharlottenburgWilmersdorf).title("Jobcenter Berlin Charlottenburg-Wilmersdorf"));

        LatLng Sickingenstraße = new LatLng(52.532147, 13.324860);
        mMap.addMarker(new MarkerOptions().position(Sickingenstraße).title("Jobcenter Sickingenstraße"));

        LatLng Leopoldplatz = new LatLng(52.547539, 13.356577);
        mMap.addMarker(new MarkerOptions().position(Leopoldplatz).title("Jobcenter Leopoldplatz"));

        LatLng Wedding = new LatLng(52.543570, 13.364695);
        mMap.addMarker(new MarkerOptions().position(Wedding).title("Jobcenter Wedding"));

        LatLng Spittelmarkt = new LatLng(52.510634, 13.402277);
        mMap.addMarker(new MarkerOptions().position(Spittelmarkt).title("Jobcenter Spittelmarkt Hauptsitz"));

        LatLng JobcenterBerlinMarzahnHellersdorf = new LatLng(52.526500, 13.527367);
        mMap.addMarker(new MarkerOptions().position(JobcenterBerlinMarzahnHellersdorf).title("Jobcenter Marzahn-Hellersdorf"));

        LatLng JobcenterBerlinLichtenberg  = new LatLng(52.518275, 13.487987);
        mMap.addMarker(new MarkerOptions().position(JobcenterBerlinLichtenberg).title("Jobcenter Lichtenberg "));

        LatLng JobcenterBerlinTreptowKöpenick  = new LatLng(52.446099, 13.515495);
        mMap.addMarker(new MarkerOptions().position(JobcenterBerlinTreptowKöpenick).title("Jobcenter Treptow-Köpenick "));

        LatLng JobcenterBerlinTempelhofSchöneberg = new LatLng(52.454195, 13.378310);
        mMap.addMarker(new MarkerOptions().position(JobcenterBerlinTempelhofSchöneberg).title("Jobcenter Tempelhof-Schöneberg"));

        LatLng JobcenterSteglitzZehlendorf  = new LatLng(52.451556, 13.320905);
        mMap.addMarker(new MarkerOptions().position(JobcenterSteglitzZehlendorf).title("Jobcenter Steglitz-Zehlendorf"));

        LatLng JobcenterBerlinSpandau = new LatLng(52.532840, 13.185069);
        mMap.addMarker(new MarkerOptions().position(JobcenterBerlinSpandau).title("Jobcenter Spandau"));

        LatLng JobcenterReinickendorf = new LatLng(52.584908, 13.310379);
        mMap.addMarker(new MarkerOptions().position(JobcenterReinickendorf).title("Jobcenter Reinickendorf"));

        LatLng JobcenterPankow = new LatLng(52.534771, 13.454551);
        mMap.addMarker(new MarkerOptions().position(JobcenterPankow).title("JobcenterPankow"));

        LatLng JobcenterBerlinNeukölln = new LatLng(52.479043, 13.428070);
        mMap.addMarker(new MarkerOptions().position(JobcenterBerlinNeukölln).title("Jobcenter Berlin Neukölln"));

    }
}
