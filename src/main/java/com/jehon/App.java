package com.jehon;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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

//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld.getMessage());
    }

    public void test() {
        System.out.println("App.test");
    }
}
