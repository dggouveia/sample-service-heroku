package io.github.douglasgabriel.sample.service.heroku;

import io.github.douglasgabriel.sample.service.heroku.service.SimpleService;
import javax.xml.ws.Endpoint;

/**
 *
 * @author douglasgabriel
 * @version 0.1
 */
public class Loader {

    public static void main(String[] args) {
        String port = System.getenv("PORT");
        String host = "http://0.0.0.0:";
        String uri = "/service";
        SimpleService service = new SimpleService();
        Endpoint.publish(host + port + uri, service);
    }
}
