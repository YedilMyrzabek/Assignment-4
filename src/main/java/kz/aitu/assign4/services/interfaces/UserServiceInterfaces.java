package kz.aitu.assign4.services.interfaces;

import kz.aitu.assign4.models.User;

import java.util.List;

public interface UserServiceInterfaces {
    List<User> getAll();
    User getById(int id);
    User create(User user);
    List<User> getbyName(String name);
    void deleteById(int id);

}
