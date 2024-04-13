package isp.lab7.safehome;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class DoorLockController implements ControllerInterface {
    private Map<Tenant,AccessKey> validAcces;
    private Door door;
    private List<AccesLog> accesLogs;
    private int invalidTry=0;
    private final static String MASTER_PIN = "7777";

    public DoorStatus enterPin(String pin) throws InvalidPinException,TooManyAttemptsException{
        if(invalidTry == 3){
            if(pin.equals(MASTER_PIN)){
                if(door.getStatus() == DoorStatus.OPEN){
                    door.lockDoor();
                } else {
                    door.unlockDoor();
                }
                invalidTry = 0;
            } else {
                throw(new TooManyAttemptsException("too many invalid attempts, please insert MASTER pin"));
            }
        } else {
            if (validAcces.containsValue(pin)) {
                accesLogs.add(new AccesLog("implicit", LocalDateTime.now(), door.toString(), door.getStatus(), "no error"));
                if(door.getStatus() == DoorStatus.OPEN){
                    door.lockDoor();
                } else {
                    door.unlockDoor();
                }
                invalidTry = 0;
            } else {

                accesLogs.add(new AccesLog("not a good pin", LocalDateTime.now(), door.toString(), door.getStatus(), "error"));
                invalidTry++;
                throw (new InvalidPinException("pin in incorrect"));
            }
        }

        return door.getStatus();
    }

    public void addTenant(String pin,String tenantName)throws TenantAlreadyExistsException{
        AccessKey a=new AccessKey(pin);
        Tenant t=new Tenant(tenantName);
        for(Map.Entry<Tenant, AccessKey> e : validAcces.entrySet()){
            if(e.getKey().getName().equals(tenantName)) {
                throw (new TenantAlreadyExistsException("Tenant already exists"));
            }
        }
        this.validAcces.put(t,a);
    }

    public void removeTenant(String name)throws TenantNotFoundException{
        for(Map.Entry<Tenant, AccessKey> e : validAcces.entrySet()){
            if(e.getKey().getName().equals(name)){
                validAcces.remove(e.getKey());
                return;
            }
        }
        throw (new TenantNotFoundException("Tenant not found"));
    }

    public List<AccesLog> getAccessLogs(){
        return  accesLogs;
    }

    public DoorLockController(Map<Tenant, AccessKey> validAcces, Door door, List<AccesLog> accesLogs) {
        this.validAcces = validAcces;
        this.door = door;
        this.accesLogs = accesLogs;
    }

    public Map<Tenant, AccessKey> getValidAcces() {
        return validAcces;
    }

    public void setValidAcces(Map<Tenant, AccessKey> validAcces) {
        this.validAcces = validAcces;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public List<AccesLog> getAccesLogs() {
        return accesLogs;
    }

    public void setAccesLogs(List<AccesLog> accesLogs) {
        this.accesLogs = accesLogs;
    }

    public int getInvalidTry() {
        return invalidTry;
    }

    public void setInvalidTry(int invalidTry) {
        this.invalidTry = invalidTry;
    }

}
