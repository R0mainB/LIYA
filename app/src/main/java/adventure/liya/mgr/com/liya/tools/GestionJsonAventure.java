package adventure.liya.mgr.com.liya.tools;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import adventure.liya.mgr.com.liya.model.Action;
import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.model.Peripetie;
import adventure.liya.mgr.com.liya.model.Personnage;
import adventure.liya.mgr.com.liya.model.Statistique;

/**
 * Created by mblandin2016 on 05/04/2018.
 */

public class GestionJsonAventure {
    private static final String NOEUD_AVENTURE = "aventure";
    private static final String AVENTURE_LIBELLE = "libelle";
    private static final String AVENTURE_DESCRIPTION = "description";

    private static final String NOEUD_PERSONNAGE = "personnages";
    private static final String PERSONNAGE_NOM = "nom";
    private static final String PERSONNAGE_VIE = "pointVie";
    private static final String PERSONNAGE_MAGIE = "pointMagie";
    private static final String PERSONNAGE_CLASSE = "classe";
    private static final String PERSONNAGE_HEROS = "estHeros";
    private static final String PERSONNAGE_NIVEAU = "niveau";

    private static final String NOEUD_STATISTIQUES = "statistiques";
    private static final String STATISTIQUE_LIBELLE = "libelle";
    private static final String STATISTIQUE_POURCENTAGE = "pourcentage";

    private static final String NOEUD_PERIPETIES = "peripeties";
    private static final String PERIPETIE_DESCRIPTION = "description";

    private static final String NOEUD_ACTIONS = "actions";
    private static final String ACTION_TITRE ="titre";
    private static final String ACTION_DESCRIPTION = "description";

    public static void lireJsonAventure(final Aventure aventure,Context context, String url){
        JsonObjectRequest request = new JsonObjectRequest(
                Request.Method.GET,
                url,
                null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONObject aventureJson = response.getJSONObject(NOEUD_AVENTURE);
                            if(aventureJson !=null){
                                instancierAventure(aventureJson, aventure);
                            }
                        } catch (JSONException e) {
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

    private static void instancierAventure(JSONObject json, Aventure aventure){
        try {
            aventure.setLibelle(json.getString(AVENTURE_LIBELLE));
            aventure.setDescription(json.getString(AVENTURE_DESCRIPTION));
            aventure.setPersonnages(chargerPersonnages(json.getJSONArray(NOEUD_PERSONNAGE)));
            aventure.setHistoires(chargerPeripeties(json.getJSONArray(NOEUD_PERIPETIES)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    //On créer la liste des personnages
    private static List<Personnage> chargerPersonnages(JSONArray jsonArray){
        List<Personnage> personnages = new ArrayList<>();
            try {
                for(int i = 0; i < jsonArray.length() ;i++){
                    personnages.add(creerPersonnage(jsonArray.getJSONObject(i)));
                }
            } catch (JSONException e) {
                e.printStackTrace();
        }
        return personnages;
    }
    //On créer le personnage à ajouter à la liste
    private static Personnage creerPersonnage(JSONObject json){
        Personnage p = new Personnage();
        try {
            p.setNom(json.getString(PERSONNAGE_NOM));
            p.setPointVie(json.getInt(PERSONNAGE_VIE));
            p.setPointMagie(json.getInt(PERSONNAGE_MAGIE));
            p.setClasse(json.getString(PERSONNAGE_CLASSE));
            p.setHeros(json.getBoolean(PERSONNAGE_HEROS));
            p.setNiveau(json.getInt(PERSONNAGE_NIVEAU));
            p.setStatistiques(chargerStatistiques(json.getJSONArray(NOEUD_STATISTIQUES)));

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return p;
    }
    //On créer la liste de statistique du personnage
    private static List<Statistique> chargerStatistiques(JSONArray jsonArray){
        List<Statistique> statistiques = new ArrayList<>();
        try {
            for(int i= 0;i <jsonArray.length();i++){
                statistiques.add(creerStatistique(jsonArray.getJSONObject(i)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return statistiques;
    }
    //On créer une statistique
    private static Statistique creerStatistique(JSONObject json){
        Statistique s = new Statistique();
        try {
            s.setLibelle(json.getString(STATISTIQUE_LIBELLE));
            s.setPourcentage(json.getInt(STATISTIQUE_POURCENTAGE));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }
    //On créer une liste de péripétie pour l'aventure
    private static List<Peripetie> chargerPeripeties(JSONArray jsonArray){
        List<Peripetie> peripeties = new ArrayList<>();
        try {
            for(int i= 0;i <jsonArray.length();i++){
                peripeties.add(creerPeripetie(jsonArray.getJSONObject(i)));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return peripeties;
    }
    //On créer une péripétie
    private static Peripetie creerPeripetie(JSONObject json){
        Peripetie p = new Peripetie();
        try {
            p.setDescription(json.getString(PERIPETIE_DESCRIPTION));
            p.setActions(chargerActions(json.getJSONArray(NOEUD_ACTIONS)));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return p;
    }
    //On créer la liste d'actions d'une péripétie
    private static List<Action> chargerActions(JSONArray jsonArray){
        List<Action> actions = new ArrayList<>();
        try {
            for(int i= 0;i <jsonArray.length();i++){
                actions.add(creerAction(jsonArray.getJSONObject(i),i));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return actions;
    }
    //On créer une action
    private static Action creerAction(JSONObject json,int i){
        Action a = new Action();
        try {
            a.setTitre(json.getString(ACTION_TITRE));
            a.setDescription(json.getString(ACTION_DESCRIPTION));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return a;
    }



}
