package springwebcontent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springwebcontent.services.FactorialService;

@Controller
public class FactorialTaskController {
    private final FactorialService factorialService;

    @Autowired
    public FactorialTaskController(FactorialService factorialService) {
        this.factorialService = factorialService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String factorialTaskMain(Model model) {
        model.addAttribute("factorialTaskResult", "");
        return "factorial-task.html";
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String calculateFactorialTask(@RequestParam(defaultValue = "-1") Long firstNumber, @RequestParam(defaultValue = "-1") Long secondNumber, Model model) {
        model.addAttribute("factorialTaskResult", factorialService.calculate(firstNumber, secondNumber));
        return "factorial-task.html";

    }
}