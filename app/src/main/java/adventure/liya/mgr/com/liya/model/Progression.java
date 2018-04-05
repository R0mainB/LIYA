package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by Maxouxou on 03/04/2018.
 */

@Entity(tableName = "T_PROGRESSION",
        foreignKeys = {@ForeignKey(entity = Personnage.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERSONNAGE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Aventure.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_AVENTURE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Peripetie.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERIPETIE",
                                    onDelete = CASCADE)})
public class Progression {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    @Ignore
    private Personnage personnage;
    @ColumnInfo(name = "ID_AVENTURE")
    private long idAventure;
    @Ignore
    private Aventure aventure;
    @ColumnInfo(name = "ID_PERIPETIE")
    private long idPeripetie;

    public Progression() {
    }

    public Progression(long id, long idPersonnage, Personnage personnage, long idAventure, Aventure aventure, long idPeripetie) {
        this.id = id;
        this.idPersonnage = idPersonnage;
        this.personnage = personnage;
        this.idAventure = idAventure;
        this.aventure = aventure;
        this.idPeripetie = idPeripetie;
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
}
