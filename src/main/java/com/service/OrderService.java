package com.service;

import com.common.payload.BaseResponse;
import com.module.order.payload.OrderRequest;
import com.module.product.payload.request.ProductRequest;

public interface OrderService {
    BaseResponse inputOrder(OrderRequest orderRequest);

    BaseResponse updateOrder(OrderRequest orderRequest, Long id);

    BaseResponse cancelOrder(Long id);
}

