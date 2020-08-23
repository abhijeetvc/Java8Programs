// Java 8 Date: Duration, Period, ChronoUnit
// Duration: Measures time in seconds and nanoseconds
// Period: Measures time in years, months and days

import java.time.*;
import java.time.temporal.ChronoUnit;

public class JavaEightDates {

    public static void main(String[] args) {

        Duration dura1=Duration.ofHours(1);
        System.out.println(dura1.getSeconds());

        Duration dura2=Duration.of(2, ChronoUnit.HOURS);
        System.out.println(dura2.getSeconds());

        LocalDateTime date1=LocalDateTime.of(2020, Month.JANUARY,31,10,20,55);
        LocalDateTime date2=LocalDateTime.of(2020,Month.AUGUST,23,10,30,55);

        Duration dura3=Duration.between(date1,date2);
        System.out.println(dura3.getSeconds());

        Period p1=Period.ofDays(10);
        System.out.println(p1.getDays());

        Period p2=Period.of(1,2,3);
        System.out.println(p2.getYears());
        System.out.println(p2.getMonths());
        System.out.println(p2.getDays());

        LocalDate date3=LocalDate.of(2000, Month.JANUARY,31);
        LocalDate date4=LocalDate.of(2020,Month.AUGUST,23);

        Period p3=Period.between(date3,date4);
        System.out.println(p3.getYears()+" Years");  //
        System.out.println(p3.getMonths()+ " Months"); //
        System.out.println(p3.getDays()+ " Days"); //

    }

}
