package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

/**
 * Created by Maxouxou on 03/04/2018.
 */

@Entity(tableName = "T_AVENTURE")
public class Aventure {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "LIBELLE")
    private String libelle;
    @ColumnInfo(name = "DESCRIPTION")
    private String description;
    @Ignore
    private List<Personnage> personnages;
    @Ignore
    private List<Peripetie> peripeties;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(List<Personnage> personnages) {
        this.personnages = personnages;
    }

    public List<Peripetie> getHistoires() {
        return peripeties;
    }

    public void setHistoires(List<Peripetie> histoires) {
        this.peripeties = histoires;
    }

    public Aventure(){}
    public Aventure(String libelle, String description){
        this.libelle = libelle;
        this.description = description;
    }

    @Ignore
    public Aventure(long id, String libelle,String description, List<Personnage> personnages, List<Peripetie> histoires) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.personnages = personnages;
        this.peripeties = histoires;
    }
}
