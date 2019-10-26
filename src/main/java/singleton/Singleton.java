package singleton;

public class Singleton {
    private int value;


    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }

    private Singleton(){

    }


    public int getValue() {
        return value;
    }
}
