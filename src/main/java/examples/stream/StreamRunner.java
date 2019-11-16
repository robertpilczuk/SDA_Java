package examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;


public class StreamRunner {

    private static int expected = 9;

    public static void main(String[] args) {
        int[] list = {1, 1, 3, 5, 6, 7, 98, 4, 3, 2, 4, 56, 33, 3543, 23, 232};


        int counter = 0;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > expected) {
                counter++;
            }
        }
        System.out.println("Counted elements:" + counter);

        int counterIterator = 0;
        for (int e : list) {
            if (e > expected) {
                counterIterator++;
            }
        }

        System.out.println("Counted elements:" + counterIterator);

        long count = Arrays.stream(list).filter(e -> e > expected).count();
        System.out.println("Counted elements:" + count);

        List<String> stringList = Arrays.stream(list).filter(e -> e > expected).mapToObj(e -> String.valueOf(e)).collect(Collectors.toList());

        System.out.println(stringList);

        int holder = 0;
        Arrays.stream(list).map(e -> new Mapper().apply(e)).map(e -> holder + e).mapToObj(e -> new Mapper2().apply(e)).forEach(System.out::println);

        OptionalInt opt= Arrays.stream(list).filter(e -> e < 0 ).findFirst();
        System.out.println(opt.orElse(666));
    }


    static class Mapper implements IntFunction<Integer> {
        public Integer apply(int input) {
            System.out.println(input);
            return input;
        }
    }

    static class Mapper2 implements Function<Integer,String>{

        @Override
        public String apply(Integer in) {
            System.out.println(in);
            return String.valueOf(in);
        }
    }

}
