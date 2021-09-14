package com.jehon.main3;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jehon
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("main3.xml");
//        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
//        textEditor.spellCheck();

//        TextEditor textEditor2 = (TextEditor) context.getBean("textEditor2");
//        textEditor2.spellCheck();

        TextEditor textEditor3 = (TextEditor) context.getBean("textEditor3");
        textEditor3.spellCheck();
    }
}
