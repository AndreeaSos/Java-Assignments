package isp.lab5.exercise4;

public class PaymentGateway {
    private boolean payStatus;

    public PaymentGateway() {
        this.payStatus = false;
    }

    private void pay(){
        this.payStatus=true;
    }
    private boolean paymentSuccessful(){
        return this.payStatus;
    }
}
