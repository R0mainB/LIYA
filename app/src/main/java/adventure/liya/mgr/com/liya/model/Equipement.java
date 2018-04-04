package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "T_EQUIPEMENT")
public class Equipement {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "NOM")
    private String nom;
    @ColumnInfo(name = "NIVEAU_POUR_EQUIPER")
    private int niveauPourEquiper;
    @Ignore
    private List<Statistique> statistiques;

    public Equipement() {
    }

    @Ignore
    public Equipement(long id, String nom, int niveauPourEquiper, List<Statistique> statistiques) {
        this.id = id;
        this.nom = nom;
        this.niveauPourEquiper = niveauPourEquiper;
        this.statistiques = statistiques;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNiveauPourEquiper() {
        return niveauPourEquiper;
    }

    public void setNiveauPourEquiper(int niveauPourEquiper) {
        this.niveauPourEquiper = niveauPourEquiper;
    }

    public List<Statistique> getStatistiques() {
        return statistiques;
    }

    public void setStatistiques(List<Statistique> statistiques) {
        this.statistiques = statistiques;
    }
}
