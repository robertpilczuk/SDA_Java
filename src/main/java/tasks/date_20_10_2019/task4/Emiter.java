package tasks.date_20_10_2019.task4;

import tasks.date_20_10_2019.task4.liseners.Listener;
import tasks.date_20_10_2019.task4.liseners.OMGClass;
import tasks.date_20_10_2019.task4.liseners.TddClass;

public class Emiter {

    private int value;
    private Listener[] listener;
    private static int place = 0;

    public Emiter(int i) {
        this(i, 5);
    }

    public Emiter(int i, int elements) {
        value = i;
        listener = new Listener[elements];
    }

    public void setValue(int value) {
        this.value = value;
        for (Listener l : listener) {
            if (l != null) {
                l.onValueChange(value);
            }
        }
    }


    public void addListener(Listener l) throws YouCanTAddMoreException {
        if (place >= listener.length){
            throw new YouCanTAddMoreException("You can't add more than " + listener.length);
        }

        listener[place++] = l;

    }

    public Listener[] getListener() {
        return listener;
    }
}
