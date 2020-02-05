package com.app.tripdetails.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.Manifest;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.app.tripdetails.R;
import com.app.tripdetails.adapter.TripDetailsAdapter;
import com.app.tripdetails.db.DatabaseClient;
import com.app.tripdetails.model.MYLocation;
import com.app.tripdetails.services.LocationUpdatesService;
import com.app.tripdetails.utils.Pref;
import com.app.tripdetails.utils.Utils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;
import com.google.android.gms.location.LocationSettingsStates;
import com.google.android.gms.location.LocationSettingsStatusCodes;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.PlacesClient;
import com.google.android.libraries.places.widget.Autocomplete;
import com.google.android.libraries.places.widget.AutocompleteActivity;
import com.google.android.libraries.places.widget.model.AutocompleteActivityMode;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.gun0912.tedpermission.PermissionListener;
import com.gun0912.tedpermission.TedPermission;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.LoggingMXBean;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MAIN";
    FloatingActionButton fabStartTrip;
    RecyclerView rvShowTrips;
    TripDetailsAdapter tripDetailsAdapter;
    PlacesClient placesClient;
    int AUTOCOMPLETE_REQUEST_CODE_SOURCE = 1;
    int AUTOCOMPLETE_REQUEST_CODE_DESTINATION = 2;
    Activity activity;
    private Place place;
    List<MYLocation> myLocationArrayList = new ArrayList<>();

    androidx.appcompat.widget.AppCompatEditText etName;
    androidx.appcompat.widget.AppCompatTextView tvStartDestination, tvNoData;
    androidx.appcompat.widget.AppCompatTextView tvEndDestination;
    androidx.appcompat.widget.AppCompatTextView tvStartTrip;
    private String mName;
    private String mStartDes, mLatStart, mLngStart;
    private String mEndDes, mLatEnd, mLngEnd;

    private GoogleApiClient mGoogleApiClient;
    // A reference to the service used to get location updates.
    private LocationUpdatesService mService = null;
    // Tracks the bound state of the service.
    private boolean mBound = false;
    // Monitors the state of the connection to the service.

    boolean isAnyTripStarted = false;
    private final ServiceConnection mServiceConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            LocationUpdatesService.LocalBinder binder = (LocationUpdatesService.LocalBinder) service;
            mService = binder.getService();
            mBound = true;
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mService = null;
            mBound = false;
        }
    };
    private int REQUEST_CHECK_SETTINGS = 500;

    @Override
    protected void onResume() {
        super.onResume();
        //checkPermission(false);
    }

    @Override
    protected void onStart() {
        super.onStart();
        bindService(new Intent(this, LocationUpdatesService.class), mServiceConnection,
                Context.BIND_AUTO_CREATE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activity = this;

        String apiKey = getString(R.string.google_maps_key);


        // Setup Places Client
        if (!Places.isInitialized()) {
            Places.initialize(getApplicationContext(), apiKey);
        }

        placesClient = Places.createClient(this);
        initView();
        initGoogleAPIClient();

        getLocationList();

    }

    private void setAdapter(List<MYLocation> mList) {

        myLocationArrayList = mList;


        if (myLocationArrayList != null && myLocationArrayList.size() > 0) {

            for (MYLocation myLocation : myLocationArrayList
            ) {
                if (myLocation != null) {
                    String mEndLatitude = myLocation.getmEndLatitude();
                    String mEndLongitude = myLocation.getmEndLongitude();
                    if (!TextUtils.isEmpty(mEndLatitude) && !TextUtils.isEmpty(mEndLongitude)) {
                        isAnyTripStarted = true;
                    } else {
                        isAnyTripStarted = false;
                    }
                }
            }

            tvNoData.setVisibility(View.GONE);
            rvShowTrips.setVisibility(View.VISIBLE);

            tripDetailsAdapter = new TripDetailsAdapter(myLocationArrayList, activity);
            rvShowTrips.setAdapter(tripDetailsAdapter);
        } else {
            isAnyTripStarted = true;
            tvNoData.setVisibility(View.VISIBLE);
            rvShowTrips.setVisibility(View.GONE);
        }
    }

    private void initView() {
        tvNoData = findViewById(R.id.tvNoData);
        fabStartTrip = findViewById(R.id.fabStartTrip);
        rvShowTrips = findViewById(R.id.rvShowTrips);
        rvShowTrips.setLayoutManager(new LinearLayoutManager(this));
        fabStartTrip.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.fabStartTrip) {
            if (isAnyTripStarted) {
                stoptMyService();
                showTipDialog();
            } else {
                Toast.makeText(activity, "Please end you current trip first.", Toast.LENGTH_SHORT).show();
            }
        }
    }

    private void showTipDialog() {

        final AlertDialog dialogBuilder = new AlertDialog.Builder(this).create();
        LayoutInflater inflater = this.getLayoutInflater();
        final View dialogView = inflater.inflate(R.layout.dialog_trip_details_input, null);
        getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        //getWindow().setLayout(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

        etName = dialogView.findViewById(R.id.etName);
        androidx.appcompat.widget.AppCompatTextView tvTitle = dialogView.findViewById(R.id.tvTitle);
        tvTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (dialogBuilder != null)
                    dialogBuilder.dismiss();
            }
        });
        tvStartDestination = dialogView.findViewById(R.id.tvStartDestination);
        tvEndDestination = dialogView.findViewById(R.id.tvEndDestination);
        tvStartTrip = dialogView.findViewById(R.id.tvStartTrip);


        tvStartDestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.NAME, Place.Field.LAT_LNG, Place.Field.ADDRESS, Place.Field.ADDRESS_COMPONENTS);

// Start the autocomplete intent.
                Intent intent = new Autocomplete.IntentBuilder(
                        AutocompleteActivityMode.FULLSCREEN, fields)
                        .build(activity);
                startActivityForResult(intent, AUTOCOMPLETE_REQUEST_CODE_SOURCE);
                if (place != null) {
                    tvStartDestination.setText(place.getAddress());
                }
            }
        });
        tvEndDestination.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                List<Place.Field> fields = Arrays.asList(Place.Field.ID, Place.Field.NAME, Place.Field.LAT_LNG, Place.Field.ADDRESS, Place.Field.ADDRESS_COMPONENTS);

// Start the autocomplete intent.
                Intent intent = new Autocomplete.IntentBuilder(
                        AutocompleteActivityMode.FULLSCREEN, fields)
                        .build(activity);
                startActivityForResult(intent, AUTOCOMPLETE_REQUEST_CODE_DESTINATION);
                if (place != null) {
                    tvEndDestination.setText(place.getAddress());
                }
            }
        });
//


        tvStartTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (validate()) {
                    dialogBuilder.dismiss();
                    saveTask();
                    checkPermission(true);
                }


            }
        });


        dialogBuilder.setView(dialogView);
        dialogBuilder.show();
    }

    private boolean validate() {

        mName = etName.getText().toString().trim();
        mStartDes = tvStartDestination.getText().toString();
        mEndDes = tvEndDestination.getText().toString();

        if (TextUtils.isEmpty(mName)) {
            Utils.makeMeShake(etName, 0, 0);
            return false;
        } else if (TextUtils.isEmpty(mStartDes) || mStartDes.equalsIgnoreCase(getResources().getString(R.string.et_enter_source))) {
            Utils.makeMeShake(tvStartDestination, 0, 0);
            return false;
        } else if (TextUtils.isEmpty(mEndDes) || mStartDes.equalsIgnoreCase(getResources().getString(R.string.et_enter_destination))) {
            Utils.makeMeShake(tvEndDestination, 0, 0);
            return false;
        } else {
            return true;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == AUTOCOMPLETE_REQUEST_CODE_SOURCE || requestCode == AUTOCOMPLETE_REQUEST_CODE_DESTINATION) {
            placesDetailsRequest(requestCode, resultCode, data);
        } else if (requestCode == REQUEST_CHECK_SETTINGS) {
            startMyService(true);
        }
    }

    private void placesDetailsRequest(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK) {
            place = Autocomplete.getPlaceFromIntent(data);

            Log.d("Place", "Place: " + place.getName() + ", " + place.getId());

            if (requestCode == AUTOCOMPLETE_REQUEST_CODE_SOURCE) {
                tvStartDestination.setText(place.getName());

                mLatStart = String.valueOf(place.getLatLng().latitude);
                mLngStart = String.valueOf(place.getLatLng().longitude);

            } else if (requestCode == AUTOCOMPLETE_REQUEST_CODE_DESTINATION) {
                tvEndDestination.setText(place.getName());

                mLatEnd = String.valueOf(place.getLatLng().latitude);
                mLngEnd = String.valueOf(place.getLatLng().longitude);
            } else {
                makeDataSame();
            }


        } else if (resultCode == AutocompleteActivity.RESULT_ERROR) {
            // TODO: Handle the error.
            Status status = Autocomplete.getStatusFromIntent(data);
            Log.d("Place", status.getStatusMessage());
            makeDataSame();
        } else if (resultCode == RESULT_CANCELED) {
            makeDataSame();
            // The user canceled the operation.
        }
    }

    private void makeDataSame() {
        if (tvStartDestination != null)
            tvStartDestination.setText(getResources().getText(R.string.et_enter_source));

        if (tvEndDestination != null)
            tvEndDestination.setText(getResources().getText(R.string.et_enter_destination));
    }


    private void saveTask() {


        class SaveTask extends AsyncTask<Void, Void, MYLocation> {

            @Override
            protected MYLocation doInBackground(Void... voids) {

                //creating a task
                MYLocation task = new MYLocation();
                task.setmName(mName);

                task.setmStartDate(Utils.getCurrentDateTime(""));

                task.setmStartLocation(mStartDes);

                task.setmStartLongitude(mLngStart);
                task.setmStartLatitude(mLatStart);

                task.setmEndLocation(mEndDes);
                task.setmEndLatitude(mLatEnd);
                task.setmEndLongitude(mLngEnd);

                task.setmEndDate("");

                //adding to database
                DatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                        .taskDao()
                        .insert(task);
                return task;
            }

            @Override
            protected void onPostExecute(MYLocation myLocation) {
                super.onPostExecute(myLocation);


                getLocationList();
                tvNoData.setVisibility(View.GONE);
                int currentTripId = myLocation.getId();

                Toast.makeText(getApplicationContext(), "Trip Start Successfully.", Toast.LENGTH_LONG).show();
            }
        }

        SaveTask st = new SaveTask();
        st.execute();
    }


    private void getLocationList() {


        class GetDataTask extends AsyncTask<Void, Void, List<MYLocation>> {

            @Override
            protected List<MYLocation> doInBackground(Void... voids) {

                //DatabaseClient.getInstance(getApplicationContext()).getAppDatabase().taskDao().deleteTable();
                return DatabaseClient.getInstance(getApplicationContext()).getAppDatabase()
                        .taskDao()
                        .getAll();

            }

            @Override
            protected void onPostExecute(List<MYLocation> list) {
                super.onPostExecute(list);

                try {
                    if (list != null && list.size() > 0) {
                        int id=list.get(list.size()-1).getId();
                        Pref.setValueInt(activity, Utils.MY_TRIP_ID, id);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }

                setAdapter(list);

            }
        }

        GetDataTask st = new GetDataTask();
        st.execute();


    }


    private void checkPermission(final boolean isStart) {
        TedPermission.with(this)
                .setPermissionListener(new PermissionListener() {
                    @Override
                    public void onPermissionGranted() {

                        showSettingDialog(isStart);

                    }

                    @Override
                    public void onPermissionDenied(List<String> deniedPermissions) {
                        Toast.makeText(MainActivity.this, "Permission Denied\n" + deniedPermissions.toString(), Toast.LENGTH_SHORT).show();
                    }
                })
                .setDeniedMessage("If you reject permission,you can not use this service\n\nPlease turn on permissions at [Setting] > [Permission]")
                .setPermissions(Manifest.permission.ACCESS_COARSE_LOCATION, Manifest.permission.ACCESS_FINE_LOCATION)
                .check();
    }


    /*GPS*/
    private void initGoogleAPIClient() {
//Without Google API Client Auto Location Dialog will not work
        mGoogleApiClient = new GoogleApiClient.Builder(MainActivity.this)
                .addApi(LocationServices.API)
                .build();
        mGoogleApiClient.connect();
    }

    private void showSettingDialog(final boolean isStart) {
        LocationRequest locationRequest = LocationRequest.create();
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);//Setting priotity of Location request to high
        locationRequest.setInterval(30 * 1000);
        locationRequest.setFastestInterval(5 * 1000);//5 sec Time interval for location update
        LocationSettingsRequest.Builder builder = new LocationSettingsRequest.Builder()
                .addLocationRequest(locationRequest);
        builder.setAlwaysShow(true); //this is the key ingredient to show dialog always when GPS is off

        PendingResult<LocationSettingsResult> result =
                LocationServices.SettingsApi.checkLocationSettings(mGoogleApiClient, builder.build());
        result.setResultCallback(new ResultCallback<LocationSettingsResult>() {
            @Override
            public void onResult(LocationSettingsResult result) {
                final Status status = result.getStatus();
                final LocationSettingsStates state = result.getLocationSettingsStates();
                switch (status.getStatusCode()) {
                    case LocationSettingsStatusCodes.SUCCESS:
// All location settings are satisfied. The client can initialize location
// requests here.

                        Log.e("SUCCESS", "SUCCESS");
                        startMyService(isStart);
                        break;
                    case LocationSettingsStatusCodes.RESOLUTION_REQUIRED:

                        Log.e("SUCCESS", "RESOLUTION_REQUIRED");
// Location settings are not satisfied. But could be fixed by showing the user
// a dialog.
                        try {
// Show the dialog by calling startResolutionForResult(),
// and check the result in onActivityResult().
                            status.startResolutionForResult(MainActivity.this, REQUEST_CHECK_SETTINGS);
                        } catch (IntentSender.SendIntentException e) {
                            e.printStackTrace();
// Ignore the error.
                        }
                        break;
                    case LocationSettingsStatusCodes.SETTINGS_CHANGE_UNAVAILABLE:
                        Log.e("SUCCESS", "SETTINGS_CHANGE_UNAVAILABLE");
// Location settings are not satisfied. However, we have no way to fix the
// settings so we won't show the dialog.
                        Toast.makeText(MainActivity.this, "Please turn on GPS", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
    }

    private void startMyService(final boolean isStart) {
        if (isStart && mService != null) {
            mService.requestLocationUpdates();
        } else Log.e(TAG, "Not null");
    }

    private void stoptMyService() {
        if (mService != null) {
            mService.removeLocationUpdates();
        } else Log.e(TAG, "Not null");
    }



}
