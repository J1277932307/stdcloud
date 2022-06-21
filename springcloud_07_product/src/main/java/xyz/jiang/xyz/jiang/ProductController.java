package xyz.jiang.xyz.jiang;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import xyz.jiang.pojo.entity.product.Product;

import java.time.LocalDate;

@RestController
@Slf4j
public class ProductController {

    @Value("${server.port}")
    private String port;

    @GetMapping("product")
    public String product(){
        System.out.println("调用product接口:"+port);
        return "product!!!端口："+port;
    }

    @GetMapping("/test")
    public String test(@RequestParam("name") String name,@RequestParam("age") Integer age){
        System.out.println("name:"+name+",age:"+age);
        return "product!!!端口："+port;
    }

    @GetMapping("/product1/{id}")
    public Product getProduct(@PathVariable("id") Integer id){
        log.debug("id:{}",id);
        return new Product(id, "内衣", 23.8, LocalDate.now());
    }

}
