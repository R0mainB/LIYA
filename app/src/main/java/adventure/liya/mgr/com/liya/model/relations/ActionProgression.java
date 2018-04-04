package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import adventure.liya.mgr.com.liya.model.Action;
import adventure.liya.mgr.com.liya.model.Progression;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "T_ACTION_PROGRESSION",
        foreignKeys = {@ForeignKey(entity = Action.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_ACTION",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Progression.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PROGRESSION",
                                    onDelete = CASCADE)})
/*
 * Classe de liaison entre les equipements et les statistiques
 * */
public class ActionProgression {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_ACTION")
    private long idAction;
    @ColumnInfo(name = "ID_PROGRESSION")
    private long idProgression;

    public ActionProgression() {
    }

    @Ignore
    public ActionProgression(long id, long idAction, long idProgression) {
        this.id = id;
        this.idAction = idAction;
        this.idProgression = idProgression;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdAction() {
        return idAction;
    }

    public void setIdAction(long idAction) {
        this.idAction = idAction;
    }

    public long getIdProgression() {
        return idProgression;
    }

    public void setIdProgression(long idProgression) {
        this.idProgression = idProgression;
    }
}
