package com.Aleksandr.dao;

import com.Aleksandr.entity.Contact;
import com.Aleksandr.entity.Place;

import java.util.Set;

/**
 * Created by Aleksandr on 26.03.2015.
 */
public interface PlaceDao {
    public void addPlace(Place place);
    public void deletePlace(Place place);
    public Set<Place> getAllPlace();
    public Set<Contact> getAllContacctsPlace(Place place);
}
