package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Aventure;

@Dao
public interface AventureDao {

    String TABLE_NAME = "T_AVENTURE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Aventure> getAllAventures();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Aventure getAventureById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE LIBELLE = :libelle")
    Aventure getAventureByLibelle(String libelle);

    @Insert
    void insert(Aventure... aventures);

    @Insert
    void insert(List<Aventure> aventures);

    @Update
    void update(Aventure... aventures);

    @Delete
    void delete(Aventure... aventures);

}
