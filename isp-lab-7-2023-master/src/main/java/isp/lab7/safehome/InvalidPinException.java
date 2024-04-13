package isp.lab7.safehome;

public class InvalidPinException extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    public InvalidPinException() {
    }

    public InvalidPinException(String message) {
        super(message);
    }
}
