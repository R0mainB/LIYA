package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

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
 * Classe de liaison entre les aventures et les peripeties de l'histoire
 * */
public class AventurePeripetie {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "ID_PERIPETIE")
    private long idPeripetie;
    @ColumnInfo(name = "ID_AVENTURE")
    private long idAventure;

    public AventurePeripetie() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public AventurePeripetie(String id, long idPeripetie, long idAventure) {
        this.id = id;
        this.idPeripetie = idPeripetie;
        this.idAventure = idAventure;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
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
