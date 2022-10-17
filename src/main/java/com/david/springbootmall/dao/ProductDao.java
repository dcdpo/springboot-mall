package com.david.springbootmall.dao;


import com.david.springbootmall.dto.ProductQueryParam;
import com.david.springbootmall.dto.ProductRequest;
import com.david.springbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    List<Product> getProducts(ProductQueryParam productQueryParam);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
