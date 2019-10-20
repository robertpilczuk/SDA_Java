package task4;

public class NumberSercher {

    private int[] ints;

    public NumberSercher(int[] myInts) {
        ints = myInts;
    }


    public int[] minMax(){
        int[] result = new int[2];
        result[1] = Integer.MIN_VALUE;
        result[0] = Integer.MAX_VALUE;
        for (int num: ints){
            if (num < result[0]){
                result[0] = num;
            }
            if (num > result[1]){
                result[1] = num;
            }
        }

        return result;
    }


}
