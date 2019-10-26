package varargs;

public class VarargsExample {

    public VarargsExample(String... values) {
    }

    public void setter(int... ints) {
        int myint = ints[0];
    }

    public void getString(String... names) {
        String str = names[names.length - 1];
    }

    public void getString2(int myInt, String... names) {
        String str = names[names.length - 1];
    }
}
