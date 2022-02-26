package com.company;

import com.company.dao.ProductDao;
import com.company.entity.Product;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Product product = new Product();
        product.setProductId(5L);
        product.setName("Macbook Air ");
        product.setDescription("M1 Pro MAX");
        product.setGalleryId(56L);
        product.setWayBilUrl("https://www.apple.com/tr");
        product.setCreatedAt(new Date());

        ProductDao.insertProduct(product);
    }
}
