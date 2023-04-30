package pro.sky.calculatorhw.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = new CalculatorServiceImpl();
    }
    @GetMapping()
        public String readMe(){
        return "Вы можете использовать калькулятор для операций /plus - сложения /minus - вычитания /multiply - умножения /divide - деления";
    }

    @GetMapping("/plus")
        public String plus ( @RequestParam double num1, @RequestParam double num2){
            return "Результат сложения " + num1 + " и " + num2 + " = " + calculatorService.plus(num1, num2);
        }
    @GetMapping("/minus")
        public String minus ( @RequestParam double num1, @RequestParam double num2){
            return "Результат вычитания " + num1 + " из " + num1 + " = " + calculatorService.minus(num1, num2);
        }
    @GetMapping("/multiply")
        public String multiply ( @RequestParam double num1, @RequestParam double num2){
            return "Результат умножения " + num1 + " на " + num2 + " = " + calculatorService.multiply(num1, num2);
        }
    @GetMapping("/divide")
        public String divide ( @RequestParam double num1, @RequestParam double num2){
        if (num2 == 0){
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
            return "Результат деления " + num1 + " на " + num2 + " = " + calculatorService.divide(num1, num2);

    }

}
