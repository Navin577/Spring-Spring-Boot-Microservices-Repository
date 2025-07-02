package com.nt.client;

import java.util.Locale;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;

public class Spring_I18nTest {

    public static void main(String[] args) {
        // Create the IOC container using AnnotationConfigApplicationContext with configuration class
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        // Read language code and country code from the end user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter language code::");
        String lang = sc.nextLine();
        System.out.println("Enter country code::");
        String country = sc.nextLine();
        
        // Prepare Locale object with language code and country code
        Locale locale = new Locale(lang, country);
        
        // Read messages from the locale-specific properties file using the ctx.getMessage() method
        String msg1 = ctx.getMessage("Welcome.msg", new Object[]{"raja"}, locale);
        String msg2 = ctx.getMessage("goodbye.msg", null, locale);
        String msg3 = ctx.getMessage("application.title", null, locale);
        String msg4 = ctx.getMessage("wish.message", null, locale);
        
        // Display the messages
        System.out.println(msg1 + "....." + msg2 + "....." + msg3 + "....." + msg4);
    }
}
