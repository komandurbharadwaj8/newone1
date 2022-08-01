package com.ecom.controller;

import com.ecom.payload.ApiResponse;
import com.ecom.payload.ProductDto;
import com.ecom.service.ProductService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProductController {

    @Autowired
    private ProductService productService;

    //    createProduct
    @PostMapping("/category/{catId}/products")
    public ResponseEntity<ProductDto> create(
            @RequestBody ProductDto productDto,
            @PathVariable Integer catId
    ) {
        ProductDto productDto1 = this.productService.create(productDto, catId);
        return new ResponseEntity<>(productDto1, HttpStatus.CREATED);
    }


    //get all products

    @GetMapping("/products")
    public ResponseEntity<List<ProductDto>> getAllProducts() {
        return new ResponseEntity<>(this.productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/products/not-live")
    public ResponseEntity<List<ProductDto>> getAllProductsNotLive() {
        return new ResponseEntity<>(this.productService.getProductNotLive(), HttpStatus.OK);
    }

    //update
    //TODO

//update
    @PutMapping("/category/{catId}/product/{productId}")
    public ResponseEntity<ProductDto> update(
            @RequestBody ProductDto product,
            @PathVariable Integer catId)
    {
    	ProductDto update=this.productService.update(product, catId);
    	return new ResponseEntity<ProductDto>(update,HttpStatus.OK);
    }
    //delete

    @DeleteMapping("/product/{productId}")
    public ApiResponse delete(@PathVariable Integer productId)
    {
    	this.productService.delete(productId);
    	return new ApiResponse("product successfully deleted",true, HttpStatus.OK);
    }
    //delete

    //TODO
}

