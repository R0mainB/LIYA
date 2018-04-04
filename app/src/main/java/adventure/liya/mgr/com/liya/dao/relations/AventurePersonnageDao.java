package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.AventurePersonnage;

@Dao
public interface AventurePersonnageDao {

    String TABLE_NAME = "T_AVENTURE_PERSONNAGE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<AventurePersonnage> getAllAventurePersonnages();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    AventurePersonnage getAventurePersonnageById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_AVENTURE = :idAventure")
    AventurePersonnage getAventurePersonnageByAventure(long idAventure);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERSONNAGE = :idPersonnage")
    AventurePersonnage getAventurePersonnageByPersonnage(long idPersonnage);

    @Insert
    void insert(AventurePersonnage... aventurePersonnages);

    @Insert
    void insert(List<AventurePersonnage> aventurePersonnages);

    @Update
    void update(AventurePersonnage... aventurePersonnages);

    @Delete
    void delete(AventurePersonnage... aventurePersonnages);

}
