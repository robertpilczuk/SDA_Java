package iterator;

import java.util.Iterator;

public class Iter implements Iterator<Integer> {


    private int[] myInts;
    private int iteratorStatus = 0;

    public Iter(int[] myInts) {
        this.myInts = myInts;
    }

    public Integer next() {
        return myInts[iteratorStatus++];
    }

    public boolean hasNext() {
        return (myInts.length - iteratorStatus) > 0;
    }

}
