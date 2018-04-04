package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Maxouxou on 03/04/2018.
 */

@Entity(tableName = "T_ACTION")
public class Action {
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "TITRE")
    private String titre;
    @ColumnInfo(name = "DESCRIPTION")
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Action(){}
    public Action(long id, String titre, String description) {
        this.id = id;
        this.titre = titre;
        this.description = description;
    }
}
