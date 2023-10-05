package architectorySeminar5.calculatorMVC.view;


import architectorySeminar5.calculatorMVC.db.saveData.SaveData;
import architectorySeminar5.calculatorMVC.model.CalculationLayer;
import architectorySeminar5.calculatorMVC.view.input.InputSlice;
import architectorySeminar5.calculatorMVC.view.output.OutputSlice;

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
