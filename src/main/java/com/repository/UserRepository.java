package com.repository;

import com.model.Product;
import com.model.User;
import com.module.user.payload.AuthRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
    User findByIdAndIsDeleted(Long id, Integer isDeleted);

}
