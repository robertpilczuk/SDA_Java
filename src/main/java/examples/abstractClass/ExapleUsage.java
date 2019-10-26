package examples.abstractClass;

public class ExapleUsage {

    private AbstractClass abstractClass;
    private AbstractClass abstractClass2;
    private ClassExtendingAbstractClass classExtendingAbstractClass;


    public void someMethod() {
        abstractClass = new AbstractClass("") {
            @Override
            public void doStuff() {

            }
        };

        classExtendingAbstractClass = new ClassExtendingAbstractClass("");

        abstractClass2 = new ClassExtendingAbstractClass("");
    }

}
