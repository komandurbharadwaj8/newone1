package com.ecom.service;

import com.ecom.payload.ProductDto;

import java.util.List;

public interface ProductService {


    //create

    ProductDto create(ProductDto product, Integer catId);

    //update

    ProductDto update(ProductDto product, Integer productId);
 
   // ProductDto getById(Integer productId);
    //delete

    void delete(Integer productId);

    List<ProductDto> getAllProducts();

    List<ProductDto> getAllProductOfCategory(Integer catId);

    //all products that is not live

    List<ProductDto> getProductNotLive();

    //all product that is outof stock

    List<ProductDto> getProductOutOfStock();

    // business


}
