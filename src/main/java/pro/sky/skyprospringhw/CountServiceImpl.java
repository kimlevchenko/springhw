package pro.sky.skyprospringhw;

import org.springframework.stereotype.Service;

@Service
public class CountServiceImpl implements CountService {

    public String helloCalc() {
        return "Добро пожаловать в калькулятор";
    }

    public String countPlus(int num1, int num2) {
        return (num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public String countMinus(int num1, int num2) {
        return (num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public String countMultiply(int num1, int num2) {
        return (num1 + " * " + num2 + " = " + (num1 * num2));
    }

    public String countDivide(int num1, int num2) {
        return (num1 + " / " + num2 + " = " + (num1 / num2));
    }
}
