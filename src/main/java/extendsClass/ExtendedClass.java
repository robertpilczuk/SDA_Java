package extendsClass;


import interfaces.AddInterface;
import interfaces.Second;

public class ExtendedClass extends BaseClass {


    public ExtendedClass(int packageScope,
                         int publicScope,
                         int privateScope,
                         int protectedScope) {
        super(packageScope,
                publicScope,
                privateScope,
                protectedScope);
    }

    public double add(int a, int b){
        return  a+b;
    }


    public int addAllNumbers() {
        return 10;
    }

}
