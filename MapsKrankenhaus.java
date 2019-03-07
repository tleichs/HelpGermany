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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsKrankenhaus extends FragmentActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_maps_krankenhaus);
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

        LatLng Victoria = new LatLng(52.462498, 13.345061);
        mMap.addMarker(new MarkerOptions().position(Victoria).title("Auguste-Victoria Krankenhaus"));

        LatLng Benjamin = new LatLng(52.441692, 13.320392);
        mMap.addMarker(new MarkerOptions().position(Benjamin).title("Charité Campus Benjamin Franklin"));


        LatLng Buch = new LatLng(52.626752, 13.506666);
        mMap.addMarker(new MarkerOptions().position(Buch).title("Charité Campus Buch"));

        LatLng Mitte = new LatLng(52.462498, 13.345061);
        mMap.addMarker(new MarkerOptions().position(Mitte).title("Charité Campus Mitte"));

        LatLng Virchow  = new LatLng(52.523765, 13.378404);
        mMap.addMarker(new MarkerOptions().position(Virchow).title("Charité Campus Virchow Klinikum"));

        LatLng Kreuz = new LatLng(52.519421, 13.279629);
        mMap.addMarker(new MarkerOptions().position(Kreuz).title("Deutsches Rotes Kreuz Klinikum"));

        LatLng Behring = new LatLng(52.423370, 13.254008);
        mMap.addMarker(new MarkerOptions().position(Behring).title("Helios Emil von Behring"));

        LatLng Vivantes = new LatLng(52.494109, 13.408605);
        mMap.addMarker(new MarkerOptions().position(Vivantes).title("Vivantes Klinikum Am Urban"));

        LatLng Waldkrankenhaus = new LatLng( 52.562703, 13.155958);
        mMap.addMarker(new MarkerOptions().position(Waldkrankenhaus).title("Evangelisches Waldkrankenhaus Spandau"));

    }
}
