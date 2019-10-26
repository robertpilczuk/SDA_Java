package singleton;

public class Runner {


    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(singleton);

        Singleton newSingleton = Singleton.getInstance();

        System.out.println(newSingleton);
    }

}
