package examples.generics;

public class Runner {
    public static void main(String[] args) {
        Storage<String> storage = new Storage<>();

        storage.add("T");
        storage.add("D");
        storage.add("A");


        Storage<Integer> storage2 = new Storage<>();

        storage2.add(1);
        storage2.add(2);
        storage2.add(3);

    }

}
