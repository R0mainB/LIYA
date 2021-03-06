package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

@Entity(tableName = "T_SORTILEGE")
public class Sortilege {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "LIBELLE")
    private String libelle;
    @ColumnInfo(name = "COUT_MAGIE")
    private int coutMagie;
    @ColumnInfo(name = "DEGAT_MIN")
    private int degatMin;
    @ColumnInfo(name = "NIVEAU_REQUIS")
    private int niveauRequis;

    public Sortilege() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Sortilege(String id, String libelle, int coutMagie, int degatMin, int niveauRequis) {
        this.id = id;
        this.libelle = libelle;
        this.coutMagie = coutMagie;
        this.degatMin = degatMin;
        this.niveauRequis = niveauRequis;
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

    public int getCoutMagie() {
        return coutMagie;
    }

    public void setCoutMagie(int coutMagie) {
        this.coutMagie = coutMagie;
    }

    public int getDegatMin() {
        return degatMin;
    }

    public void setDegatMin(int degatMin) {
        this.degatMin = degatMin;
    }

    public int getNiveauRequis() {
        return niveauRequis;
    }

    public void setNiveauRequis(int niveauRequis) {
        this.niveauRequis = niveauRequis;
    }
}
