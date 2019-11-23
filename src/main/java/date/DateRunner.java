package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import static java.time.temporal.ChronoUnit.MINUTES;
import static java.time.temporal.ChronoUnit.YEARS;

public class DateRunner {

    public static void main(String[] args) {
        System.out.println(new Date().getTime()+1*24*60*60*1000);


        System.out.println(LocalDate.now().getYear());
        System.out.println(LocalDate.now().plusDays(1));

        LocalDate localDate = LocalDate.parse("1983-11-21");
        LocalDate localDateEpoch = LocalDate.parse("1970-01-01");
        System.out.println(localDate.isBefore(localDateEpoch));

        LocalDate now = LocalDate.now();
        LocalDate me = now.minusYears(localDate.getYear())
        .minusMonths(localDate.getMonthValue())
        .minusDays(localDate.getDayOfMonth());

        System.out.println(me);

        LocalDate date = LocalDate.now().plus(4, YEARS);
        System.out.println(date);

        LocalDate retairment = LocalDate.parse("1983-11-21")
                .plus(65,YEARS);

        System.out.println(retairment);

        System.out.println(LocalDateTime.now().plus(10,MINUTES));


    }



}
