package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

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
 * Classe de liaison entre les equipements et les statistiques
 * */
public class EquipementPersonnage {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_EQUIPEMENT")
    private long idEquipement;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;

    public EquipementPersonnage() {
    }

    public EquipementPersonnage(long id, long idEquipement, long idPersonnage) {
        this.id = id;
        this.idEquipement = idEquipement;
        this.idPersonnage = idPersonnage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
