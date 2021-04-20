package com.example.hibernate1.repository;

import lombok.var;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PersonRepository {

    @PersistenceContext
    EntityManager entityManager;

    public List getPersonsByCity(String city) {
        var query1 = entityManager.createQuery("select p from Person p where p.city_of_living=:city");
        query1.setParameter("city", city);
        var list = query1.getResultList();
        return list;
    }
}
