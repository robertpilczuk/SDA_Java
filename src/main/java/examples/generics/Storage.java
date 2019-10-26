package examples.generics;

public class Storage<T> {

    private T[] storage;

    public Storage() {
        this.storage = (T[])new Object[10]; // workaround to create table of type T
    }

    public void add(T element){
        int i = 0;
        do {
            if (storage[i] == null) {
                storage[i] = element;
                i=storage.length+1;
            }else {
                i++;
            }
        } while (i < storage.length);
    }


    public T[] getStorage() {
        return storage;
    }
}
