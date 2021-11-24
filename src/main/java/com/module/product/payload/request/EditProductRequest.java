package com.module.product.payload.request;

import lombok.Data;

@Data
public class EditProductRequest {
    private String name;
    private double price;
    private int amount;
}
