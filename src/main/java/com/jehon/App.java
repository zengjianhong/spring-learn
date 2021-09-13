package com.jehon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        App app = (App) applicationContext.getBean("app");
        app.test();
        System.out.println( "Hello World!" );
    }

    public void test() {
        System.out.println("App.test");
    }
}
