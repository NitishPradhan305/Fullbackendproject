package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class User {
	String name, role;
    User(String a, String b) {
        name = a;
        role = b;
    }
    String getRole() { return role; }
    String getName() { return name; }    
    public String toString() {
       return "Employee Name : " + name + ", Role :" + role;
    }
  
    public static void main(String args[])
    {      
        List<User> users = new ArrayList<User>();
        users.add(new User("Manish", "Tester"));
        users.add(new User("Nitish", "Developer"));
        users.add(new User("Anwar", "Developer"));
        List admins = process(users, (User u) -> u.getRole().equals("Developer"));
        System.out.println(admins);
    }
  
    public static List<User> process(List<User> users, 
                            Predicate<User> predicate)
    {
        List<User> result = new ArrayList<User>();
        for (User user: users)        
            if (predicate.test(user))            
                result.add(user);
        return result;
    }
}
