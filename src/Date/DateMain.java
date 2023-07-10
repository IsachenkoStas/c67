package Date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateMain {
    public static void main(String[] args) {

//        LocalDate date = LocalDate.now();
//        LocalDate date = LocalDate.of(1890, 2, 2);
//        LocalDate date = LocalDate.parse("2033-03-04");
//        date = date.plusDays(10);
//        date = date.plusMonths(12);
//        date = date.plusYears(1);
//        date = date.minusDays(10);
//     //   date = date.minus(5, ChronoUnit.CENTURIES);
//        System.out.println(date);
//        System.out.println(date.getDayOfWeek());

//        Scanner sc = new Scanner(System.in);
//        LocalDate date = LocalDate.parse(sc.nextLine());
//        System.out.println(date.getDayOfWeek());

//        LocalDate date = LocalDate.now();
//        do {
//            date = date.plusDays(1);
//        } while (!date.getDayOfWeek().equals(DayOfWeek.TUESDAY));
//        System.out.println(date);

        LocalDate d = LocalDate.now();
        System.out.println(d.format(DateTimeFormatter.ofPattern("yy_MM_dd")));
        System.out.println(d);
    }
}
