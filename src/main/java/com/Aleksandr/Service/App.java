package com.Aleksandr.Service;

import com.Aleksandr.dao.ContactDao;
import com.Aleksandr.dao.PlaceDao;
import com.Aleksandr.entity.Contact;
import com.Aleksandr.entity.Hobby;
import com.Aleksandr.entity.Place;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * Created by Aleksandr on 25.03.2015.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myHiberrnate-config.xml");
        ContactService contactService = context.getBean(ContactService.class);
        System.out.println("______________________________");
        ContactDao contactDao = context.getBean(ContactDao.class);
        Contact contact = new Contact("Jane", "Patric" );
        Contact contact2 = new Contact("Paul", "XXX" );
        Place placeNikopol = new Place("Nikopol", "Dnepropetrovsc obl");
        Place place = new Place();
        Place place2 = new Place();
        Hobby hobby = new Hobby();
        Hobby hobbySwing = new Hobby("Swing", "Pool");
        PlaceDao placeDao = context.getBean(PlaceDao.class);
        System.out.println("______________________________");

        contactDao.addContact(contact);
        contactDao.addContact(contact2);
        System.out.println(contact.toString());
        System.out.println(contactDao.contactList());

        System.out.println("______________________________");
        System.out.println("______________________________");

        contactService.getAllContact();

        System.out.println(contactService.getAllContact());
            System.out.println(contactService.getAllContact());
        System.out.println("______________________________");
        contactService.createContact("Gosha", "Dad", new Date(1548 - 12 - 12));
        System.out.println("______________________________");
        System.out.println(contactService.getAllContact());
        System.out.println("______________________________");

        System.out.println(contactService.getAllPlace());
        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(contactService.getAllHobby());
        System.out.println("==================================");
        place.setTitle("Dnepr");

        System.out.println(contactService.getAllContacctsPlace(place));
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        place.setTitle("Odessa");
        place.setDescription("XXX");
        contactService.deletePlace(place);
        System.out.println(contactService.getAllPlace());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(contactService.getAllContact());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(contactService.getAllPlace());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(contactService.getAllHobby());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println(contactService.getAllContacctsPlace(place));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        placeDao.addPlace(place);
        place2.setTitle("Two");
        place2.setDescription("DesTwo");
        System.out.println(contactService.getAllContacctsPlace(place));
        System.out.println(contactService.getAllPlace());
        placeDao.addPlace(place2);
        System.out.println(contactService.getAllPlace());



    }
}
