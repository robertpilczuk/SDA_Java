package taasks.file;

import java.util.function.Predicate;

public class FilterPredicate implements Predicate<String> {

    private String matcher;

    public FilterPredicate(String matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean test(String o) {

        return o.startsWith(matcher);
    }
}
