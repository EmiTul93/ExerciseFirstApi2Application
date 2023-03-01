package co.develhope.firstapi2.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/factorial")

public class FactorialController {
    @GetMapping
   public String action(){

        return "Calculate a factorial";
    }

    @GetMapping("/factorial/?{n}")
    public Integer getFactorial(@PathVariable("n")Integer n){

        Integer result = n;
        while (n>1){
            result *= (--n);
        }
        return result;
    }
}