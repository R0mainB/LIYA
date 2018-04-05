package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;

import adventure.liya.mgr.com.liya.enumeration.DesEnum;
import adventure.liya.mgr.com.liya.enumeration.ResultatDesEnum;
import adventure.liya.mgr.com.liya.tools.ResultatDesConvertisseur;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by rbonhomme2016 on 05/04/2018.
 */

@Entity(tableName = "T_CHEMINEMENT",
        foreignKeys = {@ForeignKey(entity = Peripetie.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERIPETIE_DEPART",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Action.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_ACTION",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Peripetie.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERIPETIE_SUITE",
                                    onDelete = CASCADE)})
public class Cheminement {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "ID_PERIPETIE_DEPART")
    private long idPeripetieDepart;
    @ColumnInfo(name = "ID_ACTION")
    private long idAction;
    @ColumnInfo(name = "RESULTAT_DES")
    @TypeConverters(ResultatDesConvertisseur.class)
    private ResultatDesEnum resultatDes;
    @ColumnInfo(name = "ID_PERIPETIE_SUITE")
    private long idPeripetieSuite;

    public Cheminement() {
    }

    @Ignore
    public Cheminement(long id, long idPeripetieDepart, long idAction, ResultatDesEnum resultatDes, long idPeripetieSuite) {
        this.id = id;
        this.idPeripetieDepart = idPeripetieDepart;
        this.idAction = idAction;
        this.resultatDes = resultatDes;
        this.idPeripetieSuite = idPeripetieSuite;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getIdPeripetieDepart() {
        return idPeripetieDepart;
    }

    public void setIdPeripetieDepart(long idPeripetieDepart) {
        this.idPeripetieDepart = idPeripetieDepart;
    }

    public long getIdAction() {
        return idAction;
    }

    public void setIdAction(long idAction) {
        this.idAction = idAction;
    }

    public ResultatDesEnum getResultatDes() {
        return resultatDes;
    }

    public void setResultatDes(ResultatDesEnum resultatDes) {
        this.resultatDes = resultatDes;
    }

    public long getIdPeripetieSuite() {
        return idPeripetieSuite;
    }

    public void setIdPeripetieSuite(long idPeripetieSuite) {
        this.idPeripetieSuite = idPeripetieSuite;
    }
}
