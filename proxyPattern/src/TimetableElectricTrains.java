import java.util.ArrayList;

public class TimetableElectricTrains implements TimetableTrains {

    @Override
    public String[] getTimetable() {
        ArrayList<String> list = new ArrayList<>();
        String line1 = "9B-6854;Лондон;Прага;13:43;21:15;07:32";
        String line2 = "BA-1404;Париж;Грац;14:25;21:25;07:00";
        String line3 = "9B-8710;Прага;Вена;04:48;08:49;04:01";
        String line4 = "9B-8122;Прага;Грац;04:48;08:49;04:01";
        list.add(line1);
        list.add(line2);
        list.add(line3);
        list.add(line4);
        return list.toArray(new String[0]);
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        String[] timetable = getTimetable();
        for (String s : timetable) {
            if (s.startsWith(trainId + ";")) return s;
        }
        return "";
    }
}
