package futures;

import examples.hashCodeAndEquals.HashCodeEquals;

public class HashCodeAndEqualsUsage {

    public static void main(String[] args) {

        HashCodeEquals object1 = new HashCodeEquals();
        HashCodeEquals object2 = new HashCodeEquals();

        System.out.println(object1.getCounter());
        System.out.println(object2.getCounter());



    }

}
