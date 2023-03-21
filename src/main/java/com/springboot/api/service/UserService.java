package com.springboot.api.service;

import com.springboot.api.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User save(User user);

    List<User> findAll();

    Optional<User> findById(Long id);

    User update(User user);

    void deleteById(Long id);
}
