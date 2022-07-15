package training.date;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class MainDate2 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Before formatting: " + localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E, MMM dd yyyy hh mm ss ").withZone(ZoneId.of("Asia/Kolkata"));
        System.out.println("Before formatting: " + localDateTime);

        String formatterDate = localDateTime.format(dateTimeFormatter);
        System.out.println("After formatting: " + formatterDate);

        ZoneId zone = ZoneId.systemDefault();
        System.out.println(zone);
    }
}
