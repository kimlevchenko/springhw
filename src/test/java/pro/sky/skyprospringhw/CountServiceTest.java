package pro.sky.skyprospringhw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountServiceTest {

    CountServiceImpl service = new CountServiceImpl();

    @Test
    void testHello() {
        var actual = service.helloCalc();
        assertEquals("Добро пожаловать в калькулятор", actual);

    }

    @Test
    void testPlus() {
        var actual = service.countPlus(5, 5);
        assertEquals("5 + 5 = 10", actual);

        var actual2 = service.countPlus(10, 5);
        assertEquals("10 + 5 = 15", actual2);
    }

    @Test
    void testMinus() {
        var actual = service.countMinus(5, 5);
        assertEquals("5 - 5 = 0", actual);

        var actual2 = service.countMinus(10, 5);
        assertEquals("10 - 5 = 5", actual2);
    }

    @Test
    void testMultiply() {
        var actual = service.countMultiply(5, 5);
        assertEquals("5 * 5 = 25", actual);

        var actual2 = service.countMultiply(10, 5);
        assertEquals("10 * 5 = 50", actual2);
    }

    @Test
    void testDivide() {
        var actual = service.countDivide(5, 5);
        assertEquals("5 / 5 = 1", actual);

        var actual2 = service.countDivide(10, 5);
        assertEquals("10 / 5 = 2", actual2);

        assertThrows(IllegalArgumentException.class, () -> service.countDivide(5, 0));
    }
}