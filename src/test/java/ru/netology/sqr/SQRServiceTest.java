package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void TestFoundNumber(int expected, int min, int max) {
        SQRService service = new SQRService();
        int actual = service.calc(min, max);
        Assertions.assertEquals(expected,actual);
    }
    /*@Test
    public void TestWhenNumberNotFound() {
        SQRService service = new SQRService();
        int actual = service.calc(0, 10);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestWhenNumberOneFound() {
        SQRService service = new SQRService();
        int actual = service.calc(100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
     */
}