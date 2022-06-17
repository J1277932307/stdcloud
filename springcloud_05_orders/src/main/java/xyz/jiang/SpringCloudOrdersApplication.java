package xyz.jiang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudOrdersApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudOrdersApplication.class,args);
    }
}
