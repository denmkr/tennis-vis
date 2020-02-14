package org.kn.tennis.controllers;

import org.springframework.web.bind.annotation.*;

/**
 * Created by denis on 2/13/20.
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class HelloController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String testValue() {
        return "TEST";
    }

    @GetMapping("/name")
    public String name(@RequestParam(required = false, defaultValue = "World") String name) {
        return "Your name is " + name;
    }

}