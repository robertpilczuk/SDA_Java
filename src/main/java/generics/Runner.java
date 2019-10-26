package generics;

import tasks.date_20_10_2019.task4.liseners.SomeClass;
import tasks.date_20_10_2019.task4.liseners.TddClass;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Storage<PublicKey, Integer> storage = new Storage<>();

        Storage<PrivateKey, Integer> storage1 = new Storage<>();

        List<String> list = new ArrayList<>();
        List<TddClass> list1 = new LinkedList<>();


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "I");
        map.put(2, "II");
        map.put(4, "IV");
        map.put(3, "III");
        map.put(6, "VI");
        map.put(5, "V");
        map.put(8, "VIII");
        map.put(7, "VII");
        map.put(9, "IX");
        map.put(10, "X");
        map.replace(10, "II");
        map.put(119283, "X");
        map.put(11, null);

//
//        System.out.println(map.get(2));
//        System.out.println(map.get(11));
//        System.out.println(map.get(12));

        Set<String> set = new HashSet<>();
        set.add("ddssd");
        set.add("qqq");
        set.add("abs");

        for (String s : set.toArray(new String[0])) {
            System.out.println(s);
        }


    }

}
