package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import adventure.liya.mgr.com.liya.model.Personnage;
import adventure.liya.mgr.com.liya.model.Statistique;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "T_PERSONNAGE_STATISTIQUE",
        foreignKeys = {@ForeignKey(entity = Personnage.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERSONNAGE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Statistique.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_STATISTIQUE",
                                    onDelete = CASCADE)})
/*
 * Classe de liaison entre les equipements et les statistiques
 * */
public class PersonnageStatistique {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    @ColumnInfo(name = "ID_STATISTIQUE")
    private long idStatistique;

    public PersonnageStatistique() {
    }

    public PersonnageStatistique(long id, long idPersonnage, long idStatistique) {
        this.id = id;
        this.idPersonnage = idPersonnage;
        this.idStatistique = idStatistique;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public long getIdStatistique() {
        return idStatistique;
    }

    public void setIdStatistique(long idStatistique) {
        this.idStatistique = idStatistique;
    }
}
