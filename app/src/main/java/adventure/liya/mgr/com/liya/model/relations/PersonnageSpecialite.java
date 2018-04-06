package adventure.liya.mgr.com.liya.model.relations;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import java.util.UUID;

import adventure.liya.mgr.com.liya.model.Personnage;
import adventure.liya.mgr.com.liya.model.Specialite;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by rbonhomme2016 on 06/04/2018.
 */

@Entity(tableName = "T_PERSONNAGE_SORTILEGE",
        foreignKeys = {@ForeignKey(entity = Personnage.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERSONNAGE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Specialite.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_SPECIALITE",
                                    onDelete = CASCADE)})
/*
 * Classe de liaison entre les equipements et les statistiques
 * */
public class PersonnageSpecialite {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    @ColumnInfo(name = "ID_SPECIALITE")
    private long idSpecialite;

    public PersonnageSpecialite() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public PersonnageSpecialite(@NonNull String id, long idPersonnage, long idSpecialite) {
        this.id = id;
        this.idPersonnage = idPersonnage;
        this.idSpecialite = idSpecialite;
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

    public long getIdSpecialite() {
        return idSpecialite;
    }

    public void setIdSpecialite(long idSpecialite) {
        this.idSpecialite = idSpecialite;
    }
}
