package com.jehon._8event;

import org.springframework.context.ApplicationListener;

/**
 * @author jehon
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        System.out.println(customEvent.toString());
    }
}
