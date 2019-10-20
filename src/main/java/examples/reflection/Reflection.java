package examples.reflection;

import examples.inheritance.BaseClass;

import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        BaseClass myClass = new BaseClass(0,"");

        Field valueField = BaseClass.class.getDeclaredField("value");
        valueField.setAccessible(true);
        valueField.set(myClass,100);

        System.out.println(myClass.getValue());
    }
}
