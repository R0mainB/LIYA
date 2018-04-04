package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

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
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    @ColumnInfo(name = "ID_AVENTURE")
    private long idAventure;

    public AventurePersonnage() {
    }

    public AventurePersonnage(long id, long idPersonnage, long idAventure) {
        this.id = id;
        this.idPersonnage = idPersonnage;
        this.idAventure = idAventure;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
