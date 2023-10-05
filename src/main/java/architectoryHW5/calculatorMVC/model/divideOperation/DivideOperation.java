package architectoryHW5.calculatorMVC.model.divideOperation;

public class DivideOperation implements InterfaceDivideOperation {
    double firstArg;
    double secondArg;

    public DivideOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }
        // Деление
    public double divide() {
        return firstArg / secondArg;
    }
}
