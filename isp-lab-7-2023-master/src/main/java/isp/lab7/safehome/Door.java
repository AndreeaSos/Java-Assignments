package isp.lab7.safehome;

public class Door {
    private DoorStatus status=DoorStatus.CLOSE;

    public void lockDoor(){
        this.status=DoorStatus.CLOSE;
    }

    public void unlockDoor(){
        this.status=DoorStatus.OPEN;
    }

    public DoorStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Door{" +
                "status=" + status +
                '}';
    }
}
