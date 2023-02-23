package com.example.simpleroot.Repo;

import com.example.simpleroot.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
