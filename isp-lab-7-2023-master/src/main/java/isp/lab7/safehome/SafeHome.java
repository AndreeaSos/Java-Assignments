package isp.lab7.safehome;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SafeHome {

    public static void main(String[] args) throws TenantAlreadyExistsException, TenantNotFoundException, TooManyAttemptsException, InvalidPinException {

        Tenant tenant =new Tenant("Guest1");
        AccessKey accessKey =new AccessKey("1234");
        Door door=new Door();
        AccesLog log=new AccesLog(tenant.getName(), LocalDateTime.now(),"closing",DoorStatus.CLOSE,"no error");
        List<AccesLog> accesLogList=new ArrayList<AccesLog>();
        Map<Tenant,AccessKey> map= new HashMap<>();
        //map.put(tenant, accessKey);
        DoorLockController doorLockController=new DoorLockController(map,door,accesLogList);

        try {

            doorLockController.enterPin("0000");
            doorLockController.addTenant("0000","Guest2");
//            doorLockController.addTenant("0000","Guest2");
            doorLockController.removeTenant("Guest2");
            doorLockController.enterPin("1235");
            doorLockController.enterPin("1235");
            doorLockController.enterPin("1235");
            doorLockController.enterPin("1235");

        }catch (InvalidPinException
                | TenantNotFoundException
                | TenantAlreadyExistsException
                | TooManyAttemptsException exception){
            System.out.println(exception.getMessage());
        } finally {
            doorLockController.addTenant("0000","Guest2");
//            doorLockController.addTenant("0000","Guest2");
            doorLockController.removeTenant("Guest2");
            doorLockController.setInvalidTry(3);
            doorLockController.enterPin("7777");
            doorLockController.enterPin("1235");
            doorLockController.enterPin("1235");
            doorLockController.enterPin("1235");
        }

    }
}
