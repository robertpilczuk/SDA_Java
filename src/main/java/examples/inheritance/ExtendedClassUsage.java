package examples.inheritance;

public class ExtendedClassUsage {

    private ExtendedClass extendedClass;

    public ExtendedClassUsage(ExtendedClass extendedClass) {
        this.extendedClass = extendedClass;
    }

    public ExtendedClassUsage() {
        this.extendedClass = new ExtendedClass();
    }

    public void methotToShowUsage(){
        extendedClass.getName();


    }

}
