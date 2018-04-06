package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;
import java.util.UUID;

/**
 * Created by rbonhomme2016 on 04/04/2018.
 */

@Entity(tableName = "T_INVENTAIRE")
public class Inventaire {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "NOM")
    private String nom;
    @ColumnInfo(name = "NB_SLOT")
    private int nbSlot;
    @Ignore
    private List<Equipement> equipements;
    @Ignore
    private List<Objet> objets;

    public Inventaire() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Inventaire(String id, String nom, int nbSlot, List<Equipement> equipements, List<Objet> objets) {
        this.id = id;
        this.nom = nom;
        this.nbSlot = nbSlot;
        this.equipements = equipements;
        this.objets = objets;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbSlot() {
        return nbSlot;
    }

    public void setNbSlot(int nbSlot) {
        this.nbSlot = nbSlot;
    }

    public List<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }

    public List<Objet> getObjets() {
        return objets;
    }

    public void setObjets(List<Objet> objets) {
        this.objets = objets;
    }
}
