package com.ar.springdata.dao.impl;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.ar.springdata.dao.UserDAO;
import com.ar.springdata.model.TestEntity;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAOImpl implements UserDAO {

    @PersistenceContext
    private EntityManager entityManager;


    public void insertUser(TestEntity user) {
        entityManager.persist(user);
    }



    public List<TestEntity> findAllUsers() {
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<TestEntity> cq = builder.createQuery(TestEntity.class);
        Root<TestEntity> root = cq.from(TestEntity.class);
        cq.select(root);
        return entityManager.createQuery(cq).getResultList();
    }

}
