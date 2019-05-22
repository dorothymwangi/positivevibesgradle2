package org.launchcode.positivevibesgradle2.repository;

import org.launchcode.positivevibesgradle2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User findByEmail(String email);

}
