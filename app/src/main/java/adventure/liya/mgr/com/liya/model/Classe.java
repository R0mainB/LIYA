package adventure.liya.mgr.com.liya.model;

/**
 * Created by Maxouxou on 03/04/2018.
 */

public class Classe {
    private long id;
    private String libelle;

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

    public Classe(){}
    public Classe(long id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }
}
