package com.Aleksandr.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Aleksandr on 25.03.2015.
 */
@Entity
@Table(name = "HOBBY")
public class Hobby implements Serializable {

    @Id
    @Column
    private long id;

    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(targetEntity = Contact.class)
    private Contact contact;

    public Contact getContact() {
        return contact;
    }
    public void setContact(Contact contact) {
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

    @Override
    public String toString() {
        return "Hobby{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", contact=" + contact +
                '}';
    }
}
