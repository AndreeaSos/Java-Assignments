package isp.lab5.exercise4;

public class Ticket {
    private User owner;
    private String ticketId;
    private boolean isValidated;

    public Ticket(User owner, String ticketId) {
        this.owner = owner;
        this.ticketId = ticketId;
        this.isValidated=false;
    }

    public String getTicket() {
        return ticketId;
    }

    public User getOwner() {
        return owner;
    }

    public boolean isValidated() {
        return isValidated;
    }

    public void validate(){
        this.isValidated=true;
    }
}
