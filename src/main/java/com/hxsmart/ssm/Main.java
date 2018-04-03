package com.hxsmart.ssm;

import com.hxsmart.ssm.service.HelloWorld;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        Logger logger = LogManager.getLogger();
        logger.log(Level.TRACE,"debug info");
        logger.log(Level.DEBUG,"debug info");
        logger.log(Level.INFO,"debug info");
        logger.log(Level.WARN,"error info");
        logger.log(Level.ERROR,"debug info");
        logger.log(Level.FATAL,"debug info");


        //BeanFactory factory = new ClassPathXmlApplicationContext("Beans.xml");
        //HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");
        //obj.getMessage();


//        System.out.println(Main.class.getClass().getResource("/").getPath());
//        System.out.println(System.getProperty("user.dir"));
//        System.out.println(System.getProperty("user.home"));
//        System.out.println(System.getProperty("user.name"));

        ApplicationContext ctx = new FileSystemXmlApplicationContext(Main.class.getClass().getResource("/").getPath()+"Beans.xml");
        HelloWorld obj=(HelloWorld) ctx.getBean("helloWorld");
        obj.getMessage();

    }
}
