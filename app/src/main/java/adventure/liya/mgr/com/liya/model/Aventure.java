package adventure.liya.mgr.com.liya.model;

import java.util.List;

/**
 * Created by Maxouxou on 03/04/2018.
 */

public class Aventure {
    private long id;
    private String libelle;
    private String description;
    private List<Personnage> personnages;
    private List<Chapitre> chapitres;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Personnage> getPersonnages() {
        return personnages;
    }

    public void setPersonnages(List<Personnage> personnages) {
        this.personnages = personnages;
    }

    public List<Chapitre> getHistoires() {
        return chapitres;
    }

    public void setHistoires(List<Chapitre> histoires) {
        this.chapitres = histoires;
    }

    public Aventure(){}
    public Aventure(String libelle, String description){
        this.libelle = libelle;
        this.description = description;
    }
    public Aventure(long id, String libelle,String description, List<Personnage> personnages, List<Chapitre> histoires) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.personnages = personnages;
        this.chapitres = histoires;
    }
}
