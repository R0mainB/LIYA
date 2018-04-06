package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Equipement;

@Dao
public interface EquipementDao {

    String TABLE_NAME = "T_EQUIPEMENT";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Equipement> getAllEquipements();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Equipement getEquipementById(String id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE NOM = :nom")
    Equipement getEquipementByNom(String nom);

    @Insert
    void insert(Equipement... equipements);

    @Insert
    void insert(List<Equipement> equipements);

    @Update
    void update(Equipement... equipements);

    @Delete
    void delete(Equipement... equipements);

}
