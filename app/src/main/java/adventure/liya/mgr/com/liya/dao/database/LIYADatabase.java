package adventure.liya.mgr.com.liya.dao.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import adventure.liya.mgr.com.liya.dao.ActionDao;
import adventure.liya.mgr.com.liya.dao.AventureDao;
import adventure.liya.mgr.com.liya.dao.EffetDao;
import adventure.liya.mgr.com.liya.dao.EquipementDao;
import adventure.liya.mgr.com.liya.dao.ObjetDao;
import adventure.liya.mgr.com.liya.dao.PeripetieDao;
import adventure.liya.mgr.com.liya.dao.ProgressionDao;
import adventure.liya.mgr.com.liya.dao.SortilegeDao;
import adventure.liya.mgr.com.liya.dao.StatistiqueDao;
import adventure.liya.mgr.com.liya.dao.relations.ActionPeripetieDao;
import adventure.liya.mgr.com.liya.dao.relations.ActionProgressionDao;
import adventure.liya.mgr.com.liya.dao.relations.AventurePeripetieDao;
import adventure.liya.mgr.com.liya.dao.relations.AventurePersonnageDao;
import adventure.liya.mgr.com.liya.dao.relations.EquipementPersonnageDao;
import adventure.liya.mgr.com.liya.dao.relations.EquipementStatistiqueDao;
import adventure.liya.mgr.com.liya.dao.relations.PersonnageSortilegeDao;
import adventure.liya.mgr.com.liya.dao.relations.PersonnageStatistiqueDao;
import adventure.liya.mgr.com.liya.model.Action;
import adventure.liya.mgr.com.liya.model.Aventure;
import adventure.liya.mgr.com.liya.model.Effet;
import adventure.liya.mgr.com.liya.model.Equipement;
import adventure.liya.mgr.com.liya.model.Objet;
import adventure.liya.mgr.com.liya.model.Peripetie;
import adventure.liya.mgr.com.liya.model.Personnage;
import adventure.liya.mgr.com.liya.model.Progression;
import adventure.liya.mgr.com.liya.model.Sortilege;
import adventure.liya.mgr.com.liya.model.Statistique;
import adventure.liya.mgr.com.liya.model.relations.ActionPeripetie;
import adventure.liya.mgr.com.liya.model.relations.ActionProgression;
import adventure.liya.mgr.com.liya.model.relations.AventurePeripetie;
import adventure.liya.mgr.com.liya.model.relations.AventurePersonnage;
import adventure.liya.mgr.com.liya.model.relations.EquipementPersonnage;
import adventure.liya.mgr.com.liya.model.relations.EquipementStatistique;
import adventure.liya.mgr.com.liya.model.relations.PersonnageSortilege;
import adventure.liya.mgr.com.liya.model.relations.PersonnageStatistique;

@Database(entities = {Action.class, Aventure.class, Effet.class, Equipement.class, Objet.class,
        Peripetie.class, Personnage.class, Progression.class, Sortilege.class, Statistique.class,
        ActionPeripetie.class, ActionProgression.class, AventurePeripetie.class, AventurePersonnage.class,
        EquipementPersonnage.class, EquipementStatistique.class, PersonnageSortilege.class, PersonnageStatistique.class}, version = 1)
abstract class LIYADatabase extends RoomDatabase {

    private static final String DB_NAME = "liyaDatabase.db";
    private static volatile  LIYADatabase instance;

    static  synchronized LIYADatabase getInstance(Context context) {
        if (instance == null) {
            instance = create(context);
        }

        return instance;
    }

    private static LIYADatabase create(final Context context) {
        return Room.databaseBuilder(context, LIYADatabase.class, DB_NAME).build();
    }

    // Les DAO de base
    public abstract ActionDao getActionDao();
    public abstract AventureDao getAventureDao();
    public abstract EffetDao getEffetDao();
    public abstract EquipementDao getEquipementDao();
    public abstract ObjetDao getObjetDao();
    public abstract PeripetieDao getPeripetieDao();
    public abstract ProgressionDao getProgressionDao();
    public abstract SortilegeDao getSortilegeDao();
    public abstract StatistiqueDao getStatistiqueDao();
    // Les DAO de relations
    public abstract ActionPeripetieDao getActionPeripetieDao();
    public abstract ActionProgressionDao getActionProgressionDao();
    public abstract AventurePeripetieDao getAventurePeripetieDao();
    public abstract AventurePersonnageDao getAventurePersonnageDao();
    public abstract EquipementPersonnageDao getEquipementPersonnageDao();
    public abstract EquipementStatistiqueDao getEquipementStatistiqueDao();
    public abstract PersonnageSortilegeDao getPersonnageSortilegeDao();
    public abstract PersonnageStatistiqueDao getPersonnageStatistiqueDao();

}
