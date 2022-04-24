package com.naoshin.azureautomechanic.repository;

import com.naoshin.azureautomechanic.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
    public User findByEmailAndPassword(String userEmail, String userPassword);
}
