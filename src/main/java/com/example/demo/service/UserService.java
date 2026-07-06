package com.example.demo.service;


import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService implements IUserService{

    @Autowired
    private UserRepository repository;

    @Override
    public User create(User user) {
        return repository.save(user);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public User read(String UserId) {
        return repository.findById(UserId).orElse(null);
    }

    @Override
    public List<User> getAll() {
        return repository.findAll();
    }




}