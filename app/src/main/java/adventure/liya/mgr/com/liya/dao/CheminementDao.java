package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Cheminement;

/**
 * Created by rbonhomme2016 on 05/04/2018.
 */

@Dao
public interface CheminementDao {

    String TABLE_NAME = "T_CHEMINEMENT";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Cheminement> getAllCheminements();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Cheminement getCheminementById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERIPETIE_DEPART = :idPeripetieDepart")
    Cheminement getCheminementByAventure(long idPeripetieDepart);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_ACTION = :idAction")
    Cheminement getCheminementByPersonnage(long idAction);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERIPETIE_SUITE = :idPeripetieSuite")
    Cheminement getCheminementByPeripetie(long idPeripetieSuite);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE RESULTAT_DES = :resultatDes")
    Cheminement getCheminementByPeripetie(String resultatDes);

    @Insert
    void insert(Cheminement... cheminements);

    @Insert
    void insert(List<Cheminement> cheminements);

    @Update
    void update(Cheminement... cheminements);

    @Delete
    void delete(Cheminement... cheminements);

}
