package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

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
 * Classe de liaison entre les personnages et les sortileges
 * */
public class PersonnageSortilege {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    @ColumnInfo(name = "ID_SORTILEGE")
    private long idSortilege;

    public PersonnageSortilege() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public PersonnageSortilege(String id, long idPersonnage, long idSortilege) {
        this.id = id;
        this.idPersonnage = idPersonnage;
        this.idSortilege = idSortilege;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public long getIdSortilege() {
        return idSortilege;
    }

    public void setIdSortilege(long idSortilege) {
        this.idSortilege = idSortilege;
    }
}
