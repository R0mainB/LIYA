package tools;

import java.util.Random;

/**
 * Created by Maxouxou on 02/04/2018.
 */

public class GestionDes {

    public Integer lancerDes(Enum.nbrFace face){
        final int min = 1;
        Random rand = new Random();

        int max = recupererNombreFace(face);
        return rand.nextInt(max - min + 1) + min;
    }

    public Boolean gererReussiteCritique(Enum.nbrFace face){
        return null;
    }

    private Integer recupererNombreFace(Enum.nbrFace face){
        int nbrFace = 0;
        switch (face){
            case SIX:
                nbrFace = 6;
            case DIX:
                nbrFace = 10;
            case CENT:
                nbrFace = 100;
        }
        return nbrFace;
    }

}
