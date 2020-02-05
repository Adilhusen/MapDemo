package com.app.tripdetails.API;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Created by vishal on 20/3/17.
 */

/**
 * @Warning -> READ First
 * Why this needed ->from server side responce when "data" field having No data it return like
 * {"data":[]} (blanck)  they dont care about either "data" success with Full jsobObject or JsonArray
 * <p>
 * So I had make this typeadapter
 * <p>
 * when {"data":[]}  i just remove this field.
 * <p>
 * Happy coding :)  Vishal P@tel
 */


public class ItemTypeAdapterFactory implements TypeAdapterFactory {

    public <T> TypeAdapter<T> create(Gson gson, final TypeToken<T> type) {

        final TypeAdapter<T> delegate = gson.getDelegateAdapter(this, type);
        final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);

        return new TypeAdapter<T>() {

            public void write(JsonWriter out, T value) throws IOException {
                delegate.write(out, value);
            }

            public T read(JsonReader in) throws IOException {

                JsonElement jsonElement = elementAdapter.read(in);
                if (jsonElement.isJsonObject()) {
                    JsonObject jsonObject = jsonElement.getAsJsonObject();
                    if (jsonObject.has("data")) {
                        if (jsonObject.get("data").isJsonArray()) {

                            /**
                             * when its size 0 means
                             * status code  401,422,404,400
                             *
                             * in One case
                             * 200 - Success
                             * but having [] blanck
                             *
                             * hahaha who care GSON is made for that Charsss!!! :P
                             *
                             *
                             */
                            Log.e("array->",""+jsonObject.getAsJsonArray("data").size());

                            if (jsonObject.getAsJsonArray("data").size() == 0)
                            {
                                jsonObject.remove("data");
                            }
                        }
                    }
                }

                return delegate.fromJsonTree(jsonElement);
            }
        }.nullSafe();
    }
}
