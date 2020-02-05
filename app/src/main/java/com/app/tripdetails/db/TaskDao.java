package com.app.tripdetails.db;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.app.tripdetails.model.MYLocation;
import com.app.tripdetails.model.UserLocation;
import com.google.android.gms.tasks.Task;

import java.util.List;

@Dao
public interface TaskDao {

    @Query("SELECT * FROM MYLocation")
    List<MYLocation> getAll();


    @Query("SELECT * FROM UserLocation where UserLocation.tripID =:mid")
    List<UserLocation> getLatLongList(int mid);

    @Query("DELETE FROM MYLocation")
    public void deleteTable();

    @Insert
    void insert(MYLocation task);

    @Delete
    void delete(MYLocation task);

    @Update
    void update(MYLocation task);

    @Insert
    void insert(UserLocation userLocation);






}