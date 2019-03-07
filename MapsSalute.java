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

public class MapsSalute extends FragmentActivity implements OnMapReadyCallback {

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
        setContentView(R.layout.activity_maps_salute);
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
        LatLng FRANGILLO = new LatLng(52.510176, 13.279335);
        mMap.addMarker(new MarkerOptions().position(FRANGILLO).title("Dentista FRANGILLO ENGLER, Kaiserdamm 30\n" +
                "14057 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng Bastian = new LatLng(52.524492, 13.176233);
        mMap.addMarker(new MarkerOptions().position(Bastian).title("Dentista KÄMPFE Bastian, Seeburger Weg 13 13581 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng KLAPPROTH = new LatLng(52.458083, 13.318340);
        mMap.addMarker(new MarkerOptions().position(KLAPPROTH).title("Dentista KLAPPROTH Christine, Grunewal dstr. 6 12165 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng SCALZO = new LatLng(552.502448, 13.341897);
        mMap.addMarker(new MarkerOptions().position(SCALZO).title("Dentista LO SCALZO Jana, Tauentzienstr. 1, 10789 Berlin ").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng MUBARAKSHIN = new LatLng(52.543949, 13.238503);
        mMap.addMarker(new MarkerOptions().position(MUBARAKSHIN).title("Dentista MUBARAKSHIN Andrey, Haselhorster Damm 15, 13599 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng SCHNEIDER = new LatLng(52.432993, 13.235588);
        mMap.addMarker(new MarkerOptions().position(SCHNEIDER).title("Dentista SCHNEIDER Günter, Wolzogenstr. 25, 14163 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng SISTORI = new LatLng(52.497836, 13.289034);
        mMap.addMarker(new MarkerOptions().position(SISTORI).title("Dentista SISTORI Andrea Maria, Ringbahnstr. 14, 10711 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng TROIANIELLO = new LatLng(52.495461, 13.329198);
        mMap.addMarker(new MarkerOptions().position(TROIANIELLO).title("Dentista TROIANIELLO Michele, Hohenzollerndamm 3, 14057 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));

        LatLng KOSSMANN = new LatLng(52.546123, 13.263902);
        mMap.addMarker(new MarkerOptions().position(KOSSMANN).title("Dermatologo e allergologo KOSSMANN Petra, Rieppelstr. 24, 13629 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN)));

        LatLng Margherita = new LatLng(52.499748, 13.425252);
        mMap.addMarker(new MarkerOptions().position(Margherita).title("Fisioterapista D’AMELIO Margherita, Oranienstr. 5, 10997 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        LatLng BENEDITTIS = new LatLng(52.500133, 13.316262);
        mMap.addMarker(new MarkerOptions().position(BENEDITTIS).title("Fisioterapista DE BENEDITTIS Margherita, Schlüterstr. 41, 10707 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        LatLng PUCA = new LatLng(52.513308, 13.301495);
        mMap.addMarker(new MarkerOptions().position(PUCA).title("Fisioterapista PUCA Stefano, Kaiser-Friedrich-Str. 84, 10585 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        LatLng NOGLY = new LatLng(52.494119, 13.341552);
        mMap.addMarker(new MarkerOptions().position(NOGLY).title("Fisioterapista NOGLY Annette, Hohenstaufenstr. 46 A,  10770 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE)));

        LatLng TORTAROLO = new LatLng(52.483658, 13.427200);
        mMap.addMarker(new MarkerOptions().position(TORTAROLO).title("Generico TORTAROLO Michele, Mainzer Str. 8, 12053 Berlin"));

        LatLng WILDFEUER = new LatLng(52.478908, 13.329316);
        mMap.addMarker(new MarkerOptions().position(WILDFEUER).title("Generico WILDFEUER Claudia-Isabella, Bundesplatz 14, 10715 Berlin"));

        LatLng FOTI = new LatLng(52.418239, 13.261293);
        mMap.addMarker(new MarkerOptions().position(FOTI).title("Generico FOTI Gisella, Leuchtenburgstr. 34, 14165 Berlin"));

        LatLng JUNG = new LatLng(52.546104, 13.263912);
        mMap.addMarker(new MarkerOptions().position(JUNG).title("Generico JUNG Andreas, Rieppelstr. 24, 13629 Berlin"));

        LatLng HERM = new LatLng(52.492318, 13.416859);
        mMap.addMarker(new MarkerOptions().position(HERM).title("Generico HERM Wolfgang, Dieffenbachstr. 20, 10967 Berlin"));

        LatLng LICCINI = new LatLng(52.507776, 13.299163);
        mMap.addMarker(new MarkerOptions().position(LICCINI).title("Generico LICCINI Lisa, Windscheidstr. 31, 10627 Berlin"));

        LatLng MANTIONE = new LatLng(52.496910, 13.428606);
        mMap.addMarker(new MarkerOptions().position(MANTIONE).title("Generico MANTIONE Maria Cristina, " +
                "Lausitzer Str. 41-44, 10999 Berlin"));

        LatLng VIVIANO = new LatLng(552.500260, 13.349091);
        mMap.addMarker(new MarkerOptions().position(VIVIANO).title("Generico VIVIANO Edoardo, Kleiststr. 34, 10781 Berlin"));

        LatLng SEEGER = new LatLng(52.460834, 13.324174);
        mMap.addMarker(new MarkerOptions().position(SEEGER).title("Ginecologa SEEGER-HELD Antonia, Schlossstr. 19, 12163 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng SORGE = new LatLng(52.497352, 13.289812);
        mMap.addMarker(new MarkerOptions().position(SORGE).title("Ginecologa e ostetrica SORGE Martina, Kurfürstendamm 117,10711 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng KORSUKEWITZ = new LatLng(52.461586, 13.325527);
        mMap.addMarker(new MarkerOptions().position(KORSUKEWITZ).title("Ginecologa KORSUKEWITZ Inge, Schlossstr. 111, 12163 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng KLINGSOEHR = new LatLng(552.528779, 13.192184);
        mMap.addMarker(new MarkerOptions().position(KLINGSOEHR).title("Ginecologa e ostetrica KLINGSOEHR Beatrix, Seeburger Str. 8, 13581 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_VIOLET)));

        LatLng MAIO = new LatLng(52.461169, 13.590547);
        mMap.addMarker(new MarkerOptions().position(MAIO).title("Infermiera DE MAIO Clorinda, Janitzkystr. 71,  12555 Berlin"));

        LatLng Freiherr = new LatLng(52.490140, 13.339846);
        mMap.addMarker(new MarkerOptions().position(Freiherr).title("Internista Freiherr von BRÜCK Thomas, Landshuter Str. 22, 10779 Berlin"));

        LatLng LAMBERTI = new LatLng(52.550008, 13.209715);
        mMap.addMarker(new MarkerOptions().position(LAMBERTI).title("Internista e cardiologo LAMBERTI-CASTRONUOVO Alessandro"));

        LatLng GIESE = new LatLng(52.572232, 13.417053);
        mMap.addMarker(new MarkerOptions().position(GIESE).title("Internista GIESE Andreas, Damerowstr. 7, 13187 Berlin"));

        LatLng PINZI = new LatLng(52.489211, 13.400125);
        mMap.addMarker(new MarkerOptions().position(PINZI).title("Logopedista PINZI Silvia, Logopädie Meiwald & Koch"));

        LatLng KLARHOLZ = new LatLng(52.442004, 13.233196);
        mMap.addMarker(new MarkerOptions().position(KLARHOLZ).title("Ortopedico KLARHOLZ-PEVERE Carola, Goethestr. 26 A, 14163 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        LatLng LEMME = new LatLng(52.509656, 13.270454);
        mMap.addMarker(new MarkerOptions().position(LEMME).title("Ortopedico LEMME Alexander, Heerstr. 2, 14052 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        LatLng MÜLLER = new LatLng(52.478530, 13.282693);
        mMap.addMarker(new MarkerOptions().position(MÜLLER).title("Ortopedico MÜLLER-FOTI Joachim, Hohenzollerndamm 90, 14199 Berlin").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_YELLOW)));

        LatLng FELICI = new LatLng(52.496710, 13.339651);
        mMap.addMarker(new MarkerOptions().position(FELICI).title("Osteopata FELICI Andrè, Ansbacher Str. 63, 10777 Berlin"));

        LatLng WINKLER = new LatLng(52.506979, 13.323328);
        mMap.addMarker(new MarkerOptions().position(WINKLER).title("Otorinolaringoiatra WINKLER Gunnar, Carmerstr. 7, 10623 Berlin"));

        LatLng RÜFFER = new LatLng(52.475931, 13.426330);
        mMap.addMarker(new MarkerOptions().position(RÜFFER).title("Otorinolaringoiatra RÜFFER Theodor, Hermannstr. 61, 12049 Berlin"));

        LatLng PANKOK = new LatLng(52.494307, 13.362942);
        mMap.addMarker(new MarkerOptions().position(PANKOK).title("Pediatra PANKOK Dr., Goebenstr. 24, 10783 Berlin"));

        LatLng RATH = new LatLng(52.503980, 13.318440);
        mMap.addMarker(new MarkerOptions().position(RATH).title("Psicanalista RATH Claus Dieter, Niebuhrstr. 77, 10629").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng CAPOBIANCO = new LatLng(52.531716, 13.422239);
        mMap.addMarker(new MarkerOptions().position(CAPOBIANCO).title("Psichiatra, psicoterapeuta CAPOBIANCO  Cinzia,Raabestr. 7, 10405").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng DEGANO = new LatLng(52.453288, 13.324122);
        mMap.addMarker(new MarkerOptions().position(DEGANO).title("Psichiatra, psicoterapeuta DEGANO KIESER Luciana, MPH, Leydenallee 83").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng HOISL = new LatLng(52.503945, 13.307845);
        mMap.addMarker(new MarkerOptions().position(HOISL).title("Psichiatra, psicoterapeuta HOISL Martina, Wilmersdorfer Str. 102/103").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng BORRIELLO = new LatLng(52.478832, 13.438507);
        mMap.addMarker(new MarkerOptions().position(BORRIELLO).title("Psicologa BORRIELLO Giulia, Richardstr. 112, 12043").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng BOSCO = new LatLng(52.553492, 13.412882);
        mMap.addMarker(new MarkerOptions().position(BOSCO).title("Psicologo BOSCO Massimiliano Bornholmer Str. 93, 10439").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng BUTTIGNOL = new LatLng(52.490261, 13.425404);
        mMap.addMarker(new MarkerOptions().position(BUTTIGNOL).title("Psicologa, psicoterapeuta BUTTIGNOL Anna, Lenaustr. 25, 12047").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng CAMPANELLA = new LatLng(52.487243, 13.392332);
        mMap.addMarker(new MarkerOptions().position(CAMPANELLA).title("Psicologa, psicoterapeuta CAMPANELLA Valentina").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_MAGENTA)));

        LatLng BUCHWALD = new LatLng(52.528646, 13.191367);
        mMap.addMarker(new MarkerOptions().position(BUCHWALD).title("Urologo BUCHWALD Matthias, Seeburger Str. 10, 13581"));

        LatLng LOMBARDI = new LatLng(52.461906, 13.434905);
        mMap.addMarker(new MarkerOptions().position(LOMBARDI).title("Veterinario LOMBARDI Oliviero Britzer Damm 13, 12347").icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_CYAN)));



    }
}
