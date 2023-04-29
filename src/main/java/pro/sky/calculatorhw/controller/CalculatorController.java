package pro.sky.calculatorhw.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = new CalculatorServiceImpl();
    }

    @GetMapping("/plus")
        public String plus ( @RequestParam double num1, @RequestParam double num2){
            return calculatorService.plus(num1, num2);
        }
    @GetMapping("/minus")
        public String minus ( @RequestParam double num1, @RequestParam double num2){
            return calculatorService.minus(num1, num2);
        }
    @GetMapping("/multiply")
        public String multiply ( @RequestParam double num1, @RequestParam double num2){
            return calculatorService.multiply(num1, num2);
        }
    @GetMapping("/divide")
        public String divide ( @RequestParam double num1, @RequestParam double num2){
            return calculatorService.divide(num1, num2);

    }

}
