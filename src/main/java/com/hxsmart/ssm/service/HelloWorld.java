package com.hxsmart.ssm.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HelloWorld {
    Logger logger = LogManager.getLogger();

    private String message;
    public void setMessage(String message){
        this.message  = message;
    }
    public void getMessage(){
        System.out.println("Your Message : " + message);
        logger.log(Level.FATAL,"debug info");
    }
}
