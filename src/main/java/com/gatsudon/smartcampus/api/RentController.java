package com.gatsudon.smartcampus.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class RentController {
    @GetMapping("/hello")
    public String hello() throws IOException {
        List command = new ArrayList();
        command.add("mosquitto_pub");
        command.add("-d");
        command.add("-t");
        command.add("hello/world");
        command.add("-m");
        command.add("hihihi");
        new ProcessBuilder( command).start();
        return "HelloWorld";
    }
}
