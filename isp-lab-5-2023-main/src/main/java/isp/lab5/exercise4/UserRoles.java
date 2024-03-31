package isp.lab5.exercise4;

public enum UserRoles {
    ORGANIZER("organizer"),
    CUSTOMER("customer");


    private String displayRole;

    UserRoles(String displayRole) {
        this.displayRole = displayRole;
    }

    @Override
    public String toString() {
        return displayRole ;
    }
}
