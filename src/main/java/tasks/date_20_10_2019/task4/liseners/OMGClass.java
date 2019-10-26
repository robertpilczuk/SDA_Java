package tasks.date_20_10_2019.task4.liseners;

import java.awt.*;

public class OMGClass implements Listener {

    private int value;
    private String myString;
    private Point point;

    @Override
    public void onValueChange(int value) {
        this.value = value;
        System.out.println(toString());
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getMyString() {
        return myString;
    }

    public void setMyString(String myString) {
        this.myString = myString;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "OMGClass{" +
                "value=" + value +
                '}';
    }
}
