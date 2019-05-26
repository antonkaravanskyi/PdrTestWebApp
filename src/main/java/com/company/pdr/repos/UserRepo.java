package com.company.pdr.repos;

import com.company.pdr.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsrName(String usrName);
}