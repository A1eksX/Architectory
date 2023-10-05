package architectoryHW5.calculatorMVC.view;


import architectoryHW5.calculatorMVC.model.CalculationLayer;
import architectoryHW5.calculatorMVC.view.input.InputSlice;
import architectoryHW5.calculatorMVC.view.output.OutputSlice;

public class ConsoleView implements IView {
    InputSlice inputSlice;
    OutputSlice outputSlice;
    CalculationLayer calculationLayer;

    public ConsoleView(InputSlice inputSlice) {
        this.inputSlice = inputSlice;
        calculationLayer = new CalculationLayer();
    }

    @Override
    public void runCalculator() {

    }
}
