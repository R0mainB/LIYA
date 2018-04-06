package adventure.liya.mgr.com.liya.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.Sortilege;

@Dao
public interface SortilegeDao {

    String TABLE_NAME = "T_SORTILEGE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<Sortilege> getAllSortileges();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    Sortilege getSortilegeById(String id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE LIBELLE = :libelle")
    Sortilege getSortilegeByLibelle(String libelle);

    @Insert
    void insert(Sortilege... sortileges);

    @Insert
    void insert(List<Sortilege> sortileges);

    @Update
    void update(Sortilege... sortileges);

    @Delete
    void delete(Sortilege... sortileges);

}
