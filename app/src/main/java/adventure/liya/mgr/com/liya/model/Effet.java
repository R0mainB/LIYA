package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverter;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;

import java.util.UUID;

import adventure.liya.mgr.com.liya.enumeration.EffetEnum;
import adventure.liya.mgr.com.liya.tools.EffetConvertisseur;

@Entity(tableName = "T_EFFET")
public class Effet {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "LIBELLE")
    private String libelle;
    @ColumnInfo(name = "POUVOIR")
    @TypeConverters(EffetConvertisseur.class)
    private EffetEnum pouvoir;
    @ColumnInfo(name = "VALEUR")
    private float valeur;

    public Effet() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Effet(String id, String libelle, EffetEnum pouvoir, float valeur) {
        this.id = id;
        this.libelle = libelle;
        this.pouvoir = pouvoir;
        this.valeur = valeur;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
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
