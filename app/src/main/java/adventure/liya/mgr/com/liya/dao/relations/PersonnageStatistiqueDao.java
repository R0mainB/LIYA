package adventure.liya.mgr.com.liya.dao.relations;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

import adventure.liya.mgr.com.liya.model.relations.PersonnageStatistique;

@Dao
public interface PersonnageStatistiqueDao {

    String TABLE_NAME = "T_PERSONNAGE_STATISTIQUE";

    @Query("SELECT * FROM " + TABLE_NAME)
    List<PersonnageStatistique> getAllPersonnageStatistiques();

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID = :id")
    PersonnageStatistique getPersonnageStatistiqueById(int id);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_PERSONNAGE = :idPersonnage")
    PersonnageStatistique getPersonnageStatistiqueByPersonnage(long idPersonnage);

    @Query("SELECT * FROM " + TABLE_NAME + " WHERE ID_STATISTIQUE = :idStatistique")
    PersonnageStatistique getPersonnageStatistiqueByStatistique(long idStatistique);

    @Insert
    void insert(PersonnageStatistique... personnageStatistiques);

    @Insert
    void insert(List<PersonnageStatistique> personnageStatistiques);

    @Update
    void update(PersonnageStatistique... personnageStatistiques);

    @Delete
    void delete(PersonnageStatistique... personnageStatistiques);

}
