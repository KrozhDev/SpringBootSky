package pro.sky.course2.calc;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class CalculatorService {

    public String helloCalculator() {
        return "Добро пожаловать в калькулятор!";
    }


    public String sumCalculator(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }


    public String minCalculator(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    public String mulCalculator(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    public String divCalculator(int num1, int num2) {
        try {
            return String.valueOf(num1 / num2);
        } catch (ArithmeticException e) {
            return "division by zero";
        }

    }
}
