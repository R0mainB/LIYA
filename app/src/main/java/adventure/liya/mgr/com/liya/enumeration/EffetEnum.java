package adventure.liya.mgr.com.liya.enumeration;

public enum EffetEnum {

    BONUS_VIE,
    BONUS_MAGIE,
    BONUS_PHYSIQUE,
    BONUS_MENTAL,
    BONUS_SOCIAL,
    MALUS_VIE,
    MALUS_MAGIE,
    MALUS_PHYSIQUE,
    MALUS_MENTAL,
    MALUS_SOCIAL;

    public static String getStringEnumValeur(EffetEnum value){
        String retour = "";
        for (EffetEnum effet : EffetEnum.values()) {
            if (effet.name().equals(value.name())) {
                retour = effet.name();
            }
        }

        return retour;
    }

    public static EffetEnum getEnumStringValeur(String valeur){
        EffetEnum retour  = null;
        for (EffetEnum effet : EffetEnum.values()) {
            if (effet.name().equals(valeur)) {
                retour = effet;
            }
        }

        return retour;
    }

}
