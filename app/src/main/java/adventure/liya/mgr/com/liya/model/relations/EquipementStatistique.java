package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

import adventure.liya.mgr.com.liya.model.Equipement;
import adventure.liya.mgr.com.liya.model.Statistique;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "T_EQUIPEMENT_STATISTIQUE",
        foreignKeys = {@ForeignKey(entity = Equipement.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_EQUIPEMENT",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Statistique.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_STATISTIQUE",
                                    onDelete = CASCADE)})
/*
 * Classe de liaison entre les equipements et les statistiques
 * */
public class EquipementStatistique {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "ID_EQUIPEMENT")
    private long idEquipement;
    @ColumnInfo(name = "ID_STATISTIQUE")
    private long idStatistique;

    public EquipementStatistique() {
        this.id = UUID.randomUUID().toString();
    }

    public EquipementStatistique(String id, long idEquipement, long idStatistique) {
        this.id = id;
        this.idEquipement = idEquipement;
        this.idStatistique = idStatistique;
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

    public long getIdStatistique() {
        return idStatistique;
    }

    public void setIdStatistique(long idStatistique) {
        this.idStatistique = idStatistique;
    }
}
