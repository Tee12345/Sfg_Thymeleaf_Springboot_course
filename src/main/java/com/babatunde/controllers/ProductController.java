package com.babatunde.controllers;

import com.babatunde.domain.*;
import com.babatunde.service.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.ui.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    //@RequestMapping("/product")
    public String getProduct(){
        return "redirect:/index";
    }

    @RequestMapping("/product/{id}")
    public String getProductById(@PathVariable Integer id, Model model){

        model.addAttribute("product", productService.getProduct(id));

        return "product";
    }
}
