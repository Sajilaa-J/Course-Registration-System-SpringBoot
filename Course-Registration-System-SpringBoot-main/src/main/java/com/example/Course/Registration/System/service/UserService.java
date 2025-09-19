package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Users;
import com.example.Course.Registration.System.repository.UserDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    BCryptPasswordEncoder  passwordEncoder =new BCryptPasswordEncoder(12);

    @Autowired
    UserDetailsRepo repo;
    public void addUser(Users user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        repo.save(user);
    }
}
