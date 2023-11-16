package com.logi.dashboard.domain.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;


public class Product {

    private Long id;
    private String title;
    private String description;
    private String category;
    private BigDecimal price;
    private BigDecimal discountPercentage;
    private BigDecimal rating;
    private Integer stock;
    private String brand;
    private String thumbnail;
    private List<String> images;

    private Product(Builder builder) {
        setId(builder.id);
        setTitle(builder.title);
        setDescription(builder.description);
        setCategory(builder.category);
        setPrice(builder.price);
        setDiscountPercentage(builder.discountPercentage);
        setRating(builder.rating);
        setStock(builder.stock);
        setBrand(builder.brand);
        setThumbnail(builder.thumbnail);
        setImages(builder.images);
    }

    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getDiscountPercentage() {
        return discountPercentage;
    }

    public void setDiscountPercentage(BigDecimal discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public static final class Builder {
        private Long id;
        private String title;
        private String description;
        private String category;
        private BigDecimal price;
        private BigDecimal discountPercentage;
        private BigDecimal rating;
        private Integer stock;
        private String brand;
        private String thumbnail;
        private List<String> images;

        private Builder() {
        }

        public Builder id(Long val) {
            id = val;
            return this;
        }

        public Builder title(String val) {
            title = val;
            return this;
        }

        public Builder description(String val) {
            description = val;
            return this;
        }

        public Builder category(String val) {
            category = val;
            return this;
        }

        public Builder price(BigDecimal val) {
            price = val;
            return this;
        }

        public Builder discountPercentage(BigDecimal val) {
            discountPercentage = val;
            return this;
        }

        public Builder rating(BigDecimal val) {
            rating = val;
            return this;
        }

        public Builder stock(Integer val) {
            stock = val;
            return this;
        }

        public Builder brand(String val) {
            brand = val;
            return this;
        }

        public Builder thumbnail(String val) {
            thumbnail = val;
            return this;
        }

        public Builder images(List<String> val) {
            images = val;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
