package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Action;

@Dao
public interface ActionDao {

    String TABLE_NAME = "T_ACTION";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Action> getAllActions();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Action getActionById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE TITRE = :titre")
    Action getActionByTitre(String titre);

    @Insert
    void insert(Action... actions);

    @Insert
    void insert(List<Action> actions);

    @Update
    void update(Action... actions);

    @Delete
    void delete(Action... actions);

}
