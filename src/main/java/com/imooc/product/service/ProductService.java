package com.imooc.product.service;

import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {
    /**
     * 查询所有商品在架列表
     */
    List<ProductInfo> findUpAll();
}
