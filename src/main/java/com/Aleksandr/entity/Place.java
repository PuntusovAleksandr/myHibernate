package com.Aleksandr.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Aleksandr on 26.03.2015.
 */
@Entity
@Table(name = "PLACE")
public class Place implements Serializable {

    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "LONGITUDE")
    private double longitude;
    @Column(name = "LATITUDE")
    private double latitude;

    @ManyToMany(mappedBy ="places")
    private Set<Contact> contact = new HashSet<Contact>();

    public Place() {    }

    public Place(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public Set<Contact> getContact() {
        return contact;
    }
    public void setContact(Set<Contact> contact) {
        this.contact = contact;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Place{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}'+"\n";
    }
}
