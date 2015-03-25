package com.Aleksandr.dao;

import com.Aleksandr.entity.Contact;

import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 25.03.2015.
 */
public interface ContactDao {

    public void addContact(Contact contact);
    public List<Contact> contactList();
    public void deleteContact(Contact contact);
    public Set<Contact> getFriends(Contact contact);
}
