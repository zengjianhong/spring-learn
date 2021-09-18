package com.jehon._2ioc;

import lombok.Data;

/**
 * @author jehon
 */
@Data
public class DefineBean {

    private String message1;

    private String message2;

    public String getMessage1() {
        System.out.println("DefineBean.getMessage1: " + message1);
        return message1;
    }

    public String getMessage2() {
        System.out.println("DefineBean.message2: " + message2);
        return message2;
    }
}
