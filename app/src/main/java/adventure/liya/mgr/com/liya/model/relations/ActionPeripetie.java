package adventure.liya.mgr.com.liya.model.relations;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

import adventure.liya.mgr.com.liya.model.Action;
import adventure.liya.mgr.com.liya.model.Peripetie;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "T_ACTION_PERIPETIE",
        foreignKeys = {@ForeignKey(entity = Action.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_ACTION",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Peripetie.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERIPETIE",
                                    onDelete = CASCADE)})
/*
 * Classe de liaison entre les actions et les péripéties
 * */
public class ActionPeripetie {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "ID_ACTION")
    private long idAction;
    @ColumnInfo(name = "ID_PERIPETIE")
    private long idPeripetie;

    public ActionPeripetie() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public ActionPeripetie(String id, long idAction, long idPeripetie) {
        this.id = id;
        this.idAction = idAction;
        this.idPeripetie = idPeripetie;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public long getIdAction() {
        return idAction;
    }

    public void setIdAction(long idAction) {
        this.idAction = idAction;
    }

    public long getIdPeripetie() {
        return idPeripetie;
    }

    public void setIdPeripetie(long idPeripetie) {
        this.idPeripetie = idPeripetie;
    }
}
