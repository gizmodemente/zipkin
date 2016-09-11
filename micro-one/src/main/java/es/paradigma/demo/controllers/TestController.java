package es.paradigma.demo.controllers;

import es.paradigma.demo.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.util.StringUtils.isEmpty;

/**
 * Created by fdelosrios on 11/09/16.
 */
@RestController
@RequestMapping(value = "/test")
public class TestController {

    private static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    TestService testService;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String getCategories() {

        LOGGER.info("GET micro-one -> /test");

        return "I'm one. " + testService.testServiceMethd();
    }
}
