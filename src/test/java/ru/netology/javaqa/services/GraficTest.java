
package ru.netology.javaqa.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class GraficTest {
    @Test
    public void testGraficRest1() {
        Grafic service = new Grafic();
        int actual = service.calculate(10000, 3000, 20000);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGraficRest2() {
        Grafic service = new Grafic();
        int actual = service.calculate(100000, 60000, 150000);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }
}
