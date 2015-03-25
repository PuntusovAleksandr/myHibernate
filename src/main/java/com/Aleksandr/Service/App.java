package com.Aleksandr.Service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Aleksandr on 25.03.2015.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("myHiberrnate-config.xml");
        ContactService contactService = context.getBean(ContactService.class);

        System.out.println(contactService.getAllContact());


    }
}
