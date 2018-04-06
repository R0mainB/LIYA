package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Statistique;

@Dao
public interface StatistiqueDao {

    String TABLE_NAME = "T_STATISTIQUE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Statistique> getAllStatistiques();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Statistique getStatistiqueById(String id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE LIBELLE = :libelle")
    Statistique getStatistiqueByLibelle(String libelle);

    @Insert
    void insert(Statistique... statistiques);

    @Insert
    void insert(List<Statistique> statistiques);

    @Update
    void update(Statistique... statistiques);

    @Delete
    void delete(Statistique... statistiques);

}
