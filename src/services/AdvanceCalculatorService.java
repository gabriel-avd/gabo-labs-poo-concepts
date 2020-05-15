package services;

public class AdvanceCalculatorService extends CalculatorService {

    /*
    * OVERLOAD
    *   - Mismo nombre de metodo
    *   - Diferente numero o tipo de parametros
    *   - Puede devolver otro tipo de dato
    * */
    public Integer sum(Integer num1, Integer num2, Integer num3) {
        System.out.println("Integer sum");
        return num1 + num2+ num3;
    }



}
