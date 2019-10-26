package hashcodeEquals;

public class SuperEqualsAndHashCode {
    private int value1;
    private int value2;

    public SuperEqualsAndHashCode(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public int hashCode() {
        return value1 / 3 - value2 * 10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (this.getClass() != o.getClass()) {
            return false;
        }
        SuperEqualsAndHashCode no = (SuperEqualsAndHashCode) o;

        return no.value1 == this.value1 && no.value2 == this.value2;
    }
}
