package com.app.tripdetails.db;




import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.app.tripdetails.model.MYLocation;
import com.app.tripdetails.model.UserLocation;


@Database(entities = {MYLocation.class, UserLocation.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();
}