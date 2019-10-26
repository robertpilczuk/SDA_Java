package hashcodeEquals;

public class SuperEqualsAndHashCode {
    private int value1;
    private int value2;

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        return false;
    }
}
