package com.jehon;

import com.jehon.definition.DefineBean;
import com.jehon.definition.DefineIndia;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author jehon
 */
public class MainApp2 {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

        DefineBean defineBean = (DefineBean) applicationContext.getBean("defineBean");
        defineBean.getMessage1();
        defineBean.getMessage2();

        DefineIndia defineIndia = (DefineIndia) applicationContext.getBean("defineIndia");
        defineIndia.getMessage1();
        defineIndia.getMessage2();
        defineIndia.getMessage3();
    }
}
