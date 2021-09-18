package com.jehon._2ioc;

import lombok.Data;

/**
 * @author jehon
 */
@Data
public class DefineIndia {

    private String message1;

    private String message2;

    private String message3;

    public String getMessage1() {
        System.out.println("DefineIndia.getMessage1:" + message1);
        return message1;
    }

    public String getMessage2() {
        System.out.println("DefineIndia.message2:" + message2);
        return message2;
    }

    public String getMessage3() {
        System.out.println("DefineIndia.getMessage3:" + message3);
        return message3;
    }
}
