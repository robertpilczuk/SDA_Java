package tasks.date_20_10_2019.task2;

import java.awt.*;

public class ParsedArguments {

    private int number;
    private String ipAddres;
    private long longNumber;
    private char someChar;
    public Point point;

    public void setPoint(Point point) {
        this.point = point;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setIpAddres(String ipAddres) {
        this.ipAddres = ipAddres;
    }

    public void setLongNumber(long longNumber) {
        this.longNumber = longNumber;
    }

    public void setSomeChar(char someChar) {
        this.someChar = someChar;
    }

    @Override
    public String toString() {
        return "ParsedArguments{" +
                "number=" + number +
                ", ipAddres='" + ipAddres + '\'' +
                ", longNumber=" + longNumber +
                ", someChar=" + someChar +
                ", point=" + point.toString() +
                '}';
    }
}
