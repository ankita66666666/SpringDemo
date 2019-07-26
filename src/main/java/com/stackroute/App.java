package com.stackroute;

import com.stackroute.domain.Manager;
import com.stackroute.domain.surveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            surveyor surveyor = context.getBean("surveyor", surveyor.class);
            System.out.println(surveyor);
            Manager manager = (Manager) context.getBean("manager");
            System.out.println(manager);
        }
    }

