package com.jehon._1ioc;

import lombok.Data;

/**
 * @author jehon
 */
@Data
public class HelloBean {

    private String name;

    public void init() {
        System.out.println("com.jehon.main1.HelloBean.init");
    }

    public void destroy() {
        System.out.println("com.jehon.main1.HelloBean.destroy");
    }
}
