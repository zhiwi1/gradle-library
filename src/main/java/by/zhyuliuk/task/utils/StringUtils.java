package by.zhyuliuk.task.utils;

import org.apache.commons.lang3.math.NumberUtils;

public final class StringUtils {

    private StringUtils() throws IllegalAccessException {
        throw new IllegalAccessException();
    }

    public static boolean isPositiveNumber(String str) throws NumberFormatException {
        boolean result ;
        if (NumberUtils.isCreatable(str)) {
            result = NumberUtils.createInteger(str) > 0;
        } else {
            throw new NumberFormatException();
        }
        return result;
    }


}
