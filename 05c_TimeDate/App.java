// import java.time.LocalDate;
// import java.time.LocalDateTime;
// import java.time.LocalTime;
// import java.time.Month;

import java.time.*;
import java.util.Calendar;

public class App {

    public static void main(String[] args) {

        System.out.println("---------- Datum / Ausgaben --------------------");

        // aktuelle Datum
        LocalDate today = LocalDate.now();
        System.out.println("Heutiges Datum: " + today);

        // bestimmtes Datum
        LocalDate givenDate = LocalDate.of(2012, Month.SEPTEMBER, 21);
        System.out.println("Bestimmtes Datum: " + givenDate);

        // nächste Woche
        LocalDate aWeekFromToday = today.plusWeeks(1);
        System.out.println("Datum in einer Woche: " + aWeekFromToday);

        // gestern
        LocalDate yesterday = today.minusDays(1);
        System.out.println("Gestern: " + yesterday);

        System.out.println("---------- Vergleiche --------------------");

        System.out.println("Schaltjahr?: " + givenDate.isLeapYear());
        System.out.println("Heute/Gestern: " + today.isAfter(yesterday));
        System.out.println("Gestern/Heute: " + yesterday.isBefore(today));
        System.out.println("heute/heute: " + today.isEqual(today));

        System.out.println("---------- Extraktion --------------------");

        int year = today.getYear();
        System.out.println("aktuelles Jahr: " + year);

        givenDate = LocalDate.of(2020, Month.OCTOBER, 9);
        String weekday = givenDate.getDayOfWeek().name();
        System.out.println("Wochentag: " + weekday);
        System.out.println("Thank God it's " + weekday);

        System.out.println(today.getDayOfMonth());

        System.out.println("---------- Zeit / Ausgaben --------------------");

        LocalTime justNow = LocalTime.now();
        System.out.println("Jetzt: " + justNow);

        LocalTime newTime = LocalTime.of(12, 00);
        System.out.println("Mittag: " + newTime);

        LocalTime inOneHour = justNow.plusHours(1);
        System.out.println("In einer Stunde: " + inOneHour);

        System.out.println("---------- Extraktion --------------------");

        int hour = justNow.getHour(); // hora
        System.out.println("H: " + hour);

        int minute = justNow.getMinute();
        System.out.println("MIN: " + minute);

        System.out.println("---------- DateTime --------------------");

        LocalDateTime timeStamp = LocalDateTime.now();
        System.out.println("timeStamp: " + timeStamp);

        System.out.println("---------- Kalenderwoche --------------------");

        Calendar cal = Calendar.getInstance();
        System.out.println("Kalenderwoche: " + cal.get(Calendar.WEEK_OF_YEAR));

    }

}
