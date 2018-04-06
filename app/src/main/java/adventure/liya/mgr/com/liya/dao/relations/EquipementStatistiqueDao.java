package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.EquipementStatistique;

@Dao
public interface EquipementStatistiqueDao {

    String TABLE_NAME = "T_EQUIPEMENT_STATISTIQUE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<EquipementStatistique> getAllEquipementStatistiques();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    EquipementStatistique getEquipementStatistiqueById(String id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_EQUIPEMENT = :idEquipement")
    EquipementStatistique getEquipementStatistiqueByEquipement(long idEquipement);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_STATISTIQUE = :idStatistique")
    EquipementStatistique getEquipementStatistiqueByStatistique(long idStatistique);

    @Insert
    void insert(EquipementStatistique... equipementStatistiques);

    @Insert
    void insert(List<EquipementStatistique> equipementStatistiques);

    @Update
    void update(EquipementStatistique... equipementStatistiques);

    @Delete
    void delete(EquipementStatistique... equipementStatistiques);

}
