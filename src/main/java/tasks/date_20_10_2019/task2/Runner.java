package tasks.date_20_10_2019.task2;

public class Runner {

    public static void main(String[] args) {
        // przekazane argumenty -i 123 -ip 127.0.0.1 -l 12345667 -c A

        ArgumentsAnalizer analizer = new ArgumentsAnalizer(args,new ParsedArguments());
        ParsedArguments arguments = analizer.splitArguments();
        System.out.println(arguments.toString());

// zanim co kolwiek zrobisz zawsze sprawdź co otrzymujesz
//        for (String s: args){
//            System.out.println(s);
//        }


    }

}
