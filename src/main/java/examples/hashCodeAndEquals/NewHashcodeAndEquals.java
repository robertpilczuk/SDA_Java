package examples.hashCodeAndEquals;

import java.util.Objects;

public class NewHashcodeAndEquals {

    private int value;
    private String name;//Al
    private String lastName;
    //private String pesel;
    private int age;
    private Address addres;

    public NewHashcodeAndEquals(int value
            , String name
            , String lastName
            , int age
    ) {
        this.value = value;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

//    public int hashCode(){
//        return age
//                +name.toCharArray()[0]*100
//                +lastName.toCharArray()[0]*10000;
//    }
//
//    public int hashCode() {
//        char[] chars = name.toCharArray();
//        int hashCode = -345677;
//        for (int i = 0; i < chars.length; i++) {
//            hashCode += chars[i]*(i+1);
//        }
//        return hashCode;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o instanceof NewHashcodeAndEquals){
            NewHashcodeAndEquals casted = (NewHashcodeAndEquals) o;
            return this.value == casted.value
                    && this.age == casted.age
                    && this.name.matches(casted.name)
                    && this.lastName.equals(casted.lastName);
        }
        return false;
    }
}
