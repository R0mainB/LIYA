package adventure.liya.mgr.com.liya.tools;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;

import org.json.JSONObject;

import java.io.IOException;

import adventure.liya.mgr.com.liya.model.Aventure;

/**
 * Created by mblandin2016 on 05/04/2018.
 */

public class GestionJsonAventure {
    public void lireJsonAventure(final Aventure aventure,Context context, String url){
        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {

                            Moshi moshi = new Moshi.Builder().build();
                            JsonAdapter<Aventure> jsonAdapter = moshi.adapter(Aventure.class);

                            Aventure a = jsonAdapter.fromJson(response.toString());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }
        );
        RequestQueue queue = Volley.newRequestQueue(context);
        queue.add(request);
    }
}
