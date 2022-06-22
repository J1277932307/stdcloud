package xyz.jiang.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import xyz.jiang.pojo.entity.product.Product;

@FeignClient("PRODUCT")
public interface ProductClient {

    @GetMapping("/product/print")
    String product();

    @GetMapping("/product/test")
    String test(@RequestParam("name") String name, @RequestParam("age") Integer age);

    @GetMapping("/product/as/{id}")
    Product getProduct(@PathVariable("id") Integer id);




}
