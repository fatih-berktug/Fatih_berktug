package com.etstur.homework.data;

import com.etstur.homework.entities.User;
import java.util.List;

public interface UserDao {

    List<User> getUserList();

    void insertUser(User user);
}
