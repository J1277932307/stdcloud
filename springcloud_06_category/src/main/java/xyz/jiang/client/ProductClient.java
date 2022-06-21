package xyz.jiang.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import xyz.jiang.pojo.entity.product.Product;

@FeignClient("PRODUCT")
public interface ProductClient {

    @GetMapping("product")
    String product();

    @GetMapping("/test")
    String test(@RequestParam("name") String name, @RequestParam("age") Integer age);

    @PostMapping("/test2")
    String test2(@RequestBody Product product);

    @GetMapping("/product1/{id}")
    Product getProduct(@PathVariable("id") Integer id);




}
