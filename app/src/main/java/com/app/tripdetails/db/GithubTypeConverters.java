package com.app.tripdetails.db;

import androidx.room.TypeConverter;

import com.app.tripdetails.model.UserLocation;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

public class GithubTypeConverters {
    
    static Gson gson = new Gson();
    
    @TypeConverter
    public static List<UserLocation> stringToSomeObjectList(String data) {
        if (data == null) {
            return Collections.emptyList();
        }

        Type listType = new TypeToken<List<UserLocation>>() {}.getType();

        return gson.fromJson(data, listType);
    }

    @TypeConverter
    public static String someObjectListToString(List<UserLocation> someObjects) {
        return gson.toJson(someObjects);
    }
}