package architectoryHW5.calculatorMVC.model.substractOperation;

public class SubstractOperation implements InterfaceSubstractOperation {
    public SubstractOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    double firstArg;
    double secondArg;

    public double subtract() {
        return firstArg - secondArg;
    }
}
