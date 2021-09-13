package com.jehon.init;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author jehon
 */
@Data
public class HelloBean {

    private String name;

    public void init() {
        System.out.println("com.jehon.init.HelloBean.init");
    }

    public void destroy() {
        System.out.println("com.jehon.init.HelloBean.destroy");
    }
}
