package exceptions;

public class SomthingIsNoYesException extends IllegalArgumentException{

    private String message;
    private int statusCode;

    public SomthingIsNoYesException(String message,
                                    int statusCode) {
        super(message);
        this.message = message;
        this.statusCode = statusCode;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public int getStatusCode() {
        return statusCode;
    }
}
