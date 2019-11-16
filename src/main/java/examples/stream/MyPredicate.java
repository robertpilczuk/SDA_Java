package examples.stream;

import java.util.function.Predicate;

public class MyPredicate implements Predicate<Integer> {

    private int value;

    public MyPredicate(int value) {
        this.value = value;
    }

    @Override
    public boolean test(Integer integer) {
        return integer < value;
    }
}
