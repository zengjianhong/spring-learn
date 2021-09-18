package com.jehon._8event;

import org.springframework.context.ApplicationEvent;

/**
 * @author jehon
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My Custom Event";
    }
}
