package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;
import java.util.UUID;

@Entity(tableName = "T_EQUIPEMENT")
public class Equipement {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "NOM")
    private String nom;
    @ColumnInfo(name = "TYPE")
    private String type;
    @ColumnInfo(name = "BONUS")
    private int bonus;
    @ColumnInfo(name = "NIVEAU_REQUIS")
    private int niveauRequis;


    public Equipement() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Equipement(String id, String nom, String type, int bonus, int niveauRequis) {
        this.id = id;
        this.nom = nom;
        this.type = type;
        this.bonus = bonus;
        this.niveauRequis = niveauRequis;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getNiveauRequis() {
        return niveauRequis;
    }

    public void setNiveauRequis(int niveauRequis) {
        this.niveauRequis = niveauRequis;
    }
}
