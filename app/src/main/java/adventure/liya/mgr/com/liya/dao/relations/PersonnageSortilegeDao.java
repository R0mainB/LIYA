package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.PersonnageSortilege;

@Dao
public interface PersonnageSortilegeDao {

    String TABLE_NAME = "T_PERSONNAGE_SORTILEGE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<PersonnageSortilege> getAllPersonnageSortileges();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    PersonnageSortilege getPersonnageSortilegeById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERSONNAGE = :idPersonnage")
    PersonnageSortilege getPersonnageSortilegeByPersonnage(long idPersonnage);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_SORTILEGE = :idSortilege")
    PersonnageSortilege getPersonnageSortilegeBySortilege(long idSortilege);

    @Insert
    void insert(PersonnageSortilege... personnageSortileges);

    @Insert
    void insert(List<PersonnageSortilege> personnageSortileges);

    @Update
    void update(PersonnageSortilege... personnageSortileges);

    @Delete
    void delete(PersonnageSortilege... personnageSortileges);

}
