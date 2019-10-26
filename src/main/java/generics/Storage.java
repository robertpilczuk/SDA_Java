package generics;

public class Storage<T, K> {

    private T[] elements;
    private K[] lements2;

    public Storage() {
        this.elements = (T[]) new Object[10];

    }

    public T[] getElements() {
        return elements;
    }

    public void add(T element) {
        if (size() == elements.length) {
            createNewTable();
        }
        int i = 0;
        do {
            if (elements[i] == null) {
                elements[i] = element;
                i = elements.length + 1;
            } else {
                i++;
            }
        } while (i < elements.length);


    }

    public int size() {
        int size = 0;
        for (T e : elements) {
            if (e != null) {
                size++;
            }
        }
        return size;
    }


    private void createNewTable() {
        if (size() == elements.length) {
            T[] temp = (T[]) new Object[elements.length + 5];
            for (int i = 0; i < elements.length; i++) {
                temp[i] = elements[i];
            }
            elements = temp;
        }
    }
}
