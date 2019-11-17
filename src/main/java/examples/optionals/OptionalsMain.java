package examples.optionals;

import java.io.BufferedReader;
import java.io.File;
import java.util.Arrays;
import java.util.Optional;

public class OptionalsMain {

    public static void main(String[] args) {
        int[] table = {1,3,45,5,66,33,55};
        Arrays.stream(table).filter(e -> e < 0)
                .findFirst().ifPresent(System.out::println);

        Optional.empty();


    }



}
