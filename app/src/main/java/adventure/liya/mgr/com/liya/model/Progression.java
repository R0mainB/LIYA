package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

/**
 * Created by Maxouxou on 03/04/2018.
 */

@Entity(tableName = "T_PROGRESSION")
public class Progression {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    private Personnage personnage;
    @ColumnInfo(name = "ID_AVENTURE")
    private long idAventure;
    private Aventure aventure;
    @ColumnInfo(name = "ID_PERIPETIE")
    private long idPeripetie;
    private Peripetie peripetie;
    private List<Action> actions;

    public Progression() {
    }

    public Progression(long id, long idPersonnage, Personnage personnage, long idAventure, Aventure aventure, long idPeripetie, Peripetie peripetie, List<Action> actions) {
        this.id = id;
        this.idPersonnage = idPersonnage;
        this.personnage = personnage;
        this.idAventure = idAventure;
        this.aventure = aventure;
        this.idPeripetie = idPeripetie;
        this.peripetie = peripetie;
        this.actions = actions;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public long getIdAventure() {
        return idAventure;
    }

    public void setIdAventure(long idAventure) {
        this.idAventure = idAventure;
    }

    public Aventure getAventure() {
        return aventure;
    }

    public void setAventure(Aventure aventure) {
        this.aventure = aventure;
    }

    public long getIdPeripetie() {
        return idPeripetie;
    }

    public void setIdPeripetie(long idPeripetie) {
        this.idPeripetie = idPeripetie;
    }

    public Peripetie getPeripetie() {
        return peripetie;
    }

    public void setPeripetie(Peripetie peripetie) {
        this.peripetie = peripetie;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }
}
