package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.PersonnageSpecialite;

/**
 * Created by rbonhomme2016 on 06/04/2018.
 */

@Dao
public interface PersonnageSpecialiteDao {

    String TABLE_NAME = "T_PERSONNAGE_SPECIALITE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<PersonnageSpecialite> getAllPersonnageSpecialites();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    PersonnageSpecialite getPersonnageSpecialiteById(String id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERSONNAGE = :idPersonnage")
    PersonnageSpecialite getPersonnageSpecialiteByPersonnage(long idPersonnage);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_SPECIALITE = :idSpecialite")
    PersonnageSpecialite getPersonnageSpecialiteBySpecialite(long idSpecialite);

    @Insert
    void insert(PersonnageSpecialite... personnageSpecialites);

    @Insert
    void insert(List<PersonnageSpecialite> personnageSpecialites);

    @Update
    void update(PersonnageSpecialite... personnageSpecialites);

    @Delete
    void delete(PersonnageSpecialite... personnageSpecialites);

}
