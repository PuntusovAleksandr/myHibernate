package com.Aleksandr.Service;

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

        Place place = new Place();
        Hobby hobby = new Hobby();

        System.out.println(contactService.getAllContact());
        System.out.println("______________________________");
        contactService.createContact("Gosha", "Dad", new Date(1548 - 12 - 12));
        System.out.println("______________________________");
        System.out.println(contactService.getAllContact());
        System.out.println("______________________________");

        System.out.println("______________________________");
        System.out.println(contactService.getAllContact());
    }
}
