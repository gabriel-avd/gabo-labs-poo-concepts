package services;

import abstractClasses.AritmethicOperations;

public class CalculatorService extends AritmethicOperations {
    @Override
    public final Double subtract(Double num1, Double num2) {
        return num1 - num2;
    }

    @Override
    public double sum(double num1, double num2) {
        System.out.println("Double sum");
        return num1 + num2;
    }
}
