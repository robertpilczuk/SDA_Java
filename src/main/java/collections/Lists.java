package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {

    List<String> arrayList;
    List<String> linkedList;

    public Lists() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();
    }

    public void add(String element){
        arrayList.add(element);
        linkedList.add(element);
    }

    public void add(String element, int position){
        arrayList.add(position,element);
        linkedList.add(position,element);
    }



}
