package generics;


public class GenericMap<K, V> {

    private K[] keys;
    private V[] values;

    public GenericMap() {
        keys = (K[]) new Object();
        values = (V[]) new Object();

    }


    public K[] getKeys() {
        return keys;
    }

    public V[] getValues() {
        return values;
    }
}
