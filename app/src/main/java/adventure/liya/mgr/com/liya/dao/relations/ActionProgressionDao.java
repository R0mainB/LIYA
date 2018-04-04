package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.ActionProgression;

@Dao
public interface ActionProgressionDao {

    String TABLE_NAME = "T_ACTION_PROGRESSION";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<ActionProgression> getAllActionProgressions();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    ActionProgression getActionProgressionById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_ACTION = :idAction")
    ActionProgression getActionProgressionByAction(long idAction);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PROGRESSION = :idProgression")
    ActionProgression getActionProgressionByProgression(long idProgression);

    @Insert
    void insert(ActionProgression... actionProgressions);

    @Insert
    void insert(List<ActionProgression> actionProgressions);

    @Update
    void update(ActionProgression... actionProgressions);

    @Delete
    void delete(ActionProgression... actionProgressions);

}
