package by.zhyuliuk.task.utils;

import org.apache.commons.lang3.math.NumberUtils;

public final class StringUtils {
//todo exceptions
    private StringUtils() {
    }

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && NumberUtils.createInteger(str) > 0;
    }


}
