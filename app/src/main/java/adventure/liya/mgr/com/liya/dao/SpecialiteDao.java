package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Specialite;

@Dao
public interface SpecialiteDao {

    String TABLE_NAME = "T_SPECIALITE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Specialite> getAllSpecialites();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Specialite getSpecialiteById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE LIBELLE = :libelle")
    Specialite getSpecialiteByLibelle(String libelle);

    @Insert
    void insert(Specialite... specialites);

    @Insert
    void insert(List<Specialite> specialites);

    @Update
    void update(Specialite... specialites);

    @Delete
    void delete(Specialite... specialites);

}
