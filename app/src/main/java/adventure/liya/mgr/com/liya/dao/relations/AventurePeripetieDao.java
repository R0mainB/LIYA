package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.AventurePeripetie;

@Dao
public interface AventurePeripetieDao {

    String TABLE_NAME = "T_AVENTURE_PERIPETIE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<AventurePeripetie> getAllAventurePeripeties();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    AventurePeripetie getAventurePeripetieById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_AVENTURE = :idAventure")
    AventurePeripetie getAventurePeripetieByAventure(long idAventure);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERIPETIE = :idPeripetie")
    AventurePeripetie getAventurePeripetieByPeripetie(long idPeripetie);

    @Insert
    void insert(AventurePeripetie... aventurePeripeties);

    @Insert
    void insert(List<AventurePeripetie> aventurePeripeties);

    @Update
    void update(AventurePeripetie... aventurePeripeties);

    @Delete
    void delete(AventurePeripetie... aventurePeripeties);

}
