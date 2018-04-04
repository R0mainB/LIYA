package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import adventure.liya.mgr.com.liya.enumeration.EffetEnum;

@Entity(tableName = "T_EFFET")
public class Effet {

    @PrimaryKey(autoGenerate = true)
    private long id;
    @ColumnInfo(name = "LIBELLE")
    private String libelle;
    @ColumnInfo(name = "POUVOIR")
    private EffetEnum pouvoir;
    @ColumnInfo(name = "VALEUR")
    private float valeur;

    public Effet() {
    }

    public Effet(long id, String libelle, EffetEnum pouvoir, float valeur) {
        this.id = id;
        this.libelle = libelle;
        this.pouvoir = pouvoir;
        this.valeur = valeur;
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

    public EffetEnum getPouvoir() {
        return pouvoir;
    }

    public void setPouvoir(EffetEnum pouvoir) {
        this.pouvoir = pouvoir;
    }

    public float getValeur() {
        return valeur;
    }

    public void setValeur(float valeur) {
        this.valeur = valeur;
    }
}
