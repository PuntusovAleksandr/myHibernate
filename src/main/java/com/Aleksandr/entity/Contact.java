package com.Aleksandr.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

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


    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name="CONTACT_HOBBY", joinColumns={@JoinColumn(referencedColumnName = "ID")}
            , inverseJoinColumns={@JoinColumn(referencedColumnName="ID")})
    private Set<Hobby> hobbies;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "CONTACT_PLACE", joinColumns = {@JoinColumn(referencedColumnName = "ID")}
            , inverseJoinColumns = {@JoinColumn(referencedColumnName = "ID")})
    private Set<Place> places;

    @OneToMany(mappedBy = "contact", fetch = FetchType.EAGER)
    private Set<Message> message;


    public Set<Hobby> getHobbies() {
        return hobbies;
    }
    public void setHobbies(Set<Hobby> hobbies) {
        this.hobbies = hobbies;
    }
    public Set<Place> getPlaces() {
        return places;
    }
    public void setPlaces(Set<Place> places) {
        this.places = places;
    }
    public Set<Message> getMessage() {
        return message;
    }
    public void setMessage(Set<Message> message) {
        this.message = message;
    }
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
                ", hobbies=" + hobbies +
                ", places=" + places +
                ", message=" + message +
                '}';
    }
}
