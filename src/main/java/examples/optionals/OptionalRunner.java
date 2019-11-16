package examples.optionals;

import java.util.Optional;

public class OptionalRunner {

    public static void main(String[] args) {
        String nullString = null;


        Optional<String> opt= Optional.ofNullable(nullString);

        if (opt.isPresent()){
            System.out.println(opt.get());
        }else {
            System.out.println("not present");
        }

        opt.ifPresent(System.out::println);

        opt.ifPresentOrElse(System.out::println, () -> {
            System.out.println("not present");

            System.out.println(opt.orElse("wow"));

        });
    }


}
