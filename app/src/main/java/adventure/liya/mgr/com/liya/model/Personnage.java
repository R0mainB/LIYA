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

@Entity(tableName = "T_PERSONNAGE")
public class Personnage {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "NOM")
    private String nom;
    @ColumnInfo(name = "POINT_DE_VIE")
    private int pointVie;
    @ColumnInfo(name = "POINT_DE_MAGIE")
    private int pointMagie;
    @ColumnInfo(name = "CLASSE")
    private String classe;
    @ColumnInfo(name = "EST_HEROS")
    private boolean heros;

    @Ignore
    private List<Equipement> equipements;
    @Ignore
    private List<Sortilege> sortileges;
    @Ignore
    private List<Statistique> statistiques;
    private int niveau;

    public Personnage() {
    }

    @Ignore
    public Personnage(long id, String nom, int pointVie, int pointMagie, String classe, boolean heros, List<Equipement> equipements,
                      List<Sortilege> sortileges, List<Statistique> statistiques, int niveau) {
        this.id = id;
        this.nom = nom;
        this.pointVie = pointVie;
        this.pointMagie = pointMagie;
        this.classe = classe;
        this.heros = heros;
        this.equipements = equipements;
        this.sortileges = sortileges;
        this.statistiques = statistiques;
        this.niveau = niveau;
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

    public int getPointVie() {
        return pointVie;
    }

    public void setPointVie(int pointVie) {
        this.pointVie = pointVie;
    }

    public int getPointMagie() {
        return pointMagie;
    }

    public void setPointMagie(int pointMagie) {
        this.pointMagie = pointMagie;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public boolean isHeros() {
        return heros;
    }

    public void setHeros(boolean heros) {
        this.heros = heros;
    }

    public List<Equipement> getEquipements() {
        return equipements;
    }

    public void setEquipements(List<Equipement> equipements) {
        this.equipements = equipements;
    }

    public List<Sortilege> getSortileges() {
        return sortileges;
    }

    public void setSortileges(List<Sortilege> sortileges) {
        this.sortileges = sortileges;
    }

    public List<Statistique> getStatistiques() {
        return statistiques;
    }

    public void setStatistiques(List<Statistique> statistiques) {
        this.statistiques = statistiques;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }
}
