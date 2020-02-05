package com.app.tripdetails.API;

import android.os.Build;
import android.text.TextUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Mohit on 10/2/17.
 */

public class ApiClient {




    public final static String MAP_URL = "https://maps.googleapis.com/";

    private static Retrofit retrofit = null;

    public static ApiInterface getClient() {
        if (retrofit == null) {
            /**
             * HttpLogginInterceptor :An OkHttp interceptor which logs request and response information
             */
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

            OkHttpClient client;
            if (isEmulator()) {
                client = UnsafeOkHttpClient.getUnsafeOkHttpClient(interceptor);


            } else {
                client = new OkHttpClient.Builder()
                        .readTimeout(200, TimeUnit.SECONDS)
                        .connectTimeout(200, TimeUnit.SECONDS).addInterceptor(interceptor)
                        .build();
            }
            /*OkHttpClient client = new OkHttpClient.Builder()
                    .readTimeout(200, TimeUnit.SECONDS)
                    .connectTimeout(200, TimeUnit.SECONDS).addInterceptor(interceptor)
                    .build();*/
            Gson gson = new GsonBuilder().setLenient().registerTypeAdapterFactory(new ItemTypeAdapterFactory()).create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(MAP_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(client)
                    .build();
        }
        return retrofit.create(ApiInterface.class);
    }



    public static boolean isEmulator() {
        return Build.FINGERPRINT.startsWith("generic")
                || Build.FINGERPRINT.startsWith("unknown")
                || Build.MODEL.contains("google_sdk")
                || Build.MODEL.contains("Emulator")
                || Build.MODEL.contains("Android SDK built for x86")
                || Build.MANUFACTURER.contains("Genymotion")
                || (Build.BRAND.startsWith("generic")
                && Build.DEVICE.startsWith("generic"))
                || "google_sdk".equals(Build.PRODUCT);
    }


}
