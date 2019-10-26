package tasks.date_20_10_2019.task4;

public class YouCanTAddMoreException extends IndexOutOfBoundsException {

    private String myMessage;

    public YouCanTAddMoreException(String myMessage) {
        super();
        this.myMessage = myMessage;
    }


    @Override
    public String getMessage() {
        return myMessage;
    }
}
