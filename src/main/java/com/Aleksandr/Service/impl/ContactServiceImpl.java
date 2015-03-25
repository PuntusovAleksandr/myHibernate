package com.Aleksandr.Service.impl;

import com.Aleksandr.Service.ContactService;
import com.Aleksandr.dao.ContactDao;
import com.Aleksandr.dao.HobbyDao;
import com.Aleksandr.dao.PlaceDao;
import com.Aleksandr.entity.Contact;
import com.Aleksandr.entity.Hobby;
import com.Aleksandr.entity.Place;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 25.03.2015.
 */
@Component
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactDao contactDao;
    @Autowired
    private HobbyDao hobbyDao;
    @Autowired
    private PlaceDao placeDao;


    @Override
    public void createContact(String name, String lastName, Date birthDate) {
        Contact contact = new Contact();
        contact.setFirstName(name);
        contact.setLastName(lastName);
        contact.setBirthDate(birthDate);
        contactDao.addContact(contact);
    }

    @Override
    public List<Contact> getAllContact() {
        return contactDao.contactList();
    }

    @Override
    public void deleteContact(Contact contact) {
        contactDao.deleteContact(contact);
    }

    @Override
    public void addHobby(String description, String title) {
        Hobby hobby = new Hobby();
        hobby.setTitle(title);
        hobby.setDescription(description);
        hobbyDao.addHobby(hobby);
    }

    @Override
    public Set<Hobby> getAllHobby() {
        return hobbyDao.getHobbies();
    }

    @Override
    public void addPlace(Place place) {
        placeDao.addPlace(place);
    }

    @Override
    public void deletePlace(Place place) {
        placeDao.deletePlace(place);
    }

    @Override
    public Set<Place> getAllPlace() {
        return placeDao.getAllPlace();
    }

    @Override
    public Set<Contact> getAllContacctsPlace(Place place) {
        return placeDao.getAllContacctsPlace(place);
    }


}
