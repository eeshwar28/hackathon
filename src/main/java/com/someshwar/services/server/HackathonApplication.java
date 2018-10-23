package com.someshwar.services.server;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.springframework.stereotype.Component;

import com.americanexpress.hackthon.restapi.controller.HelloWorldController;

@Component
@ApplicationPath("/")
public class HackathonApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
       
        Set<Class<?>> classesSet = new HashSet<Class<?>>();
        classesSet.add(HelloWorldController.class);
        
        
        return classesSet;
    }
}