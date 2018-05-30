package com.ar.springdata.dao;

import com.ar.springdata.model.TestEntity;

import java.util.List;

public interface UserDAO {

    void insertUser(TestEntity user);
    List<TestEntity> findAllUsers();

}
