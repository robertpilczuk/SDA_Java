package examples.stream;

import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        int[] table = {1, 2, 3, 4, 44, 44, 234234, 442, 11, 776, 878, 5345, 234, 24, 234, 234234};

        int sum = 0;
        for (int i = 0; i < table.length; i++) {
            if (table[i] > 11) {
                sum += table[i];
            }
        }
        System.out.println(sum);

        long count = Arrays.stream(table).count();
        System.out.println(count);

        Predicate<Integer> pred= new MyPredicate(33);

        int myStremSum = Arrays.stream(table)
                .filter(e -> e > 11)
                .filter(new OwnPredicate()::test)
                .filter(pred::test)
                .map(e -> e + 1)
                .sum();
        System.out.println(myStremSum);

        int[] array = Arrays.stream(table).filter(e -> e > 11)
                .filter(e -> e < 5454)
                .toArray();

        Arrays.stream(table).filter(e -> e > 11)
                .filter(e -> e < 5454)
                .mapToObj(e -> String.valueOf(e))
                .collect(Collectors.toList());

    }

    public boolean apply(int e) {
        return e > 11;
    }
}
