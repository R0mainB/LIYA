package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.model.Personnage;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "T_AVENTURE_PERSONNAGE",
        foreignKeys = {@ForeignKey(entity = Personnage.class,
                                   parentColumns = "ID",
                                   childColumns = "ID_PERSONNAGE",
                                   onDelete = CASCADE),
                       @ForeignKey(entity = Aventure.class,
                                   parentColumns = "ID",
                                   childColumns = "ID_AVENTURE",
                                   onDelete = CASCADE)})
/*
* Classe de liaison entre les aventures et les personnages (héros, pnj, ennemis, etc.)
* */
public class AventurePersonnage {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    @ColumnInfo(name = "ID_AVENTURE")
    private long idAventure;

    public AventurePersonnage() {
        this.id = UUID.randomUUID().toString();
    }

    public AventurePersonnage(String id, long idPersonnage, long idAventure) {
        this.id = id;
        this.idPersonnage = idPersonnage;
        this.idAventure = idAventure;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public long getIdAventure() {
        return idAventure;
    }

    public void setIdAventure(long idAventure) {
        this.idAventure = idAventure;
    }
}
