package com.company.entity;

import java.util.Date;

public class Product {

    private Long productId;
    private String name;
    private String description;
    private Long galleryId;
    private String wayBilUrl;
    private Date createdAt;

    public Product() {
    }

    public Product(Long productId, String name, String description, Long galleryId, String wayBilUrl, Date createdAt) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.galleryId = galleryId;
        this.wayBilUrl = wayBilUrl;
        this.createdAt = createdAt;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getGalleryId() {
        return galleryId;
    }

    public void setGalleryId(Long galleryId) {
        this.galleryId = galleryId;
    }

    public String getWayBilUrl() {
        return wayBilUrl;
    }

    public void setWayBilUrl(String wayBilUrl) {
        this.wayBilUrl = wayBilUrl;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", galleryId=" + galleryId +
                ", wayBilUrl='" + wayBilUrl + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
