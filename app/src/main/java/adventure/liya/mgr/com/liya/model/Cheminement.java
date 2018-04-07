package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.arch.persistence.room.TypeConverters;
import android.support.annotation.NonNull;

import java.util.UUID;

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

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "ID")
    @NonNull
    private String id;
    @ColumnInfo(name = "ID_PERIPETIE_DEPART")
    private String idPeripetieDepart;
    @ColumnInfo(name = "ID_ACTION")
    private String idAction;
    @ColumnInfo(name = "RESULTAT_DES")
    @TypeConverters(ResultatDesConvertisseur.class)
    private ResultatDesEnum resultatDes;
    @ColumnInfo(name = "ID_PERIPETIE_SUITE")
    private String idPeripetieSuite;

    public Cheminement() {
        this.id = UUID.randomUUID().toString();
    }

    @Ignore
    public Cheminement(String id, String idPeripetieDepart, String idAction, ResultatDesEnum resultatDes, String idPeripetieSuite) {
        this.id = id;
        this.idPeripetieDepart = idPeripetieDepart;
        this.idAction = idAction;
        this.resultatDes = resultatDes;
        this.idPeripetieSuite = idPeripetieSuite;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public void setId(@NonNull String id) {
        this.id = id;
    }

    public String getIdPeripetieDepart() {
        return idPeripetieDepart;
    }

    public void setIdPeripetieDepart(String idPeripetieDepart) {
        this.idPeripetieDepart = idPeripetieDepart;
    }

    public String getIdAction() {
        return idAction;
    }

    public void setIdAction(String idAction) {
        this.idAction = idAction;
    }

    public ResultatDesEnum getResultatDes() {
        return resultatDes;
    }

    public void setResultatDes(ResultatDesEnum resultatDes) {
        this.resultatDes = resultatDes;
    }

    public String getIdPeripetieSuite() {
        return idPeripetieSuite;
    }

    public void setIdPeripetieSuite(String idPeripetieSuite) {
        this.idPeripetieSuite = idPeripetieSuite;
    }
}
