package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by rbonhomme2016 on 04/04/2018.
 */

@Entity(tableName = "T_INVENTAIRE")
public class Inventaire {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "LIBELLE")
    private String libelle;
    @ColumnInfo(name = "NB_PLACES")
    private int nbPlaces;

    public Inventaire() {
    }

    public Inventaire(long id, String libelle, int nbPlaces) {
        this.id = id;
        this.libelle = libelle;
        this.nbPlaces = nbPlaces;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public int getNbPlaces() {
        return nbPlaces;
    }

    public void setNbPlaces(int nbPlaces) {
        this.nbPlaces = nbPlaces;
    }
}
