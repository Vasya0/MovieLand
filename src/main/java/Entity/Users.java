package Entity;


import Service.User;

import java.util.*;

public class Users {
    private List<User> userList = new ArrayList<>();


    public void add(User user) {

        userList.add(user);
    }

    public void getAll() {
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User element = iterator.next();
            System.out.println(element.toString());
        }
    }
    public User getUser(int id) {
        User user=new User();
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User element = iterator.next();
            if (element.getUserID()==id) {
                user=element;
                System.out.println(element.toString());
            }

        }
        return user;
    }

    public void update(int id, String name,String email,String password) {
        Iterator<User> iterator = userList.iterator();
        while (iterator.hasNext()) {
            User element = iterator.next();
            if (element.getUserID() == id) {
                element.setUsername(name);
                element.setEmail(email);
                element.setPassword(password);
            }
        }


    }

    public void delete(User user) {
        userList.remove(user);

    }

}
