package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Progression;

@Dao
public interface ProgressionDao {

    String TABLE_NAME = "T_PROGRESSION";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Progression> getAllProgressions();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Progression getProgressionById(String id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_AVENTURE = :idAventure")
    Progression getProgressionByAventure(long idAventure);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERSONNAGE = :idPersonnage")
    Progression getProgressionByPersonnage(long idPersonnage);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERIPETIE = :idPeripetie")
    Progression getProgressionByPeripetie(long idPeripetie);

    @Insert
    void insert(Progression... progressions);

    @Insert
    void insert(List<Progression> progressions);

    @Update
    void update(Progression... progressions);

    @Delete
    void delete(Progression... progressions);

}
