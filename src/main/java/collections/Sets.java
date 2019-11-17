package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    private Set<String> set;

    public Sets() {
        this.set = new HashSet<>();
        this.set = new LinkedHashSet<>();
        this.set = new TreeSet<>();

    }
}
