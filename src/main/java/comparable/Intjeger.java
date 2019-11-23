package comparable;

public class Intjeger implements java.lang.Comparable<Intjeger>{

    private Integer internal;

    public Intjeger(Integer internal) {
        this.internal = internal;
    }

    @Override
    public int compareTo(Intjeger o) {
        if(internal > o.internal){
            return 1;
        }
        if(internal < o.internal){
            return -1;
        }
        return 0;
    }
}
