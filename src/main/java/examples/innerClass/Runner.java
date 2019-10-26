package examples.innerClass;

import examples.innerClass.OutsideClass.PublicInnerClass;

public class Runner {

    public static void main(String[] args) {
        OutsideClass outsideClass = new OutsideClass();

        PublicInnerClass innerClass = outsideClass.new PublicInnerClass();

        PublicInnerClass publicInnerClass = new OutsideClass().new PublicInnerClass();


        System.out.println(outsideClass.returnValue());
        System.out.println(publicInnerClass.returnValue());


    }

}
