package isp.lab5.exercise4;

public class TicketManager extends Ticket {
    private PaymentGateway gateway;

    public TicketManager(User owner, String ticketId) {
        super(owner, ticketId);
    }

    private Ticket generateTicket(){
        User u1=new User("owner");
        Ticket t1=new Ticket(u1,"45126");
        return t1;
    }

    private boolean validateTicket(){
        User u1=new User("owner");
        Ticket t1=new Ticket(u1,"45126");
        t1.validate();
        return t1.isValidated();
    }
}
