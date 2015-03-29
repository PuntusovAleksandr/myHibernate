package com.Aleksandr.dao.impl;

import com.Aleksandr.dao.PlaceDao;
import com.Aleksandr.entity.Contact;
import com.Aleksandr.entity.Place;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 26.03.2015.
 */
@Repository
public class PlaceDaoImpl implements PlaceDao{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void addPlace(Place place) {
        sessionFactory.getCurrentSession().saveOrUpdate(place);
    }

    @Override
    @Transactional
    public void deletePlace(Place place) {
        sessionFactory.getCurrentSession().delete(place);
    }

    @Override
    @SuppressWarnings("unchecked")
    @Transactional
    public Set<Place> getAllPlace() {
        List<Place> plSet = sessionFactory.getCurrentSession().createQuery("from Place").list();
        Set<Place> placeSet = new HashSet<Place>();
        for (Place p :plSet){
            placeSet.add(p);
        }
        return placeSet;
    }

    @Override
    @SuppressWarnings("unchecked")
    @Transactional
    public Set<Contact> getAllContacctsPlace(Place place) {
        return null;
    }

}
