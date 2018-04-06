package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;
import java.util.UUID;

@Entity(tableName = "T_OBJET")
public class Objet {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "LIBELLE")
    private String libelle;
    @ColumnInfo(name = "DESCRIPTION")
    private String description;
    @Ignore
    private List<Effet> effets;

    public Objet() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Objet(String id, String libelle, String description, List<Effet> effets) {
        this.id = id;
        this.libelle = libelle;
        this.description = description;
        this.effets = effets;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
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
