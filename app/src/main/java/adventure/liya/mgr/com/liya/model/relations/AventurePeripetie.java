package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.model.Peripetie;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "T_AVENTURE_PERIPETIE",
        foreignKeys = {@ForeignKey(entity = Peripetie.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERIPETIE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Aventure.class,
                                parentColumns = "ID",
                                childColumns = "ID_AVENTURE",
                                onDelete = CASCADE)})
/*
 * Classe de liaison entre les aventures et les chapitres de l'histoire
 * */
public class AventurePeripetie {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_PERIPETIE")
    private long idPeripetie;
    @ColumnInfo(name = "ID_AVENTURE")
    private long idAventure;

    public AventurePeripetie() {
    }

    public AventurePeripetie(long id, long idPeripetie, long idAventure) {
        this.id = id;
        this.idPeripetie = idPeripetie;
        this.idAventure = idAventure;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPeripetie() {
        return idPeripetie;
    }

    public void setIdPeripetie(long idPeripetie) {
        this.idPeripetie = idPeripetie;
    }

    public long getIdAventure() {
        return idAventure;
    }

    public void setIdAventure(long idAventure) {
        this.idAventure = idAventure;
    }
}
