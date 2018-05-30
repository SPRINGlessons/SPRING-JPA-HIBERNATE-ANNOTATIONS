package com.ar.springdata;

import com.ar.springdata.model.TestEntity;
import com.ar.springdata.user.UserManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring.xml");

        UserManager userManager = (UserManager) ctx.getBean("userManagerImpl");

        List<TestEntity> list = userManager.findAllUsers();
        System.out.println("User count: " + list.size());

        TestEntity user = new TestEntity();
        user.setName("johndoe");
        userManager.insertUser(user);
        System.out.println("User inserted!");

        list = userManager.findAllUsers();
        System.out.println("User count: " + list.size());

    }


}
