package by.zhyuliuk.task.utils;

import by.zhyuliuk.task.utils.StringUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class StringUtilsTest {

    @Test
    void isPositiveNumberTest() {
        boolean actual = StringUtils.isPositiveNumber("225");
        assertTrue(actual);
    }
}
