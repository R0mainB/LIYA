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

    // Résultat du lancé de dés
    private int resultat;

    // Type de résultat (critique, normal, etc)
    private ResultatDesEnum type;

    public GestionDes() {
    }

    public int getResultat() {
        return resultat;
    }

    public ResultatDesEnum getType() {
        return type;
    }

    public void lancerDes(DesEnum des){
        Random rand = new Random();
        this.resultat = rand.nextInt(des.getNbFaces() + MIN_DES);

        if (this.resultat <= des.getTauxReussiteCritique()) {
            this.type = ResultatDesEnum.REUSSITE_CRITIQUE;
        } else if (this.resultat >= des.getTauxEchecCritique()) {
            this.type = ResultatDesEnum.ECHEC_CRITIQUE;
        } else {
            this.type = ResultatDesEnum.NORMAL;
        }

    }
}
