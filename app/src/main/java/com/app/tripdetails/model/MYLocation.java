package com.app.tripdetails.model;

import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import com.app.tripdetails.db.GithubTypeConverters;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity(tableName = "MYLocation")
public class MYLocation implements Serializable {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "Name")
    public String mName;

    @ColumnInfo(name = "StartLocation")
    public String mStartLocation;

    @ColumnInfo(name = "EndLocation")
    public String mEndLocation;

    @ColumnInfo(name = "StartDate")
    public String mStartDate;

    @ColumnInfo(name = "EndDate")
    public String mEndDate;


    @ColumnInfo(name = "StartLatitude")
    public String mStartLatitude;

    @ColumnInfo(name = "StartLongitude")
    public String mStartLongitude;

    @ColumnInfo(name = "EndLatitude")
    public String mEndLatitude;

    @ColumnInfo(name = "EndLongitude")
    public String mEndLongitude;

    @TypeConverters(GithubTypeConverters.class)
    public  List<UserLocation> userLocations=new ArrayList<>();


    public List<UserLocation> getUserLocations() {
        return userLocations;
    }

    public MYLocation() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmStartLocation() {
        return mStartLocation;
    }

    public void setmStartLocation(String mStartLocation) {
        this.mStartLocation = mStartLocation;
    }

    public String getmEndLocation() {
        return mEndLocation;
    }

    public void setmEndLocation(String mEndLocation) {
        this.mEndLocation = mEndLocation;
    }

    public String getmStartLatitude() {
        return mStartLatitude;
    }

    public void setmStartLatitude(String mStartLatitude) {
        this.mStartLatitude = mStartLatitude;
    }

    public String getmStartLongitude() {
        return mStartLongitude;
    }

    public void setmStartLongitude(String mStartLongitude) {
        this.mStartLongitude = mStartLongitude;
    }

    public String getmStartDate() {
        return mStartDate;
    }

    public void setmStartDate(String mStartDate) {
        this.mStartDate = mStartDate;
    }

    public String getmEndDate() {
        return mEndDate;
    }

    public void setmEndDate(String mEndDate) {
        this.mEndDate = mEndDate;
    }

    public String getmEndLatitude() {
        return mEndLatitude;
    }

    public void setmEndLatitude(String mEndLatitude) {
        this.mEndLatitude = mEndLatitude;
    }

    public String getmEndLongitude() {
        return mEndLongitude;
    }

    public void setmEndLongitude(String mEndLongitude) {
        this.mEndLongitude = mEndLongitude;
    }
}
