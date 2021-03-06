package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;
import java.util.UUID;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by Maxouxou on 03/04/2018.
 */

@Entity(tableName = "T_PERSONNAGE",
        foreignKeys = {@ForeignKey(entity = Inventaire.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_INVENTAIRE",
                                    onDelete = CASCADE)})
public class Personnage {
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
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
    @ColumnInfo(name = "ID_INVENTAIRE")
    private long idInventaire;

    @Ignore
    private Inventaire inventaire;
    @Ignore
    private List<Equipement> equipements;
    @Ignore
    private List<Sortilege> sortileges;
    @Ignore
    private List<Statistique> statistiques;
    @Ignore
    private List<Specialite> specialites;

    public Personnage() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Personnage(String id, String nom, int pointVie, int pointMagie, String classe, boolean heros, long idInventaire, Inventaire inventaire, List<Equipement> equipements, List<Sortilege> sortileges, List<Statistique> statistiques, List<Specialite> specialites) {
        this.id = id;
        this.nom = nom;
        this.pointVie = pointVie;
        this.pointMagie = pointMagie;
        this.classe = classe;
        this.heros = heros;
        this.idInventaire = idInventaire;
        this.inventaire = inventaire;
        this.equipements = equipements;
        this.sortileges = sortileges;
        this.statistiques = statistiques;
        this.specialites = specialites;
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

    public long getIdInventaire() {
        return idInventaire;
    }

    public void setIdInventaire(long idInventaire) {
        this.idInventaire = idInventaire;
    }

    public Inventaire getInventaire() {
        return inventaire;
    }

    public void setInventaire(Inventaire inventaire) {
        this.inventaire = inventaire;
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

    public List<Specialite> getSpecialites() {
        return specialites;
    }

    public void setSpecialites(List<Specialite> specialites) {
        this.specialites = specialites;
    }
}
