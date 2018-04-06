package adventure.liya.mgr.com.liya.service;

/**
 * Created by mblandin2016 on 06/04/2018.
 */

public class PersonnageService {

    final int PV_PM_MIN = 0;

    public int calculerPointVieMagie(int PvPmMax, int PvPmActuel, int valeur){
        int nouveauPoint = PvPmActuel + valeur;

        if(nouveauPoint < PV_PM_MIN){
            nouveauPoint = PV_PM_MIN;
        }else if(nouveauPoint > PvPmMax){
            nouveauPoint = PvPmMax;
        }
        return  nouveauPoint;
    }
}
