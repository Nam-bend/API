package com.example.demo.service;

import com.example.demo.user.User;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.util.List;
@Service

public interface UserSevvice   {
    List<User> getListUser();

    User getUserById(Long id);



    User createUser(User user);

    User updateUser(Long id, User user);

    void deleteUser(Long id);

}
