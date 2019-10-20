package futures;

import examples.inheritance.BaseClass;
import examples.inheritance.ExtendedClass;

import java.lang.reflect.Field;
import java.util.Calendar;

import static java.lang.Boolean.TRUE;

public class Date {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Calendar calendar = new Calendar.Builder().setDate(2019,12,31).build();
        Calendar newCalendar = new Calendar.Builder().setDate(2019,12,31).build();
        int result = calendar.compareTo(newCalendar);
        System.out.println("Calendar compare: " + result);

        System.out.println(calendar.hashCode());
        System.out.println(newCalendar.hashCode());


    }


}
