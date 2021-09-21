package by.zhyuliuk.task.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringUtilsTest {
//todo first
    @Test
    public void isPositiveNumberTest() {
        boolean actual = StringUtils.isPositiveNumber("225");
        assertTrue(actual);
    }
}
