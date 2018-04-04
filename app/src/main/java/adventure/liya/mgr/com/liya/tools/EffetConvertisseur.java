package adventure.liya.mgr.com.liya.tools;

import android.arch.persistence.room.TypeConverter;

import adventure.liya.mgr.com.liya.enumeration.EffetEnum;

public class EffetConvertisseur {

    @TypeConverter
    public String effetEnumToString(EffetEnum effetEnum) {
        return EffetEnum.getStringEnumValeur(effetEnum);
    }

    @TypeConverter
    public EffetEnum stringToEffetEnum(String effet) {
        return EffetEnum.getEnumStringValeur(effet);
    }

}
