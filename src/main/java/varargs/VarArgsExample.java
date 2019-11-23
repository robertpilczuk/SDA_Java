package varargs;

public class VarArgsExample {

    public void method(int one) {
        method(one, 0);
    }

    public void method(int one, int two) {
    }

    public void method(int one, int two, int three) {
    }

    public void method(int one, int two, int three, int four) {
    }

    public void method(int one, int two, int three, int four, int five) {
    }


    public void methodVarArgs(String s, int... args) {
        for (int i : args) {
            System.out.println(i);
        }
        int integ = args[0];
    }

    public void methodVarArgs(String s, String... args) {
        for (String i : args) {
            System.out.println(i);
        }
        String stringer = args[0];
    }


}
