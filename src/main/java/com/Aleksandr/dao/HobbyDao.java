package com.Aleksandr.dao;

import com.Aleksandr.entity.Hobby;

import java.util.Set;

/**
 * Created by Aleksandr on 25.03.2015.
 */
public interface HobbyDao {
    public void addHobby(Hobby title);
    public Set<Hobby> getHobbies();
}
