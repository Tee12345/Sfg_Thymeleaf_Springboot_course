package com.babatunde.service;

import com.babatunde.domain.*;
import java.util.List;

public interface ProductService {
    Product getProduct(Integer id);

    List<Product> listProducts();
}
