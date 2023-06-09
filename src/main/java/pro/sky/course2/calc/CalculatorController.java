package pro.sky.course2.calc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }


    @GetMapping(path = "/calculator")
    public String helloCalculator() {
        return calculatorService.helloCalculator();
    }

    @GetMapping(path = "/calculator/plus")
    public String sumCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.sumCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/minus")
    public String minCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.minCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/multiply")
    public String mulCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.mulCalculator(num1, num2);
    }

    @GetMapping(path = "/calculator/divide")
    public String divCalculator(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorService.divCalculator(num1, num2);

    }
}
