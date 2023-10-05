package architectorySeminar5.calculatorMVC.db;

import architectorySeminar5.calculatorMVC.db.fetchData.DBInterface;
import architectorySeminar5.calculatorMVC.db.fetchData.FetchDB;
import architectorySeminar5.calculatorMVC.db.saveData.SaveData;
import architectorySeminar5.calculatorMVC.db.saveData.SaveDataInterface;

public class DatabaseManagementSlice {
    private FetchDB fetchDB;
    private SaveData saveData;

    public DatabaseManagementSlice(FetchDB fetchDB, SaveData saveData) {
        this.fetchDB = fetchDB;
        this.saveData = saveData;
    }

    public String fetchData() {
        return null;
    }

    public void saveData(String data) {

    }
}
