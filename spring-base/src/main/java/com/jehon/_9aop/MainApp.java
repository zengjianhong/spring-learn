package com.jehon._9aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jehon
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans9.xml");
        Student student = (Student) context.getBean("student");

        student.getName();
        student.getAge();
        student.printThrowException();
    }
}
