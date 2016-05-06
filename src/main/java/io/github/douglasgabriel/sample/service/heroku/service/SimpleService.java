package io.github.douglasgabriel.sample.service.heroku.service;

import javax.jws.WebService;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
@WebService(endpointInterface = "io.github.douglasgabriel.sample.service.heroku.service.SimpleService", serviceName = "SimpleService")
public class SimpleService {

    public String hello (String name){
        return "Hello, "+name+"!";
    }
    
}
