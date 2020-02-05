package com.app.tripdetails.adapter;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.app.tripdetails.R;
import com.app.tripdetails.db.DatabaseClient;
import com.app.tripdetails.model.MYLocation;
import com.app.tripdetails.ui.MapsActivity;
import com.app.tripdetails.utils.Pref;
import com.app.tripdetails.utils.Utils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TripDetailsAdapter extends RecyclerView.Adapter<TripDetailsAdapter.ViewHolder> {
    private List<MYLocation> list = new ArrayList<>();
    private Context activity;


    public TripDetailsAdapter(List<MYLocation> list, Context activity) {
        this.list = list;
        this.activity = activity;
    }

    public List<MYLocation> getList() {
        return list;
    }


    public void setList(List<MYLocation> list) {
        this.list = list;


        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public TripDetailsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_trip, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull TripDetailsAdapter.ViewHolder holder, final int position) {
        final MYLocation singleData = list.get(position);

        if (singleData != null) {

            String name = singleData.getmName();
            String startLocation = singleData.getmStartLocation();
            String endLocation = singleData.getmEndLocation();
            String startDate = singleData.getmStartDate();
            String endDate = singleData.getmEndDate();

            holder.tvTripName.setText(!TextUtils.isEmpty(name) ? name : "-");

            holder.tvTripStartDate.setText(!TextUtils.isEmpty(startDate) ? startDate : "-");
            holder.tvTripEndDate.setText(!TextUtils.isEmpty(endDate) ? endDate : "-");

            holder.tvTripSource.setText(!TextUtils.isEmpty(startLocation) ? startLocation : "-");
            holder.tvTripDestination.setText(!TextUtils.isEmpty(endLocation) ? endLocation : "-");


            String startLat = singleData.getmStartLatitude();
            String startLng = singleData.getmStartLongitude();
            String endLat = singleData.getmEndLatitude();
            String endLng = singleData.getmEndLongitude();

            if (!TextUtils.isEmpty(startLat) && !TextUtils.isEmpty(startLng)) {
                holder.tvGoMap.setVisibility(View.VISIBLE);
                if (TextUtils.isEmpty(endDate)) {
                    holder.tvEndTrip.setVisibility(View.VISIBLE);
                } else {
                    holder.tvEndTrip.setVisibility(View.GONE);
                }
            } else {
                holder.tvGoMap.setVisibility(View.GONE);
            }
        }

        holder.tvGoMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String startLat = list.get(position).getmStartLatitude();
                String startLng = list.get(position).getmStartLongitude();

                String endLat = list.get(position).getmEndLatitude();
                String endLng = list.get(position).getmEndLongitude();

                if (!TextUtils.isEmpty(startLat) && !TextUtils.isEmpty(startLng) && !TextUtils.isEmpty(endLat) && !TextUtils.isEmpty(endLng)) {
                    try {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://maps.google.com/maps?saddr=" + startLat + "," + startLng + "&daddr=" + endLat + "," + endLng + ""));
                        activity.startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else if (!TextUtils.isEmpty(startLat) && !TextUtils.isEmpty(startLng)) {
                    try {

                        Intent intent = new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://maps.google.com/maps?saddr=" + startLat + "," + startLng + "&daddr=" + startLat + "," + startLng + ""));
                        activity.startActivity(intent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                else {
                    Toast.makeText(activity, "Unable to redirect, Location not found.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        holder.tvEndTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                updateTask(list.get(position));
            }
        });

        holder.main_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                MYLocation data = list.get(position);
                if (data != null) {
                    String startLat = list.get(position).getmStartLatitude();
                    String startLng = list.get(position).getmStartLongitude();

                    String endLat = list.get(position).getmEndLatitude();
                    String endLng = list.get(position).getmEndLongitude();
                    if (!TextUtils.isEmpty(startLat) && !TextUtils.isEmpty(startLng) && !TextUtils.isEmpty(endLat) && !TextUtils.isEmpty(endLng)) {
                        Intent intent = new Intent(activity, MapsActivity.class);
                        intent.putExtra(MapsActivity.MYDATA, data);
                        activity.startActivity(intent);
                    } else {
                        Toast.makeText(activity, "First of all End trip", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(activity, "Something went wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private void updateTask(final MYLocation task) {


        class SaveTask extends AsyncTask<Void, Void, Void> {

            @Override
            protected Void doInBackground(Void... voids) {

                //creating a task

                String endLat = Pref.getValue(activity, Utils.MY_CURRENT_LAT, "");
                String endLong = Pref.getValue(activity, Utils.MY_CURRENT_LNG, "");


               // task.setmEndLatitude(endLat);
               // task.setmEndLongitude(endLong);
                //  task.setmEndLocation("");
                task.setmEndDate(Utils.getCurrentDateTime(""));


                //adding to database
                DatabaseClient.getInstance(activity).getAppDatabase().taskDao().update(task);
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);

                Toast.makeText(activity, "Trip Ended Successfully.", Toast.LENGTH_LONG).show();
                notifyDataSetChanged();
            }
        }

        SaveTask st = new SaveTask();
        st.execute();
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        LinearLayout main_view;
        public TextView tvTripName, tvTripSource, tvTripDestination, tvTripStartDate, tvTripEndDate, tvEndTrip, tvGoMap;

        public ViewHolder(@NonNull View view) {
            super(view);
            main_view = view.findViewById(R.id.main_view);
            tvEndTrip = view.findViewById(R.id.tvEndTrip);
            tvEndTrip.setVisibility(View.GONE);
            tvGoMap = view.findViewById(R.id.tvGoMap);

            tvTripName = view.findViewById(R.id.tvTripName);
            tvTripSource = view.findViewById(R.id.tvTripSource);
            tvTripDestination = view.findViewById(R.id.tvTripDestination);
            tvTripStartDate = view.findViewById(R.id.tvTripStartDate);
            tvTripEndDate = view.findViewById(R.id.tvTripEndDate);


        }
    }
}
