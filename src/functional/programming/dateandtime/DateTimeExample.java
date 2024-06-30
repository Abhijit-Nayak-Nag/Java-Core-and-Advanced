package functional.programming.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {

        // current date and time :
        LocalDateTime now= LocalDateTime.now();
        System.out.println("Current date and time: " + now);

        //specific date and time :
        LocalDate date= LocalDate.of(2024, Month.MAY, 11);
        LocalTime time= LocalTime.of(7,6,0);
        LocalDateTime dateTime= LocalDateTime.of(date, time);
        System.out.println("Specific Date and Time: "+ dateTime);


        // Adding/ Substring days to/ from date

        LocalDate tomorrow= LocalDate.now().plusDays(1);
        System.out.println("Tomorrow is:" +tomorrow);

        LocalDate yesterDay= LocalDate.now().minusDays(1);
        System.out.println("Yester Day was :" +yesterDay);

        // Parsing a String to date-Time:
        String dateStr= "2024-05-23 12:00";
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime parsedDateTime= LocalDateTime.parse(dateStr, formatter);
        System.out.println("Parsed Date and Time: " + parsedDateTime);

    }
}
