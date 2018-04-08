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
    @ColumnInfo(name = "PROLOGUE")
    private boolean prologue;
    @Ignore
    private List<Action> actions;
    @Ignore
    private List<Cheminement> cheminements;

    public Peripetie() {
    }

    @Ignore
    public Peripetie(@NonNull String id, String description, boolean prologue, List<Action> actions, List<Cheminement> cheminements) {
        this.id = id;
        this.description = description;
        this.prologue = prologue;
        this.actions = actions;
        this.cheminements = cheminements;
    }

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

    public boolean isPrologue() {
        return prologue;
    }

    public void setPrologue(boolean prologue) {
        this.prologue = prologue;
    }

    public List<Action> getActions() {
        return actions;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public List<Cheminement> getCheminements() {
        return cheminements;
    }

    public void setCheminements(List<Cheminement> cheminements) {
        this.cheminements = cheminements;
    }
}
