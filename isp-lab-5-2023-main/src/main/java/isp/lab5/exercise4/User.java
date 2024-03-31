package isp.lab5.exercise4;

import org.junit.Assert;

import static jdk.internal.icu.impl.NormalizerImpl.UTF16Plus.equal;

public class User {
    private String userName;
    private boolean isOrganizer;

    public User(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isOrganizer() {
        return isOrganizer;
    }

    public void setOrganizer(UserRoles userRoles) {
        this.isOrganizer= "organizer".equals(userRoles.toString());
    }
}
