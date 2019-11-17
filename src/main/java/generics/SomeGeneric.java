package generics;

public class SomeGeneric<T> {

    private T value;

    public SomeGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
