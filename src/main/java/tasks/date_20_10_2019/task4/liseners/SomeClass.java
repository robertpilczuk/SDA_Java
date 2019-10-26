package tasks.date_20_10_2019.task4.liseners;

public class SomeClass implements Listener {
    @Override
    public void onValueChange(int value) {
        System.out.println(this.getClass().getName() + ":" + value);
    }

    public void my(){}
}
