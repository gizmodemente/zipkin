package es.paradigma.demo.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import es.paradigma.demo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by fdelosrios on 11/09/16.
 */
@Service
public class TestServiceDefault implements TestService{

    @Autowired
    @LoadBalanced
    private RestTemplate restTemplate;

    private static Logger LOGGER = LoggerFactory.getLogger(TestServiceDefault.class);

    @Override
    @HystrixCommand(fallbackMethod = "testServiceFallback")
    public String testServiceMethd() {
        return restTemplate.getForObject
                ("http://micro-two/test", String.class);
    }

    public String testServiceFallback() {
        return "i'm alone";
    }
}
