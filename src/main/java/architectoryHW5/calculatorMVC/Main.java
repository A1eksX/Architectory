package architectoryHW5.calculatorMVC;

import architectoryHW5.calculatorMVC.db.DatabaseManagementSlice;
import architectoryHW5.calculatorMVC.db.fetchData.FetchDB;
import architectoryHW5.calculatorMVC.db.saveData.SaveData;
import architectoryHW5.calculatorMVC.view.ConsoleView;
import architectoryHW5.calculatorMVC.view.IView;
import architectoryHW5.calculatorMVC.view.input.InputSlice;

public class Main {
    public static void main(String[] args) {
        DatabaseManagementSlice managementSlice = new DatabaseManagementSlice(new FetchDB(), new SaveData());
        IView view = new ConsoleView(new InputSlice());
        view.runCalculator();
    }
}