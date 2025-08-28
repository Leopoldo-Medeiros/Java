package Dates;

import java.time.*;

public class Main {
    public static void main(String[] args) {
         // Working with dates
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now);
        System.out.println(now.getYear());
        System.out.println(now.getMonth());
        System.out.println(now.getDayOfMonth());
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.minusDays(10));

        // Working with dates
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        // Creating Specific Dates
        LocalDateTime someDate = LocalDateTime.of(
                2013,
                10,
                20,
                1,
                30,
                58
        );
        System.out.println(someDate);

        LocalDate someDate2 = LocalDate.of(
                2013,
                10,
                20
        );
        LocalTime someTime = LocalTime.of(12, 55, 22);
        System.out.println(someTime);

        // Zone Id
        // Working wih dates
        LocalDateTime now2 = LocalDateTime.now();
        LocalDateTime nowInBrazil = LocalDateTime.now(ZoneId.of("America/Sao_Paulo"));
        System.out.println("Local time: " + now2);
        System.out.println("Brazil time: " + nowInBrazil);

        for (String zone : ZoneId.getAvailableZoneIds()) {
            System.out.println(zone);
        }

        // Other Date Classes
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now());
    }
}
