package com.Aleksandr.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aleksandr on 25.03.2015.
 */
@Entity
@Table(name = "CONTACT")
public class Contact implements Serializable{

    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Column(name = "BIRTH_DATE")
    private Date birthDate;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public Date getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        if (id != contact.id) return false;
        if (!birthDate.equals(contact.birthDate)) return false;
        if (!firstName.equals(contact.firstName)) return false;
        if (!lastName.equals(contact.lastName)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + birthDate.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
