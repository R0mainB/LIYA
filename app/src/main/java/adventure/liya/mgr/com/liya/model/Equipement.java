package adventure.liya.mgr.com.liya.model;

import java.util.List;

public class Equipement {

    private long id;
    private String nom;
    private int niveauPourEquiper;
    private List<Statistique> statistiques;

    public Equipement() {
    }

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
