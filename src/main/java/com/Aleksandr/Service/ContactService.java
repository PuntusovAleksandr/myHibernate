package com.Aleksandr.Service;

import com.Aleksandr.entity.Contact;
import com.Aleksandr.entity.Hobby;
import com.Aleksandr.entity.Place;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 25.03.2015.
 */
public interface ContactService {

    public void createContact (String name, String lastName, Date date);
    public List<Contact> getAllContact();
    public void deleteContact(Contact contact);
    public void addHobby(String description, String title);
    public Set<Hobby> getAllHobby();
    public void addPlace(Place place);
    public void deletePlace(Place place);
    public Set<Place> getAllPlace();
    public Set<Contact> getAllContacctsPlace(Place place);





}
