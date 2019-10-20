package extendsClass;


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

    public double add(int a, int b) {
        return a + b;
    }

    @Override
    public int addAllNumbers() {
        return 10;
    }

}
