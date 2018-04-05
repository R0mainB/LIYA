package adventure.liya.mgr.com.liya.tools;

import android.arch.persistence.room.TypeConverter;

import adventure.liya.mgr.com.liya.enumeration.ResultatDesEnum;

/**
 * Created by rbonhomme2016 on 05/04/2018.
 */

public class ResultatDesConvertisseur {

    @TypeConverter
    public String resultatDesEnumToString(ResultatDesEnum effetEnum) {
        return ResultatDesEnum.getStringEnumValeur(effetEnum);
    }

    @TypeConverter
    public ResultatDesEnum stringToResultatDesEnum(String effet) {
        return ResultatDesEnum.getEnumStringValeur(effet);
    }

}
