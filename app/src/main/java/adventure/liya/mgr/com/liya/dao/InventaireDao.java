package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Inventaire;

/**
 * Created by rbonhomme2016 on 05/04/2018.
 */

@Dao
public interface InventaireDao {

    String TABLE_NAME = "T_INVENTAIRE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Inventaire> getAllInventaires();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Inventaire getInventaireById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE NOM = :nom")
    Inventaire getInventaireByLibelle(String nom);

    @Insert
    void insert(Inventaire... inventaires);

    @Insert
    void insert(List<Inventaire> inventaires);

    @Update
    void update(Inventaire... inventaires);

    @Delete
    void delete(Inventaire... inventaires);

}
