package adventure.liya.mgr.com.liya.tools;

import java.util.Random;

import adventure.liya.mgr.com.liya.enumeration.DesEnum;
import adventure.liya.mgr.com.liya.enumeration.ResultatDesEnum;

/**
 * Created by rbonhomme2016 on 03/04/2018.
 */

public class GestionDes {

    // Score minimum possible au dés
    private final int MIN_DES = 1;

    public GestionDes() {
    }

    public Des lancerDes(DesEnum eDes){
        Des des = new Des();

        Random rand = new Random();
        des.setResultat(rand.nextInt(eDes.getNbFaces() + MIN_DES));

        if (des.getResultat() <= eDes.getTauxReussiteCritique()) {
            des.setType(ResultatDesEnum.REUSSITE_CRITIQUE);
        } else if (des.getResultat() >= eDes.getTauxEchecCritique()) {
            des.setType(ResultatDesEnum.ECHEC_CRITIQUE);
        } else {
            des.setType(ResultatDesEnum.NORMAL);
        }

        return des;
    }
}
