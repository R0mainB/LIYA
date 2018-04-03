package adventure.liya.mgr.com.liya.model;

import java.util.List;

/**
 * Created by Maxouxou on 03/04/2018.
 */

public class Progression {
    private long id;
    private Personnage personnage;
    private Aventure aventure;
    private Chapitre chapitre;
    private List<Action> actions;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Personnage getPersonnage() {
        return personnage;
    }

    public void setPersonnage(Personnage personnage) {
        this.personnage = personnage;
    }

    public Aventure getAventure() {
        return aventure;
    }

    public void setAventure(Aventure aventure) {
        this.aventure = aventure;
    }

    public Chapitre getHistoire() {
        return chapitre;
    }

    public void setHistoire(Chapitre histoire) {
        this.chapitre = histoire;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Progression(){}
    public Progression(long id, Personnage personnage, Aventure aventure, Chapitre chapitre, List<Action> actions) {
        this.id = id;
        this.personnage = personnage;
        this.aventure = aventure;
        this.chapitre = chapitre;
        this.actions = actions;
    }
}
