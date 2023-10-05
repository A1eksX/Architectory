package architectoryHW5.calculatorMVC.model;

import architectoryHW5.calculatorMVC.model.divideOperation.DivideOperation;
import architectoryHW5.calculatorMVC.model.divideOperation.InterfaceDivideOperation;
import architectoryHW5.calculatorMVC.model.multiplyOperation.InterfaceMultiplyOperation;
import architectoryHW5.calculatorMVC.model.multiplyOperation.MultiplyOperation;
import architectoryHW5.calculatorMVC.model.substractOperation.InterfaceSubstractOperation;
import architectoryHW5.calculatorMVC.model.substractOperation.SubstractOperation;
import architectoryHW5.calculatorMVC.model.sumOperation.InterfaceSumOperation;
import architectoryHW5.calculatorMVC.model.sumOperation.SumOperation;

public class CalculationLayer {
    public double add(double a, double b) {
        InterfaceSumOperation sumOperation = new SumOperation(a, b);
        return sumOperation.sum();
    }

    public double subtract(double a, double b) {
        InterfaceSubstractOperation substractOperation = new SubstractOperation(a,b);
        return substractOperation.subtract();
    }

    public double multiply(double a, double b) {
        InterfaceMultiplyOperation multiplyOperation = new MultiplyOperation(a, b);
        return multiplyOperation.multiply();
    }

    public double divide(double a, double b) {
        // Деление
        InterfaceDivideOperation divideOperation = new DivideOperation(a,b);
        return divideOperation.divide();
    }
}