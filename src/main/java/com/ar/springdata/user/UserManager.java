package com.ar.springdata.user;

import com.ar.springdata.model.TestEntity;

import java.util.List;

public interface UserManager {

    void insertUser(TestEntity user);

    List<TestEntity> findAllUsers();

}
