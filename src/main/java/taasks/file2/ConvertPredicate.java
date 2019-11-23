package taasks.file2;

import java.util.function.Predicate;

public class ConvertPredicate implements Predicate<String> {

    private String matcher;

    public ConvertPredicate(String matcher) {
        this.matcher = matcher;
    }

    @Override
    public boolean test(String o){
        return o.startsWith(matcher);
    }
}
