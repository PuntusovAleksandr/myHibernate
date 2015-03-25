package com.Aleksandr.dao.impl;

import com.Aleksandr.dao.ContactDao;
import com.Aleksandr.entity.Contact;
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
public class ContactDaoImpl implements ContactDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().saveOrUpdate(contact);
    }

    @Override
    @Transactional
    public List<Contact> contactList() {
        return sessionFactory.getCurrentSession().createQuery("from Contact").list();
    }

    @Override
    @Transactional
    public void deleteContact(Contact contact) {
        sessionFactory.getCurrentSession().delete(contact);
    }



    @Override
    @Transactional
    public Set<Contact> getFriends(Contact contact) {
        return null;
    }


}
