package com.etstur.homework.service;

import com.etstur.homework.data.UserDao;
import com.etstur.homework.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class H2UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void createUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public List<User> listAll()  {
        return userDao.getUserList();
    }
}
