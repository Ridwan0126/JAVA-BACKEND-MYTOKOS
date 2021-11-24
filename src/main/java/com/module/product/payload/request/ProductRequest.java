package com.module.product.payload.request;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private double price;
    private int amount;
    private int isDeleted;
}
