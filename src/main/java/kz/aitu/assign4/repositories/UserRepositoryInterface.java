package kz.aitu.assign4.repositories;

import kz.aitu.assign4.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepositoryInterface extends JpaRepository<User,Integer> {
    List<User> findBySurname(String surname);

}
