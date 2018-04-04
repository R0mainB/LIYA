package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Peripetie;

@Dao
public interface PeripetieDao {

    String TABLE_NAME = "T_PERIPETIE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Peripetie> getAllPeripeties();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Peripetie getPeripetieById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE DESCRIPTION LIKE :description")
    Peripetie getPeripetieByDescription(String description);

    @Insert
    void insert(Peripetie... peripeties);

    @Insert
    void insert(List<Peripetie> peripeties);

    @Update
    void update(Peripetie... peripeties);

    @Delete
    void delete(Peripetie... peripeties);

}
