package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.PrimaryKey;

import adventure.liya.mgr.com.liya.model.Personnage;
import adventure.liya.mgr.com.liya.model.Sortilege;

import static android.arch.persistence.room.ForeignKey.CASCADE;

@Entity(tableName = "T_PERSONNAGE_SORTILEGE",
        foreignKeys = {@ForeignKey(entity = Personnage.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERSONNAGE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Sortilege.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_SORTILEGE",
                                    onDelete = CASCADE)})
/*
 * Classe de liaison entre les equipements et les statistiques
 * */
public class PersonnageSortilege {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    @ColumnInfo(name = "ID_SORTILEGE")
    private long idSortielege;

    public PersonnageSortilege() {
    }

    public PersonnageSortilege(long id, long idPersonnage, long idSortielege) {
        this.id = id;
        this.idPersonnage = idPersonnage;
        this.idSortielege = idSortielege;
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

    public long getIdSortielege() {
        return idSortielege;
    }

    public void setIdSortielege(long idSortielege) {
        this.idSortielege = idSortielege;
    }
}
