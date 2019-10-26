package examples.abstractClass;

public abstract class AbstractClass {

    private String value;

    public AbstractClass(String value) {
        this.value = value;
    }

    public abstract void doStuff();

    public String retutnValue(){
        return value;
    }
}
