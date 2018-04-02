package adventure.liya.mgr.com.liya.tools;

import java.util.Random;

/**
 * Created by Maxouxou on 02/04/2018.
 */

public class GestionDes {

    private final int MIN_DES = 1;

    private final int MIN_ECHECRIT_100 = 96;
    private final int MAX_REUSSICRIT_100 = 5;

    private final int DES_6_MAX = 6;
    private final int DES_100_MAX =100;


    public Integer selectionnerDes(Enum.eDes des){
        int nbrFace = 0;
        switch (des){
            case FACE6:
                nbrFace = DES_6_MAX;
                break;
            case FACE100:
                nbrFace = DES_100_MAX;
                break;
        }
        return nbrFace;
    }

    public Integer lancerDes(int des){
        Random rand = new Random();
        return rand.nextInt(des + MIN_DES);
    }

    public Boolean gererReussiteCritique(int des,int resultDes){
        Boolean isReussite = false;

        if(des == DES_6_MAX && resultDes == MIN_DES){
            isReussite= true;
        }
        if(des == DES_100_MAX && resultDes >= MIN_DES && resultDes <= MAX_REUSSICRIT_100){
            isReussite= true;
        }

        return isReussite;
    }

    public Boolean gererEchecCritique(int des,int resultDes){
        Boolean isEchec = false;

        if(des == DES_6_MAX && resultDes == DES_6_MAX){
            isEchec= true;
        }
        if(des == DES_100_MAX && resultDes >= MIN_ECHECRIT_100 && resultDes <= DES_100_MAX){
            isEchec= true;
        }

        return isEchec;
    }

}
