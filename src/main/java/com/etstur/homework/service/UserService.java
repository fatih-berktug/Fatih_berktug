package com.etstur.homework.service;

import com.etstur.homework.entities.User;
import java.util.List;

public interface UserService {

    void createUser(User user);
    List<User> listAll();

}
