package com.offcn.springcloud.controller;



import com.offcn.springcloud.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductController_Consumer {
    private static final String REST_URL_PREFIX = "http://MICROSERVICE-PRODUCT";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/product/add")
    public boolean add(Product product){
        return restTemplate.postForObject(REST_URL_PREFIX + "/product/add", product, Boolean.class);
    }
    @RequestMapping(value = "/consumer/product/get/{id}", method = RequestMethod.GET)
    public Product get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/" + id,Product.class);
    }
    @RequestMapping(value = "/consumer/product/get/list", method = RequestMethod.GET)
    public List<Product> list(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/product/get/list",List.class);
    }

}
