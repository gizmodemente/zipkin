package es.paradigma.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by fdelosrios on 11/09/16.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    private static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String getCategories() throws Exception {

        LOGGER.info("GET micro-two -> /test");

        if(new Date().getTime() % 3 == 0)
            throw new Exception();

        return "I'm two";
    }
}
