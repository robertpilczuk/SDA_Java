package tasks.date_20_10_2019.task4.liseners;

public class TddClass implements Listener {

    private int myInternalValue;

    public TddClass(int myInternalValue) {
        this.myInternalValue = myInternalValue;
    }

    @Override
    public void onValueChange(int value) {
        myInternalValue *= value;
        System.out.println(toString());
    }

    public void someMthod(){

    }

    @Override
    public String toString() {
        return "TddClass{" +
                "myInternalValue=" + myInternalValue +
                '}';
    }
}
