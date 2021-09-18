package com.jehon._7config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * @author jehon
 */
public class MainApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        helloWorld.setMessage("Hello World!");
        helloWorld.getMessage();

//        context = new AnnotationConfigApplicationContext(TextEditorConfig.class);
        TextEditor textEditor = context.getBean(TextEditor.class);
        textEditor.spellCheck();

        context.registerShutdownHook();
    }
}
