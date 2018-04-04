package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Personnage;

@Dao
public interface PersonnageDao {

    String TABLE_NAME = "T_PERSONNAGE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Personnage> getAllPersonnages();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Personnage getPersonnageById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE NOM = :nom")
    Personnage getPersonnageByNom(String nom);

    @Insert
    void insert(Personnage... personnages);

    @Insert
    void insert(List<Personnage> personnages);

    @Update
    void update(Personnage... personnages);

    @Delete
    void delete(Personnage... personnages);

}
