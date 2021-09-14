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

        HashMap hashMap = new HashMap();
        System.out.println(hashMap.put(null, null));
        System.out.println(hashMap.put(null, null));
        System.out.println(hashMap.put(null, null));
        System.out.println(hashMap.get(null));
        System.out.println(hashMap.size());

        HashSet hashSet = new HashSet<String>();
        System.out.println(hashSet.add(null));
        System.out.println(hashSet.add(null));
        System.out.println(hashSet.add("1"));
        System.out.println(hashSet.add("1"));

//        TreeMap<String, String> treeMap = new TreeMap<>();
//        System.out.println(treeMap.put(null, null));
//        treeMap.put(null, null);

//        TreeSet<String> treeSet = new TreeSet<>();
//        System.out.println(treeSet.add(null));
    }
}
