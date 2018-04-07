package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.List;
import java.util.UUID;

/**
 * Created by Maxouxou on 02/04/2018.
 */

@Entity(tableName = "T_PERIPETIE")
public class Peripetie {
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "DESCRIPTION")
    private String description;
    @Ignore
    private List<Action> actions;

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public Peripetie(){
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Peripetie(String id, String description) {
        this.id = id;
        this.description = description;
    }

    public Peripetie(String id, String description,List<Action> actions) {
        this.id = id;
        this.description = description;
        this.actions = actions;
    }
}
