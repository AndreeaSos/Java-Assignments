package isp.lab7.safehome;

public class TenantAlreadyExistsException extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    public TenantAlreadyExistsException() {
    }

    public TenantAlreadyExistsException(String message) {
        super(message);
    }
}
