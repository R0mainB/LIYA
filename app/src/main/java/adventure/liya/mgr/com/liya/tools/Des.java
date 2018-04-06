package adventure.liya.mgr.com.liya.tools;

import adventure.liya.mgr.com.liya.enumeration.ResultatDesEnum;

/**
 * Created by mblandin2016 on 06/04/2018.
 */

public class Des {
    private int resultat;
    private ResultatDesEnum type;

    public int getResultat() {
        return resultat;
    }
    public void setResultat(int resultat) {
        this.resultat = resultat;
    }

    public ResultatDesEnum getType() {
        return type;
    }
    public void setType(ResultatDesEnum type) {
        this.type = type;
    }

    public Des(){}
    public Des(int resultat, ResultatDesEnum type) {
        this.resultat = resultat;
        this.type = type;
    }
}
