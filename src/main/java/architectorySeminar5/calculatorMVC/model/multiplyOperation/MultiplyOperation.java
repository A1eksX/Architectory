package architectorySeminar5.calculatorMVC.model.multiplyOperation;


public class MultiplyOperation implements InterfaceMultiplyOperation {
    double firstArg;
    double secondArg;
    /**
     * Операция умножения, в метод MultiplyOperation передаются 2 аргумента
     * @param firstArg передаётся первый аргумент
     * @param secondArg передаётся второй аргумент
     */
    public MultiplyOperation(double firstArg, double secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    /**
     * Операция умножения, в метод MultiplyOperation передаются 2 аргумента
     */
        // Умножение
    public double multiply() {
        return firstArg * secondArg ;
    }
}
