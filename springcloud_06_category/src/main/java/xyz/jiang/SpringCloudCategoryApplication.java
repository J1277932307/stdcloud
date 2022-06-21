package xyz.jiang;

import org.omg.CORBA.ARG_IN;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringCloudCategoryApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudCategoryApplication.class, args);
    }
}
