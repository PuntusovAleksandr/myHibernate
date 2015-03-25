package com.Aleksandr.dao.impl;

import com.Aleksandr.dao.HobbyDao;
import com.Aleksandr.entity.Hobby;
import com.Aleksandr.entity.Place;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 25.03.2015.
 */
@Repository
public class HobbyDaoImpl implements HobbyDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addHobby(Hobby title) {
        sessionFactory.getCurrentSession().saveOrUpdate(title);
    }

    @Override
    @Transactional
    public Set<Hobby> getHobbies() {
        List<Hobby> hobbyList= sessionFactory.getCurrentSession().createQuery("from Hobby").list();
        return (Set<Hobby>) hobbyList;
    }
}
