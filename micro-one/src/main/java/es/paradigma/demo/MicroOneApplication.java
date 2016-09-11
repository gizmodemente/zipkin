package es.paradigma.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by fdelosrios on 11/09/16.
 */
@SpringBootApplication
@EnableEurekaClient
public class MicroOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroOneApplication.class, args);
    }
}
