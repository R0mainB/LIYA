package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.ActionPeripetie;

@Dao
public interface ActionPeripetieDao {

    String TABLE_NAME = "T_ACTION_PERIPETIE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<ActionPeripetie> getAllActionPeripeties();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    ActionPeripetie getActionPeripetieById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_ACTION = :idAction")
    ActionPeripetie getActionPeripetieByAction(long idAction);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERIPETIE = :idPeripetie")
    ActionPeripetie getActionPeripetieByPeripetie(long idPeripetie);

    @Insert
    void insert(ActionPeripetie... actionPeripeties);

    @Insert
    void insert(List<ActionPeripetie> actionPeripeties);

    @Update
    void update(ActionPeripetie... actionPeripeties);

    @Delete
    void delete(ActionPeripetie... actionPeripeties);

}
