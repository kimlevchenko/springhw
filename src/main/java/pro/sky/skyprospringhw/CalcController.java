package pro.sky.skyprospringhw;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CountService countService;

    public CalcController(CountService countService) {
        this.countService = countService;
    }

    @GetMapping
    public String helloCalc() {
        return countService.helloCalc();
    }

    @GetMapping(path = "/plus")
    public String countPlus(@RequestParam int num1, int num2) {
        return countService.countPlus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String countMinus(@RequestParam int num1, int num2) {
        return countService.countMinus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String countMultiply(@RequestParam int num1, int num2) {
        return countService.countMultiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String countDivide(@RequestParam int num1, int num2) {
        return countService.countDivide(num1, num2);
    }
}
