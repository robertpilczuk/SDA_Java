package serialization;

import examples.hashCodeAndEquals.Address;


public class ToSerialize implements Comparable<ToSerialize>{

    private String firstName;
    private String lastName;
    private int age;

    public ToSerialize(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" +
                "\"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                ", \"age\":" + age +
                '}';
    }

    public int compareTo(ToSerialize o){
        return 0;
    }

//    <firstName>Maciej</firstName>
//    <lastName>Brzozowski</lastName>
//    <age>18</age>
//    <address>
//        <street>s</street>
//        <houseNumber>s</houseNumber>
//        <flat>s</flat>
//        <zipCode>s</zipCode>
//        <city>s</city>
//    </address>
}
