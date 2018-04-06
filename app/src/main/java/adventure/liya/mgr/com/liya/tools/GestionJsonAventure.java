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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import adventure.liya.mgr.com.liya.enumeration.EffetEnum;
import adventure.liya.mgr.com.liya.model.Action;
import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.model.Effet;
import adventure.liya.mgr.com.liya.model.Equipement;
import adventure.liya.mgr.com.liya.model.Inventaire;
import adventure.liya.mgr.com.liya.model.Objet;
import adventure.liya.mgr.com.liya.model.Peripetie;
import adventure.liya.mgr.com.liya.model.Personnage;
import adventure.liya.mgr.com.liya.model.Sortilege;
import adventure.liya.mgr.com.liya.model.Specialite;
import adventure.liya.mgr.com.liya.model.Statistique;

/**
 * Created by mblandin2016 on 05/04/2018.
 */

public class GestionJsonAventure {
    public static void lireJsonAventure(final Aventure aventure,Context context, String url){
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
                            System.out.println(a);
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
