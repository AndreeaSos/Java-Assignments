package isp.lab7.safehome;

public class TooManyAttemptsException extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    public TooManyAttemptsException() {
    }

    public TooManyAttemptsException(String message) {
        super(message);
    }
}
