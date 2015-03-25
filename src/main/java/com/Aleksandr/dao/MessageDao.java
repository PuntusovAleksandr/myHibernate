package com.Aleksandr.dao;

import com.Aleksandr.entity.Contact;
import com.Aleksandr.entity.Message;

import java.util.List;

/**
 * Created by Aleksandr on 26.03.2015.
 */
public interface MessageDao {
    public void storeMessage(Message message);
    public List<Message> getConversation(Contact contactOne, Contact contactTwo);
}
