package tasks.date_20_10_2019.task4;

import tasks.date_20_10_2019.task4.liseners.*;

public class Runner {

    public static void main(String[] args) {

        Emiter emiter = new Emiter(5);

        try {
            emiter.addListener(new SomeClass());
            emiter.addListener(new OMGClass());
            emiter.addListener(new BddClass());
            emiter.addListener(new TddClass(3));
            emiter.addListener(new DddClass());
//            emiter.addListener(new TddClass(6)); // Adding this Listener will cause Exception and prints message

        }catch (YouCanTAddMoreException e){
            System.out.println(e.getMessage());
        }

        emiter.setValue(4);
        emiter.setValue(2);
        emiter.setValue(5);
        emiter.setValue(2);
        emiter.setValue(1);



    }

}
