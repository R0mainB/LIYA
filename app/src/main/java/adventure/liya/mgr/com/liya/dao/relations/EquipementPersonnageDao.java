package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.EquipementPersonnage;

@Dao
public interface EquipementPersonnageDao {

    String TABLE_NAME = "T_EQUIPEMENT_PERSONNAGE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<EquipementPersonnage> getAllEquipementPersonnages();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    EquipementPersonnage getEquipementPersonnageById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_EQUIPEMENT = :idEquipement")
    EquipementPersonnage getEquipementPersonnageByEquipement(long idEquipement);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERSONNAGE = :idPersonnage")
    EquipementPersonnage getEquipementPersonnageByPersonnage(long idPersonnage);

    @Insert
    void insert(EquipementPersonnage... equipementPersonnages);

    @Insert
    void insert(List<EquipementPersonnage> equipementPersonnages);

    @Update
    void update(EquipementPersonnage... equipementPersonnages);

    @Delete
    void delete(EquipementPersonnage... equipementPersonnages);

}
