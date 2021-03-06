package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

import adventure.liya.mgr.com.liya.model.Equipement;
import adventure.liya.mgr.com.liya.model.Personnage;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "T_EQUIPEMENT_PERSONNAGE",
        foreignKeys = {@ForeignKey(entity = Equipement.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_EQUIPEMENT",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Personnage.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERSONNAGE",
                                    onDelete = CASCADE)})
/*
 * Classe de liaison entre les equipements et les personnages
 * */
public class EquipementPersonnage {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "ID_EQUIPEMENT")
    private long idEquipement;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;

    public EquipementPersonnage() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public EquipementPersonnage(String id, long idEquipement, long idPersonnage) {
        this.id = id;
        this.idEquipement = idEquipement;
        this.idPersonnage = idPersonnage;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public long getIdEquipement() {
        return idEquipement;
    }

    public void setIdEquipement(long idEquipement) {
        this.idEquipement = idEquipement;
    }

    public long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }
}
