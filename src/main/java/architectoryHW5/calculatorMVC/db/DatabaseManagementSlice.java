package architectoryHW5.calculatorMVC.db;

import architectoryHW5.calculatorMVC.db.fetchData.FetchDB;
import architectoryHW5.calculatorMVC.db.saveData.SaveData;

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
