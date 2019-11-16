package examples.stream;

import java.util.function.Predicate;

public class OwnPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer o) {
        return o > 11;
    }
}
