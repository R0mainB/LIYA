package adventure.liya.mgr.com.liya.model;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.ForeignKey;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

import java.util.Date;
import java.util.List;

import static android.arch.persistence.room.ForeignKey.CASCADE;

/**
 * Created by Maxouxou on 03/04/2018.
 */

@Entity(tableName = "T_PROGRESSION",
        foreignKeys = {@ForeignKey(entity = Personnage.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERSONNAGE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Aventure.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_AVENTURE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Peripetie.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_PERIPETIE",
                                    onDelete = CASCADE),
                        @ForeignKey(entity = Inventaire.class,
                                    parentColumns = "ID",
                                    childColumns = "ID_INVENTAIRE",
                                    onDelete = CASCADE)})
public class Progression {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "ID")
    private long id;
    @ColumnInfo(name = "DATE_ACTION")
    private Date dateAction;
    @ColumnInfo(name = "ID_PERSONNAGE")
    private long idPersonnage;
    @ColumnInfo(name = "ID_AVENTURE")
    private long idAventure;
    @ColumnInfo(name = "ID_PERIPETIE")
    private long idPeripetie;
    @ColumnInfo(name = "ID_INVENTAIRE")
    private long idInventaire;
    @ColumnInfo(name = "NIVEAU_PERSONNAGE")
    private int niveauPersonnage;

    public Progression() {
    }

    @Ignore
    public Progression(long id, Date dateAction, long idPersonnage, long idAventure, long idPeripetie, long idInventaire, int niveauPersonnage) {
        this.id = id;
        this.dateAction = dateAction;
        this.idPersonnage = idPersonnage;
        this.idAventure = idAventure;
        this.idPeripetie = idPeripetie;
        this.idInventaire = idInventaire;
        this.niveauPersonnage = niveauPersonnage;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getDateAction() {
        return dateAction;
    }

    public void setDateAction(Date dateAction) {
        this.dateAction = dateAction;
    }

    public long getIdPersonnage() {
        return idPersonnage;
    }

    public void setIdPersonnage(long idPersonnage) {
        this.idPersonnage = idPersonnage;
    }

    public long getIdAventure() {
        return idAventure;
    }

    public void setIdAventure(long idAventure) {
        this.idAventure = idAventure;
    }

    public long getIdPeripetie() {
        return idPeripetie;
    }

    public void setIdPeripetie(long idPeripetie) {
        this.idPeripetie = idPeripetie;
    }

    public long getIdInventaire() {
        return idInventaire;
    }

    public void setIdInventaire(long idInventaire) {
        this.idInventaire = idInventaire;
    }

    public int getNiveauPersonnage() {
        return niveauPersonnage;
    }

    public void setNiveauPersonnage(int niveauPersonnage) {
        this.niveauPersonnage = niveauPersonnage;
    }
}
