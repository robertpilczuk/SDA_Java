package comparable;

import lombok.ToString;
import serialization.ToSerialize;

public class Comparable {

    public static void main(String[] args) {
        compare(new Intjeger(0),new Intjeger(9));
        compare(new ToSerialize("","",0),new ToSerialize("","",0));
    }


    public static int compare(java.lang.Comparable a, java.lang.Comparable b){
        return a.compareTo(b);
    }


}
