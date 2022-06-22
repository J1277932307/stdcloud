package xyz.jiang.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xyz.jiang.client.ProductClient;
import xyz.jiang.pojo.entity.product.Product;

import javax.annotation.Resource;

@RestController
@Slf4j
public class CategoryController {

    @Resource
    private ProductClient productClient;

    @GetMapping("/category/print")
    public String category(){
        System.out.println("category!!!调用product!");
        return productClient.product();
    }

    @GetMapping("/category/test")
    public String test(@RequestParam("name") String name,@RequestParam("age") Integer age){
        System.out.println(name+":"+age);
        return productClient.test(name, age);
    }

    @GetMapping("/category/getProduct/{id}")
    public Product getProduct(@PathVariable("id") Integer id){
        log.debug("id:{}",id);
        return productClient.getProduct(id);
    }

}
