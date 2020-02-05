package com.app.tripdetails.API;


import com.app.tripdetails.model.PolylineRouteResp;



import java.util.HashMap;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface ApiInterface {





    @GET("/maps/api/directions/json")
    Call<PolylineRouteResp> getPolylineResp(@Query("origin") String origin,
                                            @Query("destination") String destination,
                                            @Query("key") String key);



}