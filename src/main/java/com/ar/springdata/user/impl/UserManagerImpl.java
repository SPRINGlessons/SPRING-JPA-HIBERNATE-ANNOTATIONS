package com.ar.springdata.user.impl;

import com.ar.springdata.dao.UserDAO;
import com.ar.springdata.model.TestEntity;
import com.ar.springdata.user.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserManagerImpl implements UserManager {

    @Autowired
    private UserDAO userDAO;


    @Transactional
    public void insertUser(TestEntity user) {
        userDAO.insertUser(user);
    }

    public List<TestEntity> findAllUsers() {
        return userDAO.findAllUsers();
    }
}
