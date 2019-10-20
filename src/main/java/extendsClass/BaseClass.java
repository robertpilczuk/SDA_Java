package extendsClass;

public class BaseClass {

    int packageScope;
    public int publicScope;
    private int privateScope;
    protected int protectedScope;

    public BaseClass(int packageScope,
                     int publicScope,
                     int privateScope,
                     int protectedScope) {
        this.packageScope = packageScope;
        this.publicScope = publicScope;
        this.privateScope = privateScope;
        this.protectedScope = protectedScope;
    }

    public int addAllNumbers() {
        return privateScope + publicScope + protectedScope + packageScope;
    }

}
