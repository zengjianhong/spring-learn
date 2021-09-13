package com.jehon;

import com.jehon.app.ExampleBean;
import com.jehon.app.HelloWorld;
import com.jehon.init.HelloBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class MainApp {
    public static void main( String[] args ) {
//        XmlBeanFactory factory = new XmlBeanFactory(new ClassPathResource("application.xml"));
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("D:\\Virog_Idea\\spring_learn\\src\\main\\resources\\application.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml"); // applicationContext.registerShutdownHook();

        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloworld");
        helloWorld.setMessage("hello");
        System.out.println(helloWorld.getMessage());
        HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(helloWorld2.getMessage());

        ExampleBean exampleBean = (ExampleBean) applicationContext.getBean("exampleBean");
        exampleBean.test();

        HelloBean helloBean = (HelloBean) applicationContext.getBean("helloBean");


        applicationContext.registerShutdownHook();
    }
}
