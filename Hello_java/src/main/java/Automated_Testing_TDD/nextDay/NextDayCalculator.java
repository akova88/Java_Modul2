package Automated_Testing_TDD.nextDay;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NextDayCalculator {
    public static String findNextDate(String dayNow) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(dayNow,formatter);
        LocalDate nextDate = date.plusDays(1);
//        throw new UnsupportedOperationException();
        return nextDate.format(formatter);
    }


}
