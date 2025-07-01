package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
       // System.out.println( "Hello World!" );
        Object student = (student) context.getBean("std1");
    }
}
