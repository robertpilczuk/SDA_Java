package tasks.date_20_10_2019.task3;

public class Runner {

    public static void main(String[] args) {

        Storage storage = new Storage();

        storage.add(new SingleElement("1"));
        storage.add(new SingleElement("2"));
        storage.add(new SingleElement("3"));
        storage.add(new SingleElement("4"));
        storage.add(new SingleElement("5"));
        storage.add(new SingleElement("5"));
        storage.add(new SingleElement("7"));

        System.out.println("Actual size stored elements count: "+storage.size());
        System.out.println("Length of storage table: "+storage.getElements().length);


    }
}
