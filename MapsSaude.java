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

public class MapsSaude extends FragmentActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_maps_saude);
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

        if (ContextCompat.checkSelfPermission(this,Manifest.permission.ACCESS_FINE_LOCATION)
                == PackageManager.PERMISSION_GRANTED) {
            mMap.setMyLocationEnabled(true);
        } else {
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                    MY_PERMISSIONS_REQUEST_ACCESS_FINE_LOCATION);
        }


        LatLng GerdGraffunder = new LatLng(52.434257,13.260417);
        mMap.addMarker(new MarkerOptions().position(GerdGraffunder).title("Gerd Graffunder. Ginecologista (Obstretrícia e Oncologia)").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng HelgaGramann = new LatLng(52.487568,13.343006);
        mMap.addMarker(new MarkerOptions().position(HelgaGramann).title("Helga Gramann. Internista, Cardiologista"));

        LatLng WolfgangHoffmann = new LatLng(52.477979,13.283264);
        mMap.addMarker(new MarkerOptions().position(WolfgangHoffmann).title("Wolfgang Hoffmann. Ortopedista. Hohenzollerndamm 112, 14199 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        LatLng PeterKohler = new LatLng(52.547539,13.356577);
        mMap.addMarker(new MarkerOptions().position(PeterKohler).title("Peter Kohler, Ortopedista. Müllerstr. 32A, 13353 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        LatLng MarcusThuma = new LatLng(52.502172,13.321127);
        mMap.addMarker(new MarkerOptions().position(MarcusThuma).title("Marcus Thuma. Kant Praxis, medicina interna. Kurfürstendamm 42"));

        LatLng ArnoldJansen = new LatLng(52.510634,13.402277);
        mMap.addMarker(new MarkerOptions().position(ArnoldJansen).title("Arnold Jansen, dentista. Rosenthalerstr. 37, 10178 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));


        LatLng CátiaSantos = new LatLng(52.530881,13.383006);
        mMap.addMarker(new MarkerOptions().position(CátiaSantos).title("Cátia Santos e Robert Kötter, dentista. Chausseestraße 22, 10115 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));


        LatLng EvaGamig = new LatLng(52.494585,13.310108);
        mMap.addMarker(new MarkerOptions().position(EvaGamig).title("Eva Gamig, dentista. Konstanzer Strasse 14, 10707 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));


        LatLng PereiraStawowy = new LatLng(52.495701,13.339488);
        mMap.addMarker(new MarkerOptions().position(PereiraStawowy).title("Núbia Borges Pereira Stawowy, dentista. Regensburger Straße 33, 10777 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));


        LatLng JobcenterBerlinMarzahnHellersdorf = new LatLng(52.526500,13.527367);
        mMap.addMarker(new MarkerOptions().position(JobcenterBerlinMarzahnHellersdorf).title("Maria A. Hilsmann, dentista, Brandenburgische Str. 86 - 87, 10713 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));


        LatLng BlockVeras = new LatLng(52.524641,13.465323);
        mMap.addMarker(new MarkerOptions().position(BlockVeras).title("Rafael Block Veras, dentista, Storkower Str. 207 b, 10369 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));


        LatLng EckartWiedermann = new LatLng(52.500693,13.342968);
        mMap.addMarker(new MarkerOptions().position(EckartWiedermann).title("Eckart Wiedermann, dentista, Bayreuther Straße 9, 10789 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));


        LatLng MarkusGauger = new LatLng(52.551239,13.387172);
        mMap.addMarker(new MarkerOptions().position(MarkusGauger).title("Markus Gauger, Fonoaudiólogo, Heidebrinkerstr.11, 13355 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng RenataOehlgardt = new LatLng(52.539034,13.282765);
        mMap.addMarker(new MarkerOptions().position(RenataOehlgardt).title("Renata Oehlgardt, Fonoaudiólogo, Schweiggerweg 2-12, 13627 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));


        LatLng AnaSpath = new LatLng(52.526388,13.389228);
        mMap.addMarker(new MarkerOptions().position(AnaSpath).title("Ana Spath. Consultório de aconselhamento psicológico").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Stollenwerk = new LatLng(52.505765,13.342386);
        mMap.addMarker(new MarkerOptions().position(Stollenwerk).title("Fa Stollenwerk, Psicologa, Budapesterstr. 33, 1. Andar, 10787 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Josneia = new LatLng(52.521754,13.337249);
        mMap.addMarker(new MarkerOptions().position(Josneia).title("Josneia Da Cas, Psicologa, Dortmunder Str. 4, 10555 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Carvalho = new LatLng(52.522067,13.381945);
        mMap.addMarker(new MarkerOptions().position(Carvalho).title("Jovita P. de Carvalho, Psicóloga, Marienstr.25, 10117 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Moratelli = new LatLng(52.526363,13.389240);
        mMap.addMarker(new MarkerOptions().position(Moratelli).title("Juliana Moratelli, Psicologia clínica.,Linienstrasse 137, 10115 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Krapp = new LatLng(52.496746,13.296375);
        mMap.addMarker(new MarkerOptions().position(Krapp).title("Manfred Krapp,medicina psicossomática e psicoterapia").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Sholl = new LatLng(52.478864,13.348262);
        mMap.addMarker(new MarkerOptions().position(Sholl).title("Patricia Sholl,Terapia de família, Ebersstr. 62, 10827 Berlim").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Theiss = new LatLng(52.479560,13.379444);
        mMap.addMarker(new MarkerOptions().position(Theiss).title("Peter Theiss-Abendroth, Psiquiatra, psicoterapeuta e psicanalista").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Barreto = new LatLng(52.464308,13.309215);
        mMap.addMarker(new MarkerOptions().position(Barreto).title("Vanessa von Thenen Menna Barreto. Psicóloga").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng Barbosa = new LatLng(52.509040,13.389557);
        mMap.addMarker(new MarkerOptions().position(Barbosa).title("Zaine Brockmeyer-Barbosa, Psicóloga,Friedrichstrasse 200").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

    }
}
