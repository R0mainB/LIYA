package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.util.List;

@Entity(tableName = "T_OBJET")
public class Objet {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "LIBELLE")
    private String libelle;
    @ColumnInfo(name = "DESCRIPTION")
    private String description;
    private List<Effet> effets;

    public Objet() {
    }

    public Objet(long id, String libelle, String description, List<Effet> effets) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.effets = effets;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Effet> getEffets() {
        return effets;
    }

    public void setEffets(List<Effet> effets) {
        this.effets = effets;
    }
}
