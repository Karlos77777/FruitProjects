package com.example.fruitProject.repo;

import com.example.fruitProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Long> {
}
