package collections;

import java.util.*;

public class CollectionsRunner {


    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        for (int i = 0; i < 8; i++) {
            arrayList.add(String.valueOf(i));
            linkedList.add(String.valueOf(i));
        }

        arrayList.remove(5);
        linkedList.remove(7);

        arrayList.add(2, "333");// add to position ans shift
        linkedList.add(2, "333");

        arrayList.set(1, "22");// replaces value
        linkedList.set(1, "22");

        arrayList.addAll(linkedList);

        System.out.println(arrayList.indexOf("333"));

        arrayList.sort(Comparator.comparingInt(Integer::valueOf));
        System.out.println(arrayList);
        System.out.println(linkedList);


        Map<Integer,String> map = new HashMap<>();
        Map<String ,String> translationEN = new HashMap<>();
        Map<String ,String> translationPL = new HashMap<>();
        Map<String ,String> coder = new HashMap<>();

        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");


        translationEN.put("APP_NAME","Super hiper converter ");
        translationPL.put("APP_NAME","Konwerter jednostek");

        coder.put("w","r");
        coder.put("d","h");

        System.out.println(coder.get("w"));

        UserService user1 = new UserService("Zdzichu");

        Map<String,UserService> users = new HashMap<>();

        users.put("Zdzichu",user1);

        greet("Zdzichu", users);

        Set<String> mySet = new HashSet<>();

        mySet.add("string");
        mySet.add("444");
        mySet.add("dfr");
        mySet.add("ffff");


        System.out.println(mySet);

    }

    public static void greet(String name,Map<String,UserService> map){
        map.get(name).sayHello();
        map.get(name).roast();
        System.out.println(map.get(name).getAccount());
    }




}
