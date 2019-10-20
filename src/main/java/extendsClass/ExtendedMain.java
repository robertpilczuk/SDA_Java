package extendsClass;

public class ExtendedMain {

    public static void main(String[] args) {
        ExtendedClass extendedClass = new ExtendedClass(1,1,1,1);
        BaseClass baseClass = new AnotherExtendedClass(1,1,1,1);


        baseClass.addAllNumbers();

    }

}
