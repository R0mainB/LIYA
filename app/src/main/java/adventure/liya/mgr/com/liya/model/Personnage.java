package adventure.liya.mgr.com.liya.model;

import java.util.List;

/**
 * Created by Maxouxou on 03/04/2018.
 */

public class Personnage {
    private long id;
    private String nom;
    private int pointVie;
    private int pointMagie;
    private Classe classe;
    private List<Equipement> equipements;
    private List<Sortilege> sortileges;
    private List<Statistique> statistiques;
    private int niveau;

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

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
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

    public Personnage(){}
    public Personnage(long id, String nom, int pointVie, int pointMagie, Classe classe, List<Equipement> equipements, List<Sortilege> sortileges, List<Statistique> statistiques, int niveau) {
        this.id = id;
        this.nom = nom;
        this.pointVie = pointVie;
        this.pointMagie = pointMagie;
        this.classe = classe;
        this.equipements = equipements;
        this.sortileges = sortileges;
        this.statistiques = statistiques;
        this.niveau = niveau;
    }
}
