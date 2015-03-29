package com.Aleksandr.dao.impl;

import com.Aleksandr.dao.MessageDao;
import com.Aleksandr.entity.Contact;
import com.Aleksandr.entity.Message;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr on 26.03.2015.
 */
@Repository
public class MessageDaoImpl implements MessageDao {

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public void storeMessage(Message message) {
        sessionFactory.getCurrentSession().saveOrUpdate(message);
    }

    @Override
    public List<Message> getConversation(Contact contactOne, Contact contactTwo) {
        List<Message> messageList = new ArrayList<Message>();
//        messageList=sessionFactory.getCurrentSession().createSQLQuery("SELECT CONTENT, DATE_MESS FROM MESSAGE WHERE CONTACTFROM=contactOne,CONTACTTO= contactTwo").list();
        return messageList;
    }
}
