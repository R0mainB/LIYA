package adventure.liya.mgr.com.liya.model;

public class Sortilege {

    private long id;
    private String libelle;
    private int cout;

    public Sortilege() {
    }

    public Sortilege(long id, String libelle, int cout) {
        this.id = id;
        this.libelle = libelle;
        this.cout = cout;
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

    public int getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }
}
