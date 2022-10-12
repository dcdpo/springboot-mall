package com.david.springbootmall.service.impl;

import com.david.springbootmall.dao.ProductDao;
import com.david.springbootmall.dto.ProductRequest;
import com.david.springbootmall.model.Product;
import com.david.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceimpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
