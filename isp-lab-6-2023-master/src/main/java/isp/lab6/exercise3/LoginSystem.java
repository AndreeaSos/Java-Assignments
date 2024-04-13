package isp.lab6.exercise3;

import java.util.HashSet;
import java.util.Set;

public class LoginSystem {
    private Set<User> users=new HashSet<>();
    private OnlineStore store;

    public void register(String username,String password){
        User user=new User(username,password);
        this.users.add(user);
    }
    public boolean login(String username,String password){
        User u=new User(username, password);
        if(users.contains(u)){
            return true;
        }else{
            users.add(u);
            return true;
        }
    }
    public boolean logout(String username){
        User u=null;
        for(User user:users){
            if(user.getUsername().equals(username)){
                u=user;
            }
        }
        return users.remove(u);
    }
}
