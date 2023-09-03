package pro.sky.skyprospringhw;

import org.springframework.stereotype.Service;

@Service

public class CountServiceImpl implements CountService {
    @Override
    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public String countPlus(int num1, int num2) {
        return (num1 + " + " + num2 + " = " + (num1 + num2));
    }

    @Override
    public String countMinus(int num1, int num2) {
        return (num1 + " - " + num2 + " = " + (num1 - num2));
    }

    @Override
    public String countMultiply(int num1, int num2) {
        return (num1 + " * " + num2 + " = " + (num1 * num2));
    }

    @Override
    public String countDivide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException();
        }
        return (num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
