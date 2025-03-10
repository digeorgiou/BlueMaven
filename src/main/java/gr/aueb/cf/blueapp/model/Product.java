package gr.aueb.cf.blueapp.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Product {
    private Integer productId;
    private String name;
    private String description;
    private Double weight;
    private ProductCategory category;
    private Double price;
    private Integer stockQuantity;
    private Integer minutesToMake;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private Double profitMargin;


    // Constructors

    public Product() {
    }

    public Product(Integer productId, String name, String description, Double weight,
                   ProductCategory category, Double price, Integer stockQuantity,
                   Integer minutesToMake, LocalDateTime createdAt,
                   LocalDateTime updatedAt, Double profitMargin) {

        this.productId = productId;
        this.name = name;
        this.description = description;
        this.weight = weight;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.minutesToMake = minutesToMake;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.profitMargin = profitMargin;
    }


    public Product(Product product){
        this.productId = product.getProductId();
        this.description = product.getDescription();
        this.name = product.getName();
        this.weight = product.getWeight();
        this.category = product.getCategory();
        this.price = product.getPrice();
        this.stockQuantity = product.getStockQuantity();
        this.minutesToMake = product.getMinutesToMake();
        this.profitMargin = product.getProfitMargin();
        this.createdAt = product.getCreatedAt();
        this.updatedAt = product.getUpdatedAt();
    }

    // Getters and setters


    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        this.category = category;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public Integer getMinutesToMake() {
        return minutesToMake;
    }

    public void setMinutesToMake(Integer minutesToMake) {
        this.minutesToMake = minutesToMake;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Double getProfitMargin() {
        return profitMargin;
    }

    public void setProfitMargin(Double profitMargin) {
        this.profitMargin = profitMargin;
    }

    @Override
    public String toString() {
        return "Κωδικός Προϊόντος: " + getProductId() + ", Όνομα: " + getName() +
                ", Τιμή: " + getPrice() + "Απόθεμα: " + getStockQuantity();
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;

        if (!(obj instanceof Product that)) return false;
        return Objects.equals(getProductId(), that.getProductId())
                && Objects.equals(getName(), that.getName())
                && Objects.equals(getPrice(), that.getPrice())
                && Objects.equals(getDescription(), that.getDescription())
                && Objects.equals(getWeight(), that.getWeight())
                && Objects.equals(getStockQuantity(), that.getStockQuantity())
                && Objects.equals(getMinutesToMake(), that.getMinutesToMake())
                && Objects.equals(getCategory(),that.getCategory())
                && Objects.equals(getProfitMargin(), that.getProfitMargin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getProductId(),getPrice(),getWeight(),
                getStockQuantity(),getMinutesToMake(),getCategory(),
                getDescription(), getProfitMargin());
    }
}
