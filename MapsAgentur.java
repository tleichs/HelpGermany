package com.tiagoleichs.helpgermany;

import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.drawable.BitmapDrawable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsAgentur extends FragmentActivity implements OnMapReadyCallback {


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
        setContentView(R.layout.activity_maps_agentur);
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


        LatLng AgenturfurArbeitBerlinNord = new LatLng(52.515933, 13.280659);
        mMap.addMarker(new MarkerOptions().position(AgenturfurArbeitBerlinNord).title("Agentur für Arbeit Berlin Nord"));

        LatLng AgenturArbeitReinickendorf = new LatLng(52.578495, 13.308722);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitReinickendorf).title("Agentur für Arbeit Reinickendorf"));

        LatLng AgenturArbeitPankow = new LatLng(52.534765, 13.450384);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitPankow).title("Agentur für Arbeit Pankow"));

        LatLng AgenturArbeitSpandau = new LatLng(52.537895,13.286987);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitSpandau).title("Agentur für Arbeit Spandau"));

        LatLng AgenturArbeitBerlinMitte = new LatLng(52.505547, 13.391895);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitBerlinMitte).title("Agentur für Arbeit Berlin Mitte"));

        LatLng AgenturArbeitBeuthstraße = new LatLng(52.510049, 13.401854);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitBeuthstraße).title("Agentur für Arbeit Beuthstraße"));

        LatLng AgenturArbeitLichtenberg = new LatLng(52.537895,13.286987);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitLichtenberg).title("Agentur für Arbeit Lichtenberg"));

        LatLng AgenturArbeitMarzahnHellersdorf = new LatLng(52.538689, 13.606519);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitMarzahnHellersdorf).title("Agentur für Arbeit Marzahn-Hellersdorf"));

        LatLng AgenturArbeitBerlinSüd = new LatLng(52.469875, 13.464769);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitBerlinSüd).title("Agentur für Arbeit Berlin Süd"));

        LatLng AgenturArbeitSteglitzZehlendorf = new LatLng(52.450388, 13.316044);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitSteglitzZehlendorf).title("Agentur für Arbeit Steglitz-Zehlendorf"));

        LatLng AgenturArbeitTempelhofSchöneberg = new LatLng(52.452848, 13.378145);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitTempelhofSchöneberg).title("Agentur für Arbeit Tempelhof-Schöneberg"));

        LatLng AgenturArbeitTreptowKöpenick = new LatLng(52.537895,13.286987);
        mMap.addMarker(new MarkerOptions().position(AgenturArbeitTreptowKöpenick).title("Agentur für Arbeit Treptow-Köpenick"));


    }
}
