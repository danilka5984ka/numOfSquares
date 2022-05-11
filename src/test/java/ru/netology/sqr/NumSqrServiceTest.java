package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumSqrServiceTest {

    @Test
    public void testValidValues() {

        NumSqrService service = new NumSqrService();

        int actual = service.sqrService(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testInvalidValues() {

        NumSqrService service = new NumSqrService();

        int actual = service.sqrService(300, 350);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
}
