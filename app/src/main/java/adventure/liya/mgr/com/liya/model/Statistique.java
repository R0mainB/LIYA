package adventure.liya.mgr.com.liya.model;

public class Statistique {

    private long id;
    private String libelle;
    private int pourcentage;

    public Statistique() {
    }

    public Statistique(long id, String libelle, int pourcentage) {
        this.id = id;
        this.libelle = libelle;
        this.pourcentage = pourcentage;
    }

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

    public int getPourcentage() {
        return pourcentage;
    }

    public void setPourcentage(int pourcentage) {
        this.pourcentage = pourcentage;
    }
}
