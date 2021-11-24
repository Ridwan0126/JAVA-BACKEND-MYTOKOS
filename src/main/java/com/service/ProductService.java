package com.service;

import com.common.payload.BaseResponse;
import com.module.product.payload.request.ProductRequest;

public interface ProductService {

    BaseResponse addProduct(ProductRequest productRequest);

    BaseResponse getAllProduct();

    BaseResponse getProductByName(String name);

    BaseResponse updateProduct(ProductRequest productRequest, Long id);

    BaseResponse deleteProduct(Long id);
}
