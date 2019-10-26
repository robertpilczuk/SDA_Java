package abstractClasses;

public abstract class AbstractClass {
    protected String name;

    public abstract void setName(String name);

    public void doFunStuff(){
        name = null;
    }
}
