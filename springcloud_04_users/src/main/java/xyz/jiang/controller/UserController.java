package xyz.jiang.controller;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Random;

@RestController
public class UserController {

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/user")
    public String invokeDemo(){
        String forObject = restTemplate.getForObject("http://ORDERS/order", String.class);
        System.out.println("调用订单服务成功："+forObject);
        return forObject;
    }


    private String getRandomHost(){
        ArrayList<String> hosts = new ArrayList<>();
        hosts.add("localhost:9998");
        hosts.add("localhost:9990");
        int i = new Random().nextInt(hosts.size());
        return hosts.get(i);

    }
}
