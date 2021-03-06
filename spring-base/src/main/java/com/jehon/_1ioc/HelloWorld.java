package com.jehon._1ioc;

import lombok.Data;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author jehon
 */
@Data
public class HelloWorld implements InitializingBean {

    private String message;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("HelloWorld.afterPropertiesSet");
    }
}
