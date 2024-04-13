package isp.lab7.safehome;

public class TenantNotFoundException extends Exception{
    @Override
    public String toString() {
        return super.toString();
    }

    public TenantNotFoundException() {
    }

    public TenantNotFoundException(String message) {
        super(message);
    }
}
