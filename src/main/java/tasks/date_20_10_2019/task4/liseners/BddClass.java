package tasks.date_20_10_2019.task4.liseners;

public class BddClass implements Listener{

    private String value;

    @Override
    public void onValueChange(int value) {
        this.value = String.valueOf(value);
    }
}
