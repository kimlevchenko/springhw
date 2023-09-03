package pro.sky.skyprospringhw;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountServiceParamTest {
    CountServiceImpl service = new CountServiceImpl();

    private static List<Arguments> params() {
        return List.of(
                Arguments.of(5, 5),
                Arguments.of(10, 5));
    }

    @ParameterizedTest
    @MethodSource("params")
    void test(int num1, int num2) {
        assertEquals(num1 + " + " + num2 + " = " + (num1 + num2), service.countPlus(num1, num2));
        assertEquals(num1 + " - " + num2 + " = " + (num1 - num2), service.countMinus(num1, num2));
        assertEquals(num1 + " * " + num2 + " = " + (num1 * num2), service.countMultiply(num1, num2));
        assertEquals(num1 + " / " + num2 + " = " + (num1 / num2), service.countDivide(num1, num2));

    }
}
