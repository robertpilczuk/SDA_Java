package varargs;

public class Runner {

    public static void main(String[] args) {
        new VarargsExample().setter(1);
        new VarargsExample().setter(1, 1);
        new VarargsExample().setter(1, 2, 3);
        new VarargsExample().setter(1, 2, 3, 4);
        new VarargsExample().setter(1, 2, 3, 4, 5);
        new VarargsExample().setter(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14);

    }

}
