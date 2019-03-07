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

public class MapsAnmeldung extends FragmentActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_maps_anmeldung);
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
        LatLng BürgeramtHalemwegAußenstelle = new LatLng(52.537895,13.286987);
        mMap.addMarker(new MarkerOptions().position(BürgeramtHalemwegAußenstelle).title("Bürgeramt Halemweg (Außenstelle) "));

        LatLng BürgeramtHeerstraße = new LatLng(52.509595,13.267815);
        mMap.addMarker(new MarkerOptions().position(BürgeramtHeerstraße).title("Bürgeramt Heerstraße"));

        LatLng BürgeramtHohenzollerndamm = new LatLng(52.489713,13.312042);
        mMap.addMarker(new MarkerOptions().position(BürgeramtHohenzollerndamm).title("Bürgeramt Hohenzollerndamm"));

        LatLng BürgeramtWilmersdorferStraße = new LatLng(52.509207,13.305025);
        mMap.addMarker(new MarkerOptions().position(BürgeramtWilmersdorferStraße).title("Bürgeramt Wilmersdorfer Straße"));

        LatLng BürgeramtKreuzbergYorckstr = new LatLng(52.493708,13.385105);
        mMap.addMarker(new MarkerOptions().position(BürgeramtKreuzbergYorckstr).title("Bürgeramt 1 (Kreuzberg), Yorckstr. "));

        LatLng BürgeramtFriedrichshainFrankfurterAllee = new LatLng(52.515548,13.462038);
        mMap.addMarker(new MarkerOptions().position(BürgeramtFriedrichshainFrankfurterAllee).title("Bürgeramt 3 (Friedrichshain), Frankfurter Allee"));

        LatLng BürgeramtNeuHohenschönhausenEgonErwinKischStraße = new LatLng(52.567525,13.514094);
        mMap.addMarker(new MarkerOptions().position(BürgeramtNeuHohenschönhausenEgonErwinKischStraße).title("Bürgeramt 1 (Neu- Hohenschönhausen) Egon-Erwin-Kisch-Straße "));

        LatLng BürgeramtLichtenbergNormannenstr = new LatLng(52.516281,13.480641);
        mMap.addMarker(new MarkerOptions().position(BürgeramtLichtenbergNormannenstr).title("Bürgeramt 2 (Lichtenberg) Normannenstr."));

        LatLng BürgeramtFriedrichsfeldeTierparkcenter = new LatLng(52.497211,13.520711);
        mMap.addMarker(new MarkerOptions().position(BürgeramtFriedrichsfeldeTierparkcenter).title("Bürgeramt 3 (Friedrichsfelde) Tierparkcenter"));

        LatLng BürgeramtAltHohenschönhausenGroßeLeegeStraße = new LatLng(52.545421,13.500210);
        mMap.addMarker(new MarkerOptions().position(BürgeramtAltHohenschönhausenGroßeLeegeStraße).title("Bürgeramt 4 (Alt- Hohenschönhausen) Große-Leege-Straße"));

        LatLng MobilesBürgeramtAnnaSeghersBibliothk = new LatLng(52.545421,13.500210);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtAnnaSeghersBibliothk).title("Mobiles Bürgeramt Anna-Seghers-Bibliothk"));

        LatLng MobilesBürgeramtBibliothekAntonSaefkow = new LatLng(52.530733,13.470835);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtBibliothekAntonSaefkow).title("Mobiles Bürgeramt Bibliothek Anton-Saefkow"));

        LatLng MobilesBürgeramtFSEPflegeeinrichtungKätheKern = new LatLng(52.530714,13.470815);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtFSEPflegeeinrichtungKätheKern).title("Mobiles Bürgeramt FSE Pflegeeinrichtung Käthe Kern"));

        LatLng MobilesBürgeramtJobcenterLichtenberg = new LatLng(52.518262,13.487916);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtJobcenterLichtenberg).title("Mobiles Bürgeramt Jobcenter Lichtenberg"));

        LatLng MobilesBürgeramtSeniorenzentrumAmObersee = new LatLng(52.546707,13.494581);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtSeniorenzentrumAmObersee).title("Mobiles Bürgeramt Seniorenzentrum Am Obersee"));

        LatLng MobilesBürgeramtStadtteilzentrumIkarus = new LatLng(52.481140,13.522601);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtStadtteilzentrumIkarus).title("Mobiles Bürgeramt Stadtteilzentrum Ikarus"));

        LatLng BürgeramtBiesdorfCenter = new LatLng(52.504943,13.557633);
        mMap.addMarker(new MarkerOptions().position(BürgeramtBiesdorfCenter).title("Bürgeramt Biesdorf - Center"));

        LatLng BürgeramtHelleMitte = new LatLng(52.504943,13.557633);
        mMap.addMarker(new MarkerOptions().position(BürgeramtHelleMitte).title("Bürgeramt Helle MitteSweet Home"));

        LatLng BürgeramtMarzahnerPromenade = new LatLng(52.542617,13.544735);
        mMap.addMarker(new MarkerOptions().position(BürgeramtMarzahnerPromenade).title("Bürgeramt Marzahner Promenade"));

        LatLng BürgeramtFlüchtlingsbürgeramtMitte = new LatLng(52.527049,13.338470);
        mMap.addMarker(new MarkerOptions().position(BürgeramtFlüchtlingsbürgeramtMitte).title("Bürgeramt 4 (Flüchtlingsbürgeramt Mitte)"));

        LatLng BürgeramtRathausMitte = new LatLng(52.521105,13.423469);
        mMap.addMarker(new MarkerOptions().position(BürgeramtRathausMitte).title("Bürgeramt Rathaus Mitte"));

        LatLng BürgeramtRathausTiergarten = new LatLng(52.526998,13.338639);
        mMap.addMarker(new MarkerOptions().position(BürgeramtRathausTiergarten).title("Bürgeramt Rathaus Tiergarten"));

        LatLng BürgeramtWedding = new LatLng(52.557058,13.374379);
        mMap.addMarker(new MarkerOptions().position(BürgeramtWedding).title("Bürgeramt Wedding "));

        LatLng BürgeramtBlaschkoalleeNeukölln = new LatLng(52.452898,13.446262);
        mMap.addMarker(new MarkerOptions().position(BürgeramtBlaschkoalleeNeukölln).title("Bürgeramt Blaschkoallee, Neukölln"));

        LatLng BürgeramtRathausNeukölln = new LatLng(52.481604,13.436604);
        mMap.addMarker(new MarkerOptions().position(BürgeramtRathausNeukölln).title("Bürgeramt Rathaus Neukölln"));

        LatLng BürgeramtSonnenalleeNeukölln = new LatLng(52.481966,13.440850);
        mMap.addMarker(new MarkerOptions().position(BürgeramtSonnenalleeNeukölln).title("Bürgeramt Sonnenallee, Neukölln"));

        LatLng BürgeramtZwickauerDammNeukölln = new LatLng(52.419688,13.479287);
        mMap.addMarker(new MarkerOptions().position(BürgeramtZwickauerDammNeukölln).title("Bürgeramt Zwickauer Damm, Neukölln"));

        LatLng MobilesBürgeramtAltBuckow = new LatLng(52.423181,13.433466);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtAltBuckow).title("Mobiles Bürgeramt Alt-Buckow"));

        LatLng MobilesBürgeramtRudow = new LatLng(52.423240,13.433477);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtRudow).title("Mobiles Bürgeramt Rudow"));

        LatLng BürgeramtKarowBuch = new LatLng(52.632829,13.495545);
        mMap.addMarker(new MarkerOptions().position(BürgeramtKarowBuch).title("Bürgeramt Karow / Buch"));

        LatLng BürgeramtPankow = new LatLng(52.569097,13.402307);
        mMap.addMarker(new MarkerOptions().position(BürgeramtPankow).title("Bürgeramt Pankow"));

        LatLng BürgeramtPrenzlauerBerg = new LatLng(52.540612,13.427380);
        mMap.addMarker(new MarkerOptions().position(BürgeramtPrenzlauerBerg).title("Bürgeramt Prenzlauer Berg"));

        LatLng BürgeramtWeißensee = new LatLng(52.560310,13.467710);
        mMap.addMarker(new MarkerOptions().position(BürgeramtWeißensee).title("Bürgeramt Weißensee"));

        LatLng BürgeramtHeiligensee = new LatLng(52.615728,13.245057);
        mMap.addMarker(new MarkerOptions().position(BürgeramtHeiligensee).title("Bürgeramt Heiligensee"));

        LatLng BürgeramtMärkischesViertel = new LatLng(52.597835,13.352314);
        mMap.addMarker(new MarkerOptions().position(BürgeramtMärkischesViertel).title("Bürgeramt Märkisches Viertel"));

        LatLng BürgeramtRathausReinickendorf = new LatLng(52.589922,13.324870);
        mMap.addMarker(new MarkerOptions().position(BürgeramtRathausReinickendorf).title("Bürgeramt Rathaus Reinickendorf"));

        LatLng BürgeramtReinickendorfOst = new LatLng(52.571231,13.347671);
        mMap.addMarker(new MarkerOptions().position(BürgeramtReinickendorfOst).title("Bürgeramt Reinickendorf-Ost"));

        LatLng BürgeramtTegel = new LatLng(52.582530,13.289063);
        mMap.addMarker(new MarkerOptions().position(BürgeramtTegel).title("Bürgeramt Tegel"));

        LatLng MobilesBürgeramtHermsdorf = new LatLng(52.625259, 13.294645);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtHermsdorf).title("Mobiles Bürgeramt Hermsdorf"));

        LatLng MobilesBürgeramtMV = new LatLng(52.604940, 13.356411);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtMV).title("Mobiles Bürgeramt MV"));

        LatLng MobilesBürgeramtReinickendorf = new LatLng(52.570505, 13.322719);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtReinickendorf).title("Mobiles Bürgeramt Reinickendorf"));

        LatLng MobilesBürgeramtReinickendorfOst = new LatLng(52.566375, 13.359684);
        mMap.addMarker(new MarkerOptions().position(MobilesBürgeramtReinickendorfOst).title("Mobiles Bürgeramt Reinickendorf Ost"));

        LatLng BürgeramtSpandauBürgeramtRathausSpandau = new LatLng(52.535268, 13.200418);
        mMap.addMarker(new MarkerOptions().position(BürgeramtSpandauBürgeramtRathausSpandau).title("Bürgeramt Spandau - Bürgeramt Rathaus Spandau"));

        LatLng BürgeramtSpandauBürgerbüroFalkenhagenerFeld = new LatLng(52.550530, 13.177390);
        mMap.addMarker(new MarkerOptions().position(BürgeramtSpandauBürgerbüroFalkenhagenerFeld).title("Bürgeramt Spandau - Bürgerbüro Falkenhagener Feld"));

        LatLng BürgeramtSpandauBürgerbüroKladow = new LatLng(52.452205, 13.140697);
        mMap.addMarker(new MarkerOptions().position(BürgeramtSpandauBürgerbüroKladow).title("Bürgeramt Spandau - Bürgerbüro Kladow"));

        LatLng BürgeramtSpandauBürgerbüroWasserstadt = new LatLng(52.559934, 13.219911);
        mMap.addMarker(new MarkerOptions().position(BürgeramtSpandauBürgerbüroWasserstadt).title("Bürgeramt Spandau - Bürgerbüro Wasserstadt"));

        LatLng BürgeramtLankwitz = new LatLng(52.427919, 13.347656);
        mMap.addMarker(new MarkerOptions().position(BürgeramtLankwitz).title("Bürgeramt Lankwitz"));

        LatLng BürgeramtSteglitz = new LatLng(52.457304, 13.320536);
        mMap.addMarker(new MarkerOptions().position(BürgeramtSteglitz).title("Bürgeramt Steglitz"));

        LatLng BürgeramtZehlendorf = new LatLng(52.433666, 13.257737);
        mMap.addMarker(new MarkerOptions().position(BürgeramtZehlendorf).title("Bürgeramt Zehlendorf"));

        LatLng BürgeramtLichtenrade = new LatLng(52.385908, 13.398330);
        mMap.addMarker(new MarkerOptions().position(BürgeramtLichtenrade).title("Bürgeramt Lichtenrade"));


        LatLng BürgeramtSchöneberg = new LatLng(52.484826, 13.344776);
        mMap.addMarker(new MarkerOptions().position(BürgeramtSchöneberg).title("Bürgeramt Schöneberg"));

        LatLng BürgeramtTempelhof = new LatLng(52.462937, 13.385959);
        mMap.addMarker(new MarkerOptions().position(BürgeramtTempelhof).title("Bürgeramt Tempelhof"));

        LatLng BürgeramtKöpenick = new LatLng(52.445511, 13.574765);
        mMap.addMarker(new MarkerOptions().position(BürgeramtKöpenick).title("Bürgeramt I in Köpenick"));

        LatLng BürgeramtSchöneweide = new LatLng(52.455869, 13.511065);
        mMap.addMarker(new MarkerOptions().position(BürgeramtSchöneweide).title("Bürgeramt II in Schöneweide"));



    }
}
