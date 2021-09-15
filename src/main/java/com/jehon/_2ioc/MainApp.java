package com.jehon._2ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jehon
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans2.xml");

        DefineBean defineBean = (DefineBean) applicationContext.getBean("defineBean");
        defineBean.getMessage1();
        defineBean.getMessage2();

        DefineIndia defineIndia = (DefineIndia) applicationContext.getBean("defineIndia");
        defineIndia.getMessage1();
        defineIndia.getMessage2();
        defineIndia.getMessage3();
    }
}
