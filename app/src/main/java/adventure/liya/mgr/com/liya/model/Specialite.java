package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;
import java.util.UUID;

@Entity(tableName = "T_SPECIALITE")
public class Specialite {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "LIBELLE")
    private String libelle;
    @Ignore
    private List<Statistique> statistiques;

    public Specialite() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Specialite(String id, String libelle, List<Statistique> statistiques) {
        this.id = id;
        this.libelle = libelle;
        this.statistiques = statistiques;
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

    public List<Statistique> getStatistiques() {
        return statistiques;
    }

    public void setStatistiques(List<Statistique> statistiques) {
        this.statistiques = statistiques;
    }
}
