package architectoryHW6.Proxy;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public interface TimetableTrains {
    String[] getTimetable();

    String getTrainDepartureTime(String trainId);
}

// Класс, реализующий основной интерфейс
class TimetableElectricTrains implements TimetableTrains {
    @Override
    public String[] getTimetable() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader(new File("/tmp/electric_trains.csv")));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                list.add(line);
            }
        } catch (IOException e) {
            System.err.println("Error:  " + e);
        }
        return list.toArray(new String[list.size()]);
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        String[] timetable = getTimetable();
        for (int i = 0; i < timetable.length; i++) {
            if (timetable[i].startsWith(trainId + ";"))
                return timetable[i];
        }
        return "";
    }
}

// Клиентский класс
class DisplayTimetable {
    private TimetableTrains timetableTrains = new TimetableElectricTrains();

    public void printTimetable() {
        String[] timetable = timetableTrains.getTimetable();
        String[] tmpArr;
        System.out.println("Поезд\tОткуда\tКуда\t\tВремя отправления\tВремя прибытия\tВремя в пути");
        for (int i = 0; i < timetable.length; i++) {
            tmpArr = timetable[i].split(";");
            System.out.printf("%s\t%s\t%s\t\t%s\t\t\t\t%s\t\t\t%s\n", tmpArr[0], tmpArr[1], tmpArr[2], tmpArr[3], tmpArr[4], tmpArr[5]);
        }
    }
}

// тут реализуем логику класса-заместителя
// Создаём класс заместителя. В нем должна быть ссылка на сервисный объект
class TimetableElectricTrainsProxy implements TimetableTrains {
    // Ссылка на оригинальный объект
    private TimetableTrains timetableTrains = new TimetableElectricTrains();
    private String[] timetableCache = null;

    @Override
    public String[] getTimetable() {
        if (timetableCache == null) {
            timetableCache = timetableTrains.getTimetable();
        }
        return timetableCache;
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        if (timetableCache == null) {
            timetableCache = timetableTrains.getTimetable();
        }
        for (int i = 0; i < timetableCache.length; i++) {
            if (timetableCache[i].startsWith(trainId + ";"))
                return timetableCache[i];
        }
        return "";
    }
    // очищаем память
    public void clearCache() {
        timetableTrains = null;
    }
}
