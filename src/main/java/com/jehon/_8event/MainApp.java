package com.jehon._8event;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jehon
 */
public class MainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans8.xml");

        context.start();

        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        System.out.println(helloWorld.getMessage());

        CustomEventPublisher customEventPublisher = (CustomEventPublisher) context.getBean("customEventPublisher");
        customEventPublisher.publish();
        customEventPublisher.publish();

        context.stop();
    }
}
