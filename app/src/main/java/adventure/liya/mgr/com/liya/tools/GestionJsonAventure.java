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
import adventure.liya.mgr.com.liya.model.Effet;
import adventure.liya.mgr.com.liya.model.Equipement;
import adventure.liya.mgr.com.liya.model.Inventaire;
import adventure.liya.mgr.com.liya.model.Objet;
import adventure.liya.mgr.com.liya.model.Peripetie;
import adventure.liya.mgr.com.liya.model.Personnage;
import adventure.liya.mgr.com.liya.model.Sortilege;
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

    private static final String NOEUD_SPECIALITE = "specialite";
    private static final String SPECIALITE_STATISTIQUE = "libelle";

    private static final String NOEUD_SORTILEGES = "sortileges";
    private static final String SORTILEGES_LIBELLE = "libelle";
    private static final String SORTILEGES_COUT_MAGIE = "coutMagie";
    private static final String SORTILEGES_DEGAT_MIN = "degatMin";
    private static final String SORTILEGES_LVL_REQUIS = "niveauRequis";

    private static final String NOEUD_INVENTAIRE = "inventaire";
    private static final String INVENTAIRE_NOM = "nom";
    private static final String INVENTAIRE_NB_SLOT = "nbSlot";

    private static final String NOEUD_EQUIPEMENT = "equipement";
    private static final String EQUIPEMENT_NOM = "nom";
    private static final String EQUIPEMENT_TYPE = "type";
    private static final String EQUIPEMENT_BONUS = "bonus";
    private static final String EQUIPEMENT_LVL_REQUIS = "niveauRequis";

    private static final String NOEUD_OBJET = "objet";
    private static final String OBJET_LIBELLE = "libelle";
    private static final String OBJET_DESCRIPTION= "description";

    private static final String NOEUD_EFFET = "effet";
    private static final String EFFET_LIBELLE = "libelle";
    private static final String EFFET_POUVOIR = "pouvoir";
    private static final String EFFET_VALEUR = "valeur";

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
            aventure.setPersonnages((List<Personnage>)(Personnage) chargerListe(json.getJSONArray(NOEUD_PERSONNAGE),NOEUD_PERSONNAGE));
            aventure.setHistoires((List<Peripetie>) (Peripetie) chargerListe(json.getJSONArray(NOEUD_PERIPETIES),NOEUD_PERIPETIES));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static <T> List<T> chargerListe(JSONArray jsonArray, String noeud){
        List<T> listeObjet = new ArrayList<>();
        try {
            for(int i = 0; i < jsonArray.length() ;i++){
                switch (noeud){
                    case NOEUD_PERIPETIES:
                        listeObjet.add((T)creerPeripetie(jsonArray.getJSONObject(i)));
                        break;
                    case NOEUD_ACTIONS:
                        listeObjet.add((T)creerAction(jsonArray.getJSONObject(i)));
                        break;
                    case NOEUD_PERSONNAGE:
                        listeObjet.add((T)creerPersonnage(jsonArray.getJSONObject(i)));
                        break;
                    case NOEUD_STATISTIQUES:
                        listeObjet.add((T)creerStatistique(jsonArray.getJSONObject(i)));
                    case NOEUD_INVENTAIRE:
                        listeObjet.add((T)creerInventaire(jsonArray.getJSONObject(i)));
                        break;
                    case NOEUD_EQUIPEMENT:
                        listeObjet.add((T)creerEquipement(jsonArray.getJSONObject(i)));
                        break;
                    case NOEUD_OBJET:
                        listeObjet.add((T)creerObjet(jsonArray.getJSONObject(i)));
                        break;
                    case NOEUD_EFFET:
                        listeObjet.add((T)creerEffet(jsonArray.getJSONObject(i)));
                        break;
                    case NOEUD_SORTILEGES:
                        listeObjet.add((T)creerSortilege(jsonArray.getJSONObject(i)));
                        break;
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return listeObjet;
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
            p.setStatistiques((List<Statistique>)(Statistique) chargerListe(json.getJSONArray(NOEUD_STATISTIQUES),NOEUD_STATISTIQUES));

        } catch (JSONException e) {
            e.printStackTrace();
        }
        return p;
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
    //On créer une péripétie
    private static Peripetie creerPeripetie(JSONObject json){
        Peripetie p = new Peripetie();
        try {
            p.setDescription(json.getString(PERIPETIE_DESCRIPTION));
            p.setActions((List<Action>) (Action) chargerListe(json.getJSONArray(NOEUD_ACTIONS),NOEUD_ACTIONS));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return p;
    }
    private static Action creerAction(JSONObject json) {
        Action a = new Action();
        try {
            a.setTitre(json.getString(ACTION_TITRE));
            a.setDescription(json.getString(ACTION_DESCRIPTION));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return a;
    }
    //On créer un inventaire
    private static Inventaire creerInventaire(JSONObject json){
        Inventaire i = new Inventaire();
        try {
            i.setLibelle(json.getString(INVENTAIRE_NOM));
            i.setNbSlot(json.getString(INVENTAIRE_NB_SLOT));
            i.setEquipements((List<Equipement>) (Equipement) chargerListe(json.getJSONArray(NOEUD_EQUIPEMENT),NOEUD_EQUIPEMENT));
            i.setObjets((List<Objet>) (Objet) chargerListe(json.getJSONArray(NOEUD_EQUIPEMENT),NOEUD_EQUIPEMENT));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return i;
    }

    private static Equipement creerEquipement(JSONObject json){
        Equipement equip = new Equipement();
        try {
            equip.setNom(json.getString(EQUIPEMENT_NOM));
            equip.setType(json.getString(EQUIPEMENT_TYPE));
            equip.setBonus(json.getString(EQUIPEMENT_BONUS));
            equip.setNiveauRequis(json.getString(EQUIPEMENT_LVL_REQUIS));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return equip;
    }
    private static Objet creerObjet(JSONObject json){
        Objet o = new Objet();
        try {
            o.setLibelle(json.getString(OBJET_LIBELLE));
            o.setDescription(json.getString(OBJET_DESCRIPTION));
            o.setEffets((List<Effet>) (Effet) chargerListe(json.getJSONArray(NOEUD_EFFET),NOEUD_EFFET));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return o;
    }
    private static Effet creerEffet(JSONObject json){
        Effet effet = new Effet();
        try {
            effet.setLibelle(json.getString(EFFET_LIBELLE));
            effet.setPouvoir(json.getInt(EFFET_POUVOIR));
            effet.setValeur(json.getInt(EFFET_VALEUR));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return effet;
    }
    private static Sortilege creerSortilege(JSONObject json){
        Sortilege s = new Sortilege();
        try {
            s.setLibelle(json.getString(SORTILEGES_LIBELLE));
            s.setCoutMagie(json.getInt(SORTILEGES_COUT_MAGIE));
            s.setDegatMin(json.getInt(SORTILEGES_DEGAT_MIN));
            s.setNiveauRequis(json.getInt(SORTILEGES_LVL_REQUIS));
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return s;
    }
}
