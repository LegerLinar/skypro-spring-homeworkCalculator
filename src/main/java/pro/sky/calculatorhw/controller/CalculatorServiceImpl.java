package pro.sky.calculatorhw.controller;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{

    @Override
    public String plus(double num1, double num2) {
        return "Результат сложения " + num1 + " и " + num2 + " = " + (num1 + num2);
    }

    @Override
    public String minus(double num1, double num2) {
        return "Результат вычитания " + num1 + " и " + num2 + " = " + (num1 - num2);
    }

    @Override
    public String multiply(double num1, double num2) {
        return "Результат умножения " + num1 + " и " + num2 + " = " + (num1 * num2);
    }

    @Override
    public String divide(double num1, double num2) {
        if (num2 == 0){
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
            return "Результат деления " + num1 + " на " + num2 + " = " + (num1 / num2);
    }
}
