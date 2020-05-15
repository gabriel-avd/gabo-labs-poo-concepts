package mains;

import services.AdvanceCalculatorService;
import services.CalculatorService;

public class CalculatorMain {

    public static void main(String[] args) {
        CalculatorService calculatorService = new CalculatorService();

        System.out.println(calculatorService.sum(15D,10D));

        AdvanceCalculatorService advanceCalculatorService = new AdvanceCalculatorService();
        System.out.println(advanceCalculatorService.sum(1, 2,3));


    }
}
