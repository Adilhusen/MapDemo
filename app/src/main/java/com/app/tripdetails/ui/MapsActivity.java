package com.app.tripdetails.ui;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.fragment.app.FragmentActivity;

import android.app.Activity;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import com.app.tripdetails.API.ApiClient;
import com.app.tripdetails.R;
import com.app.tripdetails.db.DatabaseClient;
import com.app.tripdetails.model.MYLocation;
import com.app.tripdetails.model.PolylineRouteResp;
import com.app.tripdetails.model.UserLocation;
import com.app.tripdetails.utils.Pref;
import com.app.tripdetails.utils.Utils;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CustomCap;
import com.google.android.gms.maps.model.JointType;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.RoundCap;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private static final String TAG = "Maps";
    Activity activity;
    private GoogleMap mMap;
    public static final String MYDATA = "MY_DATA";
    MYLocation myLocation;

    List<LatLng> latLngList = new ArrayList<>();
    private Polyline polyline;
    ProgressBar contentLoadingProgressBar;
    AppCompatTextView tvTripName, tvTripSource, tvTripDestination, tvTripDistance;
    LinearLayout ll_data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        contentLoadingProgressBar = findViewById(R.id.contentLoadingProgressBar);
        tvTripName = findViewById(R.id.tvTripName);
        tvTripSource = findViewById(R.id.tvTripSource);
        tvTripDestination = findViewById(R.id.tvTripDestination);
        tvTripDistance = findViewById(R.id.tvTripDistance);
        ll_data = findViewById(R.id.ll_data);

        mapFragment.getMapAsync(this);
        GoogleMap googleMap;
        activity = this;
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            myLocation = (MYLocation) bundle.getSerializable(MYDATA);
            setData();
            makeList();

//            mMap.moveCamera(CameraUpdateFactory.newLatLng(new LatLng(lat, lng)));
        }

    }

    private void setData() {
        if (myLocation != null) {
            ll_data.setVisibility(View.VISIBLE);
            tvTripName.setText(myLocation.getmName());
            tvTripSource.setText(myLocation.getmStartLocation());
            tvTripDestination.setText(myLocation.getmEndLocation());

        } else {
            ll_data.setVisibility(View.GONE);
        }
    }

    private void makeList() {
        latLngList = new ArrayList<>();


        class GetDataTask extends AsyncTask<Void, Void, List<UserLocation>> {

            @Override
            protected List<UserLocation> doInBackground(Void... voids) {

                //DatabaseClient.getInstance(getApplicationContext()).getAppDatabase().taskDao().deleteTable();
                return DatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                        .taskDao()
                        .getLatLongList(myLocation.getId());

            }

            @Override
            protected void onPostExecute(List<UserLocation> userLocations) {
                super.onPostExecute(userLocations);

                Log.e(TAG, "userLocations list size=" + userLocations.size());

                for (UserLocation userLocation : userLocations
                ) {
                    double lat = Double.parseDouble(userLocation.getLatitude());
                    double lng = Double.parseDouble(userLocation.getLongitude());
                    latLngList.add(new LatLng(lat, lng));
                }


                Log.e(TAG, "Lat list size=" + latLngList.size());

            }
        }

        GetDataTask st = new GetDataTask();
        st.execute();
    }


    private void drawPath() {

        if (myLocation == null)
            return;

        // Add polylines and polygons to the map. This section shows just
        // a single polyline. Read the rest of the tutorial to learn more.
        String sLat = myLocation.getmStartLatitude();
        String sLong = myLocation.getmEndLongitude();
        double sLatitude = Double.parseDouble(sLat);
        double sLongitude = Double.parseDouble(sLong);

        String eLat = myLocation.getmEndLatitude();
        String eLong = myLocation.getmEndLongitude();
        double eLatitude = Double.parseDouble(eLat);
        double eLongitude = Double.parseDouble(eLong);

        PolylineOptions polylineOptions = new PolylineOptions();
        try {
            if (polylineOptions != null) {

                Polyline polyline1 = null;

                if (latLngList != null && latLngList.size() > 0) {
                    polyline1 = mMap.addPolyline(polylineOptions
                                    .clickable(true)
                                    .addAll(latLngList)
                        /*.add(
                                new LatLng(sLatitude, sLongitude),
                                new LatLng(eLatitude, eLongitude))*/);
                } else {
                    polyline1 = mMap.addPolyline(polylineOptions
                            .clickable(true)

                            .add(
                                    new LatLng(sLatitude, sLongitude),
                                    new LatLng(eLatitude, eLongitude)));
                }
                polyline1.setTag("A");
                stylePolyline(polyline1);
                // Position the map's camera near Alice Springs in the center of Australia,
                // and set the zoom factor so most of Australia shows on the screen.


                double lat = !TextUtils.isEmpty(sLat) ? Double.parseDouble(sLat) : -34;
                double lng = !TextUtils.isEmpty(sLong) ? Double.parseDouble(sLong) : 151;
                mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(lat, lng), 4));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    private static final int COLOR_BLACK_ARGB = 0xff000000;
    private static final int POLYLINE_STROKE_WIDTH_PX = 12;

    private void stylePolyline(Polyline polyline) {
        if (polyline == null) {
            return;
        }
        String type = "";
        // Get the data object stored with the polyline.
        if (polyline.getTag() != null) {
            type = polyline.getTag().toString();
        }

        switch (type) {
            // If no type is given, allow the API to use the default.
            case "A":
                // Use a custom bitmap as the cap at the start of the line.
                polyline.setStartCap(new RoundCap()
                        /*new CustomCap(
                                BitmapDescriptorFactory.fromResource(R.drawable.ic_arrow), 10)*/);
                break;
            case "B":
                // Use a round cap at the start of the line.
                polyline.setStartCap(new RoundCap());
                break;
        }

        polyline.setEndCap(new RoundCap());
        polyline.setWidth(POLYLINE_STROKE_WIDTH_PX);
        polyline.setColor(COLOR_BLACK_ARGB);
        polyline.setJointType(JointType.ROUND);
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
        String endLat = Pref.getValue(activity, Utils.MY_CURRENT_LAT, "");
        String endLong = Pref.getValue(activity, Utils.MY_CURRENT_LNG, "");
        double lat = !TextUtils.isEmpty(endLat) ? Double.parseDouble(endLat) : -34;
        double lng = !TextUtils.isEmpty(endLong) ? Double.parseDouble(endLong) : 151;
        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(lat, lng);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Address"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
        mMap.setMinZoomPreference(13f);
        //drawPath();
        getpolyline();
    }


    // method for draw polyline between two LAT-LONG
    private void getpolyline() {

        contentLoadingProgressBar.setVisibility(View.VISIBLE);
        String sLat = myLocation.getmStartLatitude();
        String sLong = myLocation.getmEndLongitude();
        final double sLatitude = Double.parseDouble(sLat);
        final double sLongitude = Double.parseDouble(sLong);

        String eLat = myLocation.getmEndLatitude();
        String eLong = myLocation.getmEndLongitude();
        final double eLatitude = Double.parseDouble(eLat);
        final double eLongitude = Double.parseDouble(eLong);



        if (polyline != null)
            polyline.remove();


        Call<PolylineRouteResp> call = ApiClient.getClient().getPolylineResp(sLatitude + "," + sLongitude, eLatitude + "," + eLongitude, getString(R.string.google_maps_key));
        call.enqueue(new Callback<PolylineRouteResp>() {
            @Override
            public void onResponse(Call<PolylineRouteResp> call, Response<PolylineRouteResp> response) {

                PolylineRouteResp directionResults = response.body();
/**
 * @Be #patient# because lots of Encapsulation is here
 *
 * To maximum reduce code for polyline

 *
 * must check @"status" other wise crash*/

                if (directionResults.getStatus().equals("OK")) {


                    if (directionResults.getRoutes().size() > 0) {

                        PolylineRouteResp.RoutesBean routeA = directionResults.getRoutes().get(0);
                        if (routeA.getLegs().size() > 0) {
                            String km = routeA.getLegs().get(0).getDistance().getText();

                            if (!TextUtils.isEmpty(km)) {
                                tvTripDistance.setVisibility(View.VISIBLE);
                                tvTripDistance.setText(km);
                            } else tvTripDistance.setVisibility(View.GONE);


//                            encapsulate => getRoutlist()
                            ArrayList<LatLng> routelist = new ArrayList<>();
                            List<PolylineRouteResp.RoutesBean.LegsBean.StepsBean> legsList = routeA.getLegs().get(0).getSteps();
                            routelist.add(new LatLng(sLatitude, sLongitude));
                            for (PolylineRouteResp.RoutesBean.LegsBean.StepsBean latLng :
                                    legsList) {


                                routelist.add(new LatLng(latLng.getEndLocation().getLat(), latLng.getEndLocation().getLng()));


                                /*LatLng eAdd3 = new LatLng(latLng.getEndLocation().getLat(), latLng.getEndLocation().getLng());

                                if (mMap != null) {
                                mMap.addMarker(new MarkerOptions()
                                        .position(eAdd3)
                                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ROSE)));
                                }*/
                            }
                            routelist.add(new LatLng(eLatitude, eLongitude));
//                         ArrayList<LatLng> routelist = routeA.getLegs().get(0).getSteps();

//create polilineoption with all Array of latlong
                            PolylineOptions rectLine = new PolylineOptions().width(10).color(Color.BLACK);
                            rectLine.addAll(routelist);

// Adding route on the map
                            polyline = mMap.addPolyline(rectLine);

                            if (mMap != null) {
                                LatLng sAdd = new LatLng(sLatitude, sLongitude);
                                mMap.addMarker(new MarkerOptions().position(sAdd).title("Start Address:" + myLocation.getmStartLocation()));

                                LatLng eAdd = new LatLng(eLatitude, eLongitude);
                                mMap.addMarker(new MarkerOptions()
                                        .position(eAdd)
                                        .title("End Address:" + myLocation.getmEndLocation())
                                        .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)));
                            }
                        }
                    }

                    contentLoadingProgressBar.setVisibility(View.GONE);
                } else {
                    Log.e(TAG, "Result fail");
                    contentLoadingProgressBar.setVisibility(View.GONE);
                }
            }

            @Override
            public void onFailure(Call<PolylineRouteResp> call, Throwable t) {
                t.printStackTrace();
                Log.e(TAG, t.toString());
                contentLoadingProgressBar.setVisibility(View.GONE);
            }
        });
    }
}
