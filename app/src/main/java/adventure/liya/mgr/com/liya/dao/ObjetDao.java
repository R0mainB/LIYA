package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Objet;

@Dao
public interface ObjetDao {

    String TABLE_NAME = "T_OBJET";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Objet> getAllObjets();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Objet getObjetById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE LIBELLE = :libelle")
    Objet getObjetByLibelle(String libelle);

    @Insert
    void insert(Objet... objets);

    @Insert
    void insert(List<Objet> objets);

    @Update
    void update(Objet... objets);

    @Delete
    void delete(Objet... objets);

}
