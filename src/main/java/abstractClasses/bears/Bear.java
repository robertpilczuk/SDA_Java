package abstractClasses.bears;

public abstract class Bear {

    private int legs;
    protected String furCollor;

    public abstract void setFurCollor(String color);
    public abstract void roar();

    public String getFurCollor() {
        return furCollor;
    }
}
