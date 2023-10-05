package architectorySeminar5.calculatorMVC;

import architectorySeminar5.calculatorMVC.db.DatabaseManagementSlice;
import architectorySeminar5.calculatorMVC.db.fetchData.FetchDB;
import architectorySeminar5.calculatorMVC.db.saveData.SaveData;
import architectorySeminar5.calculatorMVC.view.ConsoleView;
import architectorySeminar5.calculatorMVC.view.IView;
import architectorySeminar5.calculatorMVC.view.input.InputSlice;
import architectorySeminar5.calculatorMVC.view.output.OutputSlice;

public class Main {
    public static void main(String[] args) {
        DatabaseManagementSlice managementSlice = new DatabaseManagementSlice(new FetchDB(), new SaveData());
        IView view = new ConsoleView(new InputSlice());
        view.runCalculator();
    }
}