package by.zhyuliuk.task.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringUtilsTest {

    @Test()
    public void isPositiveNumberTrueTest() {
        boolean actual = StringUtils.isPositiveNumber("225");
        assertTrue(actual);
    }

    @Test
    public void isPositiveNumberFalseTest() {
        boolean actual = StringUtils.isPositiveNumber("-123");
        assertFalse(actual);
    }


    @Test
    public void isPositiveNumberExceptionTest() {
        assertThrows(NumberFormatException.class, () -> {
            StringUtils.isPositiveNumber("dlsasad");
        });
    }
}
