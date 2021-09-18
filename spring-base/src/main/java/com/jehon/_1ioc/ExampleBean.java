package com.jehon._1ioc;

/**
 * @author jehon
 */
public class ExampleBean {

    public void test() {
        System.out.println("ExampleBean.test");
    }

    public void init() {
        System.out.println("ExampleBean.init");
    }

    public void destroy() {
        System.out.println("ExampleBean.destroy");
    }
}
