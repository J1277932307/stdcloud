package xyz.jiang.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Random;

@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/order")
    public String demo(){
        System.out.println("order demo ...:"+port);
        return "order demo OK!!!"+port;
    }


}
