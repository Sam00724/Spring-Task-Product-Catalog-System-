package com.productcatalogsystem.productcatalogsystem.controller;

import com.productcatalogsystem.productcatalogsystem.entity.Product;
import com.productcatalogsystem.productcatalogsystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/home")
    public String home(){
        return "index";
    }
    @GetMapping("/addProduct")
    public String addProduct(){
        return "addProduct";
    }

    //Post method on addProduct used on submission of Add product form
    @PostMapping("/addProduct")
    public String addProduct(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "price") Long price,
            @RequestParam(value = "category") String category
    ){
        Product product = Product.builder()
                .name(name)
                .price(price)
                .category(category)
                .build();
        productService.addProduct(product);
        return "addedProduct";
    }

    @GetMapping("/displayProducts")
    public String displayProducts(Model model){
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "displayProducts";
    }

//    The below are the route handler methods used to check the backend with postman
//    @GetMapping(value = "/getAll")
//    public List<Product> getAllProducts(){
//        return productService.getAllProducts();
//    }
//    @PostMapping(value = "/add")
//    public Product addProduct(@RequestBody Product product){
//        return productService.addProduct(product);
//    }
}
