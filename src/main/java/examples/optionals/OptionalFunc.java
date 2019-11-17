package examples.optionals;

import java.util.Optional;

public class OptionalFunc {


    public Integer add(Optional<Integer> int1, Optional<Integer> int2){
        // int1 == null , int2 == null return null
        // int1 != null ,int2 == null return int1
        // int1 == null ,int2 != null return int2
        // int1 != null ,int2 != null return int1 + int2
        if (int1.isPresent() &&  int2.isPresent()){
            return int1.get()+ int2.get();
        }
        if (int1.isPresent() &&  int2.isEmpty()){
            return int1.get();
        }
        if (int1.isEmpty() &&  int2.isPresent()){
            return int2.get();
        }
        return null;
    }



}
