package adventure.liya.mgr.com.liya.enumeration;

/**
 * Created by rbonhomme2016 on 03/04/2018.
 */

public enum ResultatDesEnum {

    REUSSITE_CRITIQUE,
    ECHEC_CRITIQUE,
    NORMAL;

    public static String getStringEnumValeur(ResultatDesEnum value){
        String retour = "";
        for (ResultatDesEnum resultatDes : ResultatDesEnum.values()) {
            if (resultatDes.name().equals(value.name())) {
                retour = resultatDes.name();
            }
        }

        return retour;
    }

    public static ResultatDesEnum getEnumStringValeur(String valeur){
        ResultatDesEnum retour  = null;
        for (ResultatDesEnum resultatDes : ResultatDesEnum.values()) {
            if (resultatDes.name().equals(valeur)) {
                retour = resultatDes;
            }
        }

        return retour;
    }

}
