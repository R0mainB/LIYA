package adventure.liya.mgr.com.liya.model;

import java.util.List;

/**
 * Created by Maxouxou on 03/04/2018.
 */

public class Aventure {
    private long id;
    private String libelle;
    private List<Personnage> personnages;
    private List<Histoire> histoires;

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

    public List<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(List<Personnage> personnages) {
        this.personnages = personnages;
    }

    public List<Histoire> getHistoires() {
        return histoires;
    }

    public void setHistoires(List<Histoire> histoires) {
        this.histoires = histoires;
    }

    public Aventure(){}
    public Aventure(long id, String libelle, List<Personnage> personnages, List<Histoire> histoires) {
        this.id = id;
        this.libelle = libelle;
        this.personnages = personnages;
        this.histoires = histoires;
    }
}
