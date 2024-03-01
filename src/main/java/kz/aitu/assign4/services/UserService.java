package kz.aitu.assign4.services;

import kz.aitu.assign4.models.User;
import kz.aitu.assign4.repositories.UserRepositoryInterface;
import kz.aitu.assign4.services.interfaces.UserServiceInterfaces;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserServiceInterfaces {
    private final UserRepositoryInterface repo;

    public UserService(UserRepositoryInterface repo) {
        this.repo = repo;
    }

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public User getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public User create(User user) {
        return repo.save(user);
    }

    @Override
    public List<User> getbyName(String name) {
        return repo.findByName(name);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }

}
