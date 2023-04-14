package com.springboot.productservice.payload;

import lombok.Data;

import java.util.Map;

@Data
public class ProductDto {
    private long productId;
    private String productName;
    private String productDesc;
    private int productPrice;
//    private Map<String, Long> price;
}
