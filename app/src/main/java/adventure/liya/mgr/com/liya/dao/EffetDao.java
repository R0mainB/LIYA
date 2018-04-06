package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Effet;

@Dao
public interface EffetDao {

    String TABLE_NAME = "T_EFFET";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Effet> getAllEffets();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Effet getEffetById(String id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE LIBELLE = :libelle")
    Effet getEffetByLibelle(String libelle);

    @Insert
    void insert(Effet... effets);

    @Insert
    void insert(List<Effet> effets);

    @Update
    void update(Effet... effets);

    @Delete
    void delete(Effet... effets);

}
